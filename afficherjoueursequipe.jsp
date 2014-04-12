<%@ page import="java.util.*,java.text.*,ligueBaseball.*" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<FORM ACTION="AfficherJoueursEquipe" METHOD="POST">
1.Nom de l'equipe (si non rempli, tous les joueurs seront affiches) : <INPUT TYPE="TEXT" NAME="nomEquipe"
  VALUE="">
<BR>
<INPUT TYPE="SUBMIT" NAME="afficherJoueurs"VALUE="Afficher Joueurs">
<BR>
<BR>
<%
  // calcul de la liste de prêts du membre
  //if (request.getParameter("supprimerEquipe") != null){
  	GestionLigueBaseball ligueBaseball = (GestionLigueBaseball) session.getAttribute("baseball");
  	String content = "";
  	try{
  	if (request.getParameter("nomEquipe") == null){
  %>
  		<%= ligueBaseball.gestionJoueur.getJoueur()%>
  <%
	}else{
	%>
		<%=ligueBaseball.gestionJoueur.getJoueur(request.getParameter("nomEquipe"))%>
	<%
	}
	}
	catch(LigueBaseballException e){
		List listeMessageErreur = new LinkedList();
		listeMessageErreur.add(e.getMessage());
		request.setAttribute("listeMessageErreur", listeMessageErreur);
	}
 //}
%>
</FORM>
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %> 
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 
