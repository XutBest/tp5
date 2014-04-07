package ligueBaseballServlet;

import java.sql.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import ligueBaseball.GestionLigueBaseball;
import ligueBaseball.LigueBaseballException;


/**
 * Classe pour login syst�me de gestion de biblioth�que
 * <P>
 * Syst�me de gestion de biblioth�que &copy; 2004 Marc Frappier, Universit� de
 * Sherbrooke
 */

public class Login extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			// fermer la session si elle a d�j� �t� ouverte lors d'un appel
			// pr�c�dent
			// survient lorsque l'usager recharge la page login.jsp
			if (session.getAttribute("etat") != null) {
				// pour d�boggage seulement : afficher no session et information
				System.out
						.println("GestionLigueBaseball: session déja crée; id="
								+ session.getId());
				// la m�thode invalidate appelle le listener
				// BiblioSessionListener; cette classe est charg�e lors du
				// d�marrage de
				// l'application par le serveur (voir le fichier web.xml)
				session.invalidate();
				session = request.getSession();
				System.out.println("GestionLigueBaseball: session invalid�e");
			}

			// lecture des param�tres du formulaire login.jsp
			String userIdOracle = request.getParameter("userIdBD");
			String motDePasseOracle = request.getParameter("motDePasseBD");
			String serveur = request.getParameter("serveur");
			String adresseIP = request.getParameter("adresseIP");
			String bd = request.getParameter("bd");

			// ouvrir une connexion avec la BD et cr�er les gestionnaires
			System.out.println("Login: session id="
					+ session.getId());
			GestionLigueBaseball baseball = new GestionLigueBaseball(serveur,adresseIP,bd,userIdOracle, motDePasseOracle);

			// stocker l'instance de GestionLigue Baseball au sein de la session
			// de l'utilisateur
			session.setAttribute("baseball", baseball);

			// afficher le menu membre en appelant la page selectionMembre.jsp
			// tous les JSP sont dans /WEB-INF/
			// ils ne peuvent pas �tre appel�s directement par l'utilisateur
			// seulement par un autre JSP ou un servlet
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/menu.jsp");
			dispatcher.forward(request, response);
			session.setAttribute("etat", new Integer(BaseballConstantes.CONNECTE));
		} catch (SQLException e) {
			List listeMessageErreur = new LinkedList();
			listeMessageErreur.add("Erreur de connexion au serveur");
			listeMessageErreur.add(e.toString());
			request.setAttribute("listeMessageErreur", listeMessageErreur);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
			// pour d�boggage seulement : afficher tout le contenu de
			// l'exception
			e.printStackTrace();
		} catch (LigueBaseballException e) {
			e.printStackTrace();
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e
					.toString());
		}
	}

	// Dans les formulaire, on utilise la m�thode POST
	// donc, si le servlet est appel� avec la m�thode GET
	// on retourne un page d'erreur, afin de ne pas permettre
	// � l'utilisateur d'appeler un servler directement
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.sendError(response.SC_INTERNAL_SERVER_ERROR, "Acc�s
		// invalide");
		doPost(request, response);
	}

} // class
