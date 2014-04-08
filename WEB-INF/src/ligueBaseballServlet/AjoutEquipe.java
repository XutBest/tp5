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
public class AjoutEquipe extends HttpServlet {
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
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ajoutequipe.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}
		
		if (request.getParameter("creerEquipe") != null)
			traiterCreerEquipe(request, response);
	}
	
	public void traiterCreerEquipe(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			if (request.getParameter("nomEquipe") == null || request.getParameter("nomEquipe").isEmpty())
				throw new LigueBaseballException("Impossible de creer une equipe sans nom d'equipe");
			else{
				String nomEquipe = request.getParameter("nomEquipe");
				if(request.getParameter("terrainEquipe") == null || request.getParameter("terrainEquipe").isEmpty())
					GestionLigueBaseball.gestionEquipe.ajout(nomEquipe);
				else{
					if(request.getParameter("adresseTerrainEquipe") == null || request.getParameter("adresseTerrainEquipe").isEmpty()){
						throw new LigueBaseballException("Impossible de mettre un terrain sans adresse: seul le nom d'equipe sera pris en compte.");
					}
					else{
						String nomTerrain = request.getParameter("terrainEquipe");
						String adresseTerrain = request.getParameter("adresseTerrainEquipe");
						GestionLigueBaseball.gestionEquipe.ajout(nomEquipe, nomTerrain,adresseTerrain);
					}
						
				}
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("/menu.jsp");
				dispatcher.forward(request, response);
			}
		} catch (LigueBaseballException e) {
			
		} catch (Exception e) {
		
		}
	}

} // class
