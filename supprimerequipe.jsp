<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="SupprimerEquipe" METHOD="POST">
1.Nom de l'equipe (obligatoire) : <INPUT TYPE="TEXT" NAME="nomEquipe"
  VALUE="">
<BR>
<INPUT TYPE="SUBMIT" NAME="supprimerEquipe"VALUE="Supprimer Equipe">
</FORM>
</CENTER>
<BR>
<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
		<jsp:include page="/WEB-INF/messageErreur.jsp" />
		<BR>

<%@ include file="/WEB-INF/jspf/footer.jspf" %> 