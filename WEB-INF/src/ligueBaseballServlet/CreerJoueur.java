package ligueBaseballServlet;

import java.io.IOException;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ligueBaseball.GestionLigueBaseball;
import ligueBaseball.LigueBaseballException;

/**
 * Classe pour login syst�me de gestion de biblioth�que
 * <P>
 * Syst�me de gestion de biblioth�que &copy; 2004 Marc Frappier, Universit� de
 * Sherbrooke
 */

@SuppressWarnings("serial")
public class CreerJoueur extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}
	
	// Dans les formulaire, on utilise la m�thode POST
	// donc, si le servlet est appel� avec la m�thode GET
	// on retourne un page d'erreur, afin de ne pas permettre
	// � l'utilisateur d'appeler un servler directement
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.sendError(response.SC_INTERNAL_SERVER_ERROR, "Acc�s
		// invalide");
		//doPost(request, response);
		if(request.getSession().getAttribute("etat") != null){
			if (request.getParameter("creerJoueur") != null)
				traiterCreerJoueur(request, response);
			else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("/creerjoueur.jsp");
				dispatcher.forward(request, response);
			}
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	public void traiterCreerJoueur(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String joueurNom = request.getParameter("nomJoueur");
			String joueurPrenom = request.getParameter("prenomJoueur");
			String equipe = request.getParameter("equipeJoueur");
			
			if(request.getParameter("nomJoueur") == null || request.getParameter("nomJoueur").isEmpty() || request.getParameter("prenomJoueur") == null || request.getParameter("prenomJoueur").isEmpty())
				throw new LigueBaseballException("Impossible de creer un joueur sans nom ou prenom");
			else{
				if(equipe == null || equipe.isEmpty())
				{
					GestionLigueBaseball.gestionJoueur.ajout(joueurNom, joueurPrenom);
				}
				else
				{
					String joueurNumeroString = request.getParameter("numeroJoueur");
					if(joueurNumeroString == null || joueurNumeroString.isEmpty())
					{
						throw new LigueBaseballException("Impossible de creer un joueur avec une equipe sans numero");
					}
					else
					{
						int numero = Integer.parseInt(joueurNumeroString);
						String dateString = request.getParameter("DateDebutJoueur");
						
						if(dateString == null || dateString.isEmpty())
						{
							GestionLigueBaseball.gestionJoueur.ajout(joueurNom, joueurPrenom, equipe, numero);
						}
						else
						{
							Date date = Date.valueOf(dateString);
							GestionLigueBaseball.gestionJoueur.ajout(joueurNom, joueurPrenom, equipe, numero,date);
						}
					}
				}
				
				
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/menu.jsp");
				dispatcher.forward(request, response);
			}
		} catch (LigueBaseballException e) {
			List listeMessageErreur = new LinkedList();
			listeMessageErreur.add(e.getMessage());
			request.setAttribute("listeMessageErreur", listeMessageErreur);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/creerjoueur.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
		
		}
	}

} // class
