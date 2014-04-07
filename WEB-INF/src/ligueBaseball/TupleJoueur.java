package ligueBaseball;

import java.sql.Date;

public class TupleJoueur {
	String Nom;
	String Prenom;
	int JoueurId;
	String EquipeNom;
	Date DateDebut;
	int Numero;
	
	/**
	 * structure de donnee pour les Joueur
	 * @param joueurId
	 * @param nom
	 * @param prenom
	 */
	public TupleJoueur(int joueurId, String nom, String prenom)
	{
		Nom = nom;
		Prenom = prenom;
		JoueurId = joueurId;
		EquipeNom = "";
	}

	/**
	 * structure de donnee pour les Joueurs
	 * @param joueurId
	 * @param nom
	 * @param prenom
	 * @param equipeNom
	 */
	public TupleJoueur(int joueurId, String nom, String prenom,String equipeNom)
	{
		Nom = nom;
		Prenom = prenom;
		JoueurId = joueurId;
		EquipeNom = equipeNom;
	}
	
	public TupleJoueur(String nom, String prenom, int numero, Date date)
	{
		Nom = nom;
		Prenom = prenom;
		Numero = numero;
		DateDebut = date;
	}
}
