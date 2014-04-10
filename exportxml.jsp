<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="ExportXml" METHOD="POST">
1.Nom de l'equipe : <INPUT TYPE="TEXT" name="nomEquipe" value="">
<BR>
<BR>
<INPUT TYPE="SUBMIT" NAME="submitXml"VALUE="Exporter XML">
</FORM>
<BR>
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 