<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="CreerMatch" METHOD="POST">
1.Nom de l'equipe local (obligatoire) : <INPUT TYPE="TEXT" NAME="equipeLocal"
  VALUE="">
<BR>
2.Nom de l'equipe visiteur (obligatoire) : <INPUT TYPE="TEXT" NAME="equipeVisiteur"
  VALUE="">
 <BR>
 3.Date du match (obligatoire) : <INPUT TYPE="TEXT" NAME="date"
  VALUE="">
 <BR>
 4.Heure du match (obligatoire) : <INPUT TYPE="TEXT" NAME="heure"
  VALUE="">
 <BR>
<BR>
<INPUT TYPE="SUBMIT" NAME="creerMatch"VALUE="Ajouter le match à la base de donn&#233;e">
</FORM>
</CENTER>
<BR>¸
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 