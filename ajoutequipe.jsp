<%@ page import="java.util.*,java.text.*" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Gestion de baseball</TITLE>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=ISO-8859-1">
<META NAME="author" CONTENT="Marc Frappier">
<META NAME="description"
CONTENT="page d'accueil Gestion de baseball">
</HEAD>
<BODY>
<CENTER>
<H1>Gestion de baseball</H1>
<BR>
<FORM ACTION="AjoutEquipe" METHOD="POST">
1.Nom de l'equipe (obligatoire) : <INPUT TYPE="TEXT" NAME="nomEquipe"
  VALUE="">
2.Terrain de l'equipe : <INPUT TYPE="TEXT" NAME="terrainEquipe"
  VALUE="">
3.Adresse de l'equipe (obligatoire avec 2) : <INPUT TYPE="TEXT" NAME="adresseTerrainEquipe"
  VALUE="">
<BR>
<BR>
<INPUT TYPE="SUBMIT" NAME="creerEquipe"VALUE="OK">
</FORM>
</CENTER>
<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
<jsp:include page="/WEB-INF/messageErreur.jsp" />
<BR>
<%-- Appel du servlet Logout pour revenir au menu login--%>
<a href="Menu">Retour au menu</a>
<BR>
Date et heure : <%= DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CANADA_FRENCH).format(new java.util.Date()) %>
</BODY>
</HTML>