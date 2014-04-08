<%@ page import="java.util.*,java.text.*" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Gestion de baseball</TITLE>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=ISO-8859-1">
<META NAME="author" CONTENT="Mathieu Lavoie">
<META NAME="description"
CONTENT="page d'accueil Gestion de baseball">
</HEAD>
<BODY>
<FORM ACTION="Menu" METHOD="POST" role="form">
<CENTER>
<H1>Gestion de baseball</H1>
<INPUT TYPE="SUBMIT" NAME="addTeam" VALUE="Creer Equipe" class="btn btn-default" >
<BR>
<INPUT TYPE="SUBMIT" NAME="showTeams" VALUE="Afficher Equipes" class="btn btn-default" >
<BR>
<INPUT TYPE="SUBMIT" NAME="deleteTeam" VALUE="Supprimer Equipe" class="btn btn-default" >
<BR>
<INPUT TYPE="SUBMIT" NAME="exportXml" VALUE="Exporter Equipe XML" class="btn btn-default" >
<BR>
<INPUT TYPE="SUBMIT" NAME="importXml" VALUE="Importer Equipe XML" class="btn btn-default" >
</CENTER>
</FORM>
<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
<jsp:include page="/WEB-INF/messageErreur.jsp" />
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 
