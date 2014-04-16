<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<% 
GestionLigueBaseball ligueBaseball = (GestionLigueBaseball) session.getAttribute("baseball");
%>
<%= ligueBaseball.gestionEquipe.getEquipes() %>
<BR>
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %> 
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 
