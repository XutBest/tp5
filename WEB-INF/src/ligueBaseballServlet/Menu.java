package ligueBaseballServlet;

import java.io.IOException;

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
public class Menu extends HttpServlet {
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
		if(request.getParameter("addTeam") != null){
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/ajoutequipe.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("showTeams") != null){
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/afficherequipes.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("deleteTeam") != null){
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/supprimerequipe.jsp");
			dispatcher.forward(request, response);
		}
	}

} // class
