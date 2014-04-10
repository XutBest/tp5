<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="ArbitrerMatch" METHOD="POST">
1.Nom de l'equipe local (obligatoire) : <INPUT TYPE="TEXT" NAME="equipeLocal"
  VALUE="">
<BR>
2.Prenom de l'equipe visiteur (obligatoire) : <INPUT TYPE="TEXT" NAME="equipeVisiteur"
  VALUE="">
 <BR>
 3.Date du match (obligatoire) : <INPUT TYPE="TEXT" NAME="date"
  VALUE="">
 <BR>
 4.Heure du match (obligatoire) : <INPUT TYPE="TEXT" NAME="heure"
  VALUE="">
 <BR>
 5.Nom de l'arbitre (obligatoire) : <INPUT TYPE="TEXT" NAME="nomArbitre"
  VALUE="">
<BR>
6.Prenom de l'arbitre (obligatoire) : <INPUT TYPE="TEXT" NAME="prenomArbitre"
  VALUE="">
 <BR>
<INPUT TYPE="SUBMIT" NAME="arbitrerMatch"VALUE="arbitrerMatch">
</FORM>
</CENTER>
<BR>
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 