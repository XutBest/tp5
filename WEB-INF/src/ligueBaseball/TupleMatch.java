package ligueBaseball;

import java.sql.*;

public class TupleMatch {
	
	int PointageLocal;
	int PointageVisiteur;
	String ListeArbitres;
	Date matchDate;
	Time matchHeure;
	String nomEquipeLocal;
	String nomEquipeVisiteur;
	/**
	 * structure de donnee pour les Match
	 * @param pointageLocal
	 * @param pointageVisiteur
	 * @param listeArbitres
	 */
	public TupleMatch(int pointageLocal, int pointageVisiteur, Date matchDate,Time matchHeure,String equipeLocal,String equipeVisiteur, String listeArbitres)
	{
		this.matchDate = matchDate;
		this.matchHeure = matchHeure ;
		PointageLocal = pointageLocal;
		PointageVisiteur = pointageVisiteur;
		ListeArbitres = listeArbitres;
		nomEquipeLocal=equipeLocal;
		nomEquipeVisiteur=equipeVisiteur;
	}
}
