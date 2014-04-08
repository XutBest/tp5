<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Gestion de baseball</TITLE>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=ISO-8859-1">
<META NAME="author" CONTENT="Marc Frappier">
<META NAME="description" CONTENT="page d'accueil Gestion de baseball">
</HEAD>
<BODY>
<CENTER>
<H1>Gestion de baseball</H1>
<BR>
<FORM ACTION="AjoutEquipe" METHOD="POST">
1.Nom de l'equipe (obligatoire) : <INPUT TYPE="TEXT" NAME="nomEquipe"
  VALUE="">
<BR>
2.Terrain de l'equipe : <INPUT TYPE="TEXT" NAME="terrainEquipe"
  VALUE="">
<BR>
3.Adresse de l'equipe (obligatoire avec 2) : <INPUT TYPE="TEXT" NAME="adresseTerrainEquipe"
  VALUE="">
<BR>
<BR>
<INPUT TYPE="SUBMIT" NAME="creerEquipe"VALUE="CreerEquipe">
</FORM>
</CENTER>
<BR>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 