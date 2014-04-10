<%@ page import="java.util.*,java.text.*,ligueBaseball.*" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<% 
GestionLigueBaseball ligueBaseball = (GestionLigueBaseball) session.getAttribute("baseball");
%>
<%= ligueBaseball.gestionEquipe.getEquipes() %>
<BR>
<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
		<jsp:include page="/WEB-INF/messageErreur.jsp" />
		<BR>

<%@ include file="/WEB-INF/jspf/footer.jspf" %> 
