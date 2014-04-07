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
</CENTER>
</FORM>
<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
<jsp:include page="/WEB-INF/messageErreur.jsp" />
<BR>
<%-- Appel du servlet Logout pour revenir au menu login--%>
<BR>
Date et heure : <%= DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CANADA_FRENCH).format(new java.util.Date()) %>
</BODY>
</HTML>