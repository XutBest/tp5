<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<FORM ACTION="AfficherJoueursEquipe" METHOD="POST">
1.Nom de l'equipe (si non rempli, tous les joueurs seront affiches) : <INPUT TYPE="TEXT" NAME="nomEquipe" VALUE="">
<BR>
<INPUT TYPE="SUBMIT" NAME="afficherJoueurs"VALUE="Afficher Joueurs">
</FORM>
<BR>
<%
  	GestionLigueBaseball ligueBaseball = (GestionLigueBaseball) session.getAttribute("baseball");
  	try{
  	if (request.getParameter("nomEquipe") == null || request.getParameter("nomEquipe").isEmpty()){
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
	}%>
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %> 
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 
