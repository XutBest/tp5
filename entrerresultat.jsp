<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="EntrerResultat" METHOD="POST">
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
 5.Pointage locale (obligatoire) : <INPUT TYPE="TEXT" NAME="pointLocal"
  VALUE="">
<BR>
6.Pointage visiteur (obligatoire) : <INPUT TYPE="TEXT" NAME="pointVisiteur"
  VALUE="">
 <BR>
<INPUT TYPE="SUBMIT" NAME="entrerResultat"VALUE="entrerresultat">
</FORM>
</CENTER>
<BR>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 