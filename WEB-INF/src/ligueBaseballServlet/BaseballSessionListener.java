package ligueBaseballServlet;
import javax.servlet.http.*;


import java.sql.*;

import ligueBaseball.GestionLigueBaseball;

/** Classe pour gestion des sessions
 *  <P>
 * Syst�me de gestion de biblioth�que
 *  &copy; 2004 Marc Frappier, Universit� de Sherbrooke
 */

public class BaseballSessionListener implements HttpSessionListener
{
public void sessionCreated(HttpSessionEvent se)
{
}

public void sessionDestroyed(HttpSessionEvent se)
{
System.out.println("BaseballSessionListener " + se.getSession().getId());
GestionLigueBaseball ligueBaseball = (GestionLigueBaseball) se.getSession().getAttribute("baseball");
if (ligueBaseball != null)
  {
  System.out.println("connexion =" + ligueBaseball.cx);
  try {ligueBaseball.fermer();}
  catch (SQLException e)
    {
    System.out.println("Impossible de fermer la connexion");
    e.printStackTrace();
    }
  }
else
  System.out.println("ligue baseball inaccessible.");
}
}
