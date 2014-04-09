<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="CreerMatch" METHOD="POST">
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
<BR>
<INPUT TYPE="SUBMIT" NAME="creerMatch"VALUE="CreerMatch">
</FORM>
</CENTER>
<BR>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 