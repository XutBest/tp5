<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="SupprimerEquipe" METHOD="POST">
1.Nom de l'equipe (obligatoire) : <INPUT TYPE="TEXT" NAME="nomEquipe"
  VALUE="">
<BR>
<INPUT TYPE="SUBMIT" NAME="supprimerEquipe"VALUE="Supprimer l'equipe">
</FORM>
</CENTER>
<BR>

<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %> 
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 