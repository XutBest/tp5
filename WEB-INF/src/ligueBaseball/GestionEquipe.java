package ligueBaseball;

import java.sql.*;
import java.util.List;
import java.io.*;

import org.xml.sax.helpers.XMLReaderFactory;

import java.util.Iterator;

import javax.sql.RowSetInternal;
import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.spi.XmlReader;

import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.output.*;

/*
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;
*/

/**
 *  * @author Mathieu Lavoie, Alex Provencher et Vincent Gagnon
 * classe intermedaire entre l'usager et les object qui parle a la base de donnee.
 */
public class GestionEquipe {

	private Equipe equipe;
	private Terrain terrain;
	private Connexion cx;

	/**
	 * Creation d'une instance
	 */
	public GestionEquipe(Equipe equipe, Terrain terrain)
			throws LigueBaseballException {
		this.cx = equipe.getConnexion();
		this.equipe = equipe;
		this.terrain = terrain;
	}

	
	public void exportXml(String equipeNom) throws SQLException, IOException
	{
		//Nous allons commencer notre arborescence en créant la racine XML 
		Element racine = new Element("equipe");
		//On crée un nouveau Document JDOM basé sur la racine 
		Document document = new Document(racine);
		creeArbre(document, equipeNom);
	}
	
	private void creeArbre(Document document,String equipe) throws SQLException, IOException
	{
		Element racine = document.getRootElement();
		Element Equipe = new Element("equipe");
		Equipe.setAttribute(new Attribute("nom",equipe));
		
		Element Terrain = new Element("terrain");
		Terrain.setAttribute(new Attribute("nom",this.equipe.getTerrainNom(equipe)));
		Terrain.setAttribute(new Attribute("adresse",this.equipe.getTerrainAdresse(equipe)));
		Element Joueurs = new Element("Joueurs");
		
		List<TupleJoueur> lj = this.equipe.equipeXML(equipe);
		
		for(TupleJoueur j : lj)
		{
			Element e = new Element("joueur");
			Attribute nom = new Attribute("nom",j.Nom);
			Attribute prenom =new Attribute("prenom", j.Prenom);
			Attribute numero =new Attribute("nuemro", Integer.toString(j.Numero));
			Attribute dateDebut =new Attribute("dateDebut", j.DateDebut.toString());
			e.setAttribute(nom);
			e.setAttribute(prenom);
			e.setAttribute(numero);
			e.setAttribute(dateDebut);
			Joueurs.addContent(e);
		}
		
		//shoot out xml
		XMLOutputter output = new XMLOutputter();
		output.setFormat(Format.getPrettyFormat());
		output.output(document, new FileWriter("c:\\"));
	}
	
	
	public void importerXML(String path)
	{
		SAXBuilder sb = new SAXBuilder();
		try
		{
			Document document = sb.build(new File(path));
			Element racine = document.getRootElement();
			Element equipe = racine.getChild("equipe");
			Element terrain = racine.getChild("terrain");
			
			String equipeNom = equipe.getAttributeValue("nom");
			String terrainNom = terrain.getAttributeValue("nom");
			String adresse = terrain.getAttributeValue("adresse");
			//add in bd team and terrain
			
			ajout(equipeNom,terrainNom,adresse);
			
			Element joueurs = racine.getChild("joueurs");
			
			List<Element> listJoueurs = joueurs.getChildren();
			for(Element j : listJoueurs)
			{
				String nom = j.getAttribute("nom").getValue();
				String prenom = j.getAttribute("prenom").getValue();
				int numero = j.getAttribute("numero").getIntValue();
				Date date = Date.valueOf( j.getAttribute("dateDebut").getValue());
				//insert in bd joueur if not exist
				GestionLigueBaseball.gestionJoueur.ajout(nom,prenom,equipeNom,numero,date);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception: ");
			e.printStackTrace();
		}
	}
	
	/**
	 * Ajout d'une nouvelle equipe dans la base de donnees. S'il existe deja,
	 * une exception est levee.
	 */
	public void ajout(String equipeNom) throws SQLException,
			LigueBaseballException, Exception {
		try {
			if (equipe.existe(equipeNom) != -1)
				throw new LigueBaseballException("Equipe existe deja: "
						+ equipeNom);
			int equipeId = equipe.maxJoueur();
			equipe.ajoutEquipe(equipeId, equipeNom);
			cx.commit();
		} catch (Exception e) {
			cx.rollback();
		}
	}

	/**
	 * Ajout d'une nouvelle equipe dans la base de donnees. S'il existe deja,
	 * une exception est levee.
	 */
	public void ajout(String equipeNom, String nomTerrain, String adresseTerrain)
			throws SQLException, LigueBaseballException, Exception {
		try {
			if (equipe.existe(equipeNom) != -1)
				throw new LigueBaseballException("Equipe existe deja: "
						+ equipeNom);
			if (!terrain.existe(nomTerrain)) {
				int terrainId = terrain.maxTerrain();
				terrain.ajoutTerrain(terrainId, nomTerrain, adresseTerrain);
			}
			int equipeId = equipe.maxJoueur();
			int terrainId = terrain.getTerrain(nomTerrain);
			equipe.ajoutEquipe(equipeId, terrainId, equipeNom);
			cx.commit();
		} catch (Exception e) {
			cx.rollback();
		}
	}

	/**
	 * Supprimer une equipe.
	 */
	public void supprimer(String equipeNom) throws SQLException,
			LigueBaseballException, Exception {
		try {
			if (equipe.existe(equipeNom) == -1)
				throw new LigueBaseballException("Equipe inexistante: "
						+ equipeNom);
			else{
				if (equipe.existeJoueurs(equipeNom)) {
					throw new LigueBaseballException(
							"Impossible de supprimer cette equipe ( " + equipeNom
									+ " ) car il y a des joueurs associes a cette equipe.");
				}
				else
					/* Suppression de l'equipe. */
					equipe.suppressionEquipe(equipeNom);
			}
			cx.commit();
		} catch (Exception e) {
			cx.rollback();
		}
	}

	/**
 * 
 */
	/**
	 * fait les verification et envoie le mesage de rajouter l'equipe qui corespond aux parametres
	 */
	public String getEquipes() {
		String listeEquipes= "";
		try {
			listeEquipes += "ID, Equipe <br>";
			List<TupleEquipe> listEquipes = equipe.getEquipes();
			for (TupleEquipe tupleEquipe : listEquipes) {
				listeEquipes+= tupleEquipe.equipeid + "," + tupleEquipe.equipenom +"<br>";
			}
		} catch (SQLException e) {
		    listeEquipes = "Erreur usager: l'equipe existe pas";
		}
		return listeEquipes;
	}
}
