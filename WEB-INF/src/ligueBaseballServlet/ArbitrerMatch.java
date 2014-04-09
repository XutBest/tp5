package ligueBaseballServlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;

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
public class ArbitrerMatch extends HttpServlet {
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
			RequestDispatcher dispatcher = request.getRequestDispatcher("/arbitrermatch.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}
		
		if (request.getParameter("arbitrerMatch") != null)
			traiterArbitrerMatch(request, response);
	}
		
	public void traiterArbitrerMatch(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String local = request.getParameter("equipeLocal");
			String visiteur = request.getParameter("equipeVisiteur");
			String date  = request.getParameter("date");
			String heure = request.getParameter("heure");
			String nomArbitre = request.getParameter("nomArbitre");
			String prenomArbitre = request.getParameter("prenomArbitre");
			
			if(local == null || local.isEmpty() || visiteur == null || visiteur.isEmpty())
				throw new LigueBaseballException("Impossible de creer un match sans equipes");
			else if (date == null || date.isEmpty() || heure == null || heure.isEmpty())
				throw new LigueBaseballException("Impossible de creer un match sans date et heure");
			else if(nomArbitre == null || nomArbitre.isEmpty() || prenomArbitre == null || prenomArbitre.isEmpty())
				throw new LigueBaseballException("Impossible d'arbitrer un match sans arbitre (nom & prenom)");
			else{
				GestionLigueBaseball.gestionArbitre.arbitrerMatch(Date.valueOf(date), Time.valueOf(heure), local, visiteur, nomArbitre,prenomArbitre);
				
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/menu.jsp");
				dispatcher.forward(request, response);
			}
		} catch (LigueBaseballException e) {
			
		} catch (Exception e) {
			//bad date format
		}
	}

}

