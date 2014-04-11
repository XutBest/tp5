<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="AjoutEquipe" METHOD="POST">
1.Nom de l'equipe (obligatoire) : <INPUT TYPE="TEXT" NAME="nomEquipe"
  VALUE="">
<BR>
2.Terrain de l'equipe : <INPUT TYPE="TEXT" NAME="terrainEquipe"
  VALUE="">
<BR>
3.Adresse de l'equipe (obligatoire avec 2) : <INPUT TYPE="TEXT" NAME="adresseTerrainEquipe"
  VALUE="">
<BR>
<BR>
<INPUT TYPE="SUBMIT" NAME="creerEquipe"VALUE="Creer l'equipe">
</FORM>
</CENTER>
<BR>
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %>		
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 