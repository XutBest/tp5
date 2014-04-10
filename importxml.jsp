<%@ include file="/WEB-INF/jspf/header.jspf" %> 

<BR>
<FORM ACTION="ImportXml" METHOD="POST">
1.Path : <INPUT TYPE="TEXT" NAME="path"  VALUE="">
<BR>
<BR>
<INPUT TYPE="SUBMIT" NAME="submitXml"VALUE="importer XML">
</FORM>
<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
		<jsp:include page="/WEB-INF/messageErreur.jsp" />
		<BR>

<%@ include file="/WEB-INF/jspf/footer.jspf" %> 