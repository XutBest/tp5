<%@ page import="java.util.*,java.text.*" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ include file="/WEB-INF/jspf/header.jspf" %> 

<a class="btn btn-default" href="ajoutequipe">Creer Equipe</a>
<BR>
<a class="btn btn-default" href="afficherEquipe">Afficher Equipes</a>
<BR>
<a class="btn btn-default" href="supprimerequipe">Supprimer Equipe</a>
<BR>
<a class="btn btn-default" href="ExportXml">Exporter Equipe XML</a>
<BR>
<a class="btn btn-default" href="ImportXml">Importer Equipe XML</a>

<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
<jsp:include page="/WEB-INF/messageErreur.jsp" />
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 
