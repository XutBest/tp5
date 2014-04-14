<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="AfficherResultats" METHOD="POST">
1.Entrez la date ou l'&#233;quipe: <INPUT TYPE="TEXT" NAME="dateOuEquipe" VALUE="">
<BR>
<INPUT TYPE="SUBMIT" NAME="afficherMatch"VALUE="Afficher les match">
</FORM>

<BR>
<% 	GestionLigueBaseball ligueBaseball = (GestionLigueBaseball) session.getAttribute("baseball");
  	try{
	  	if (request.getParameter("dateOuEquipe") == null || request.getParameter("dateOuEquipe").isEmpty()){ %>
	  		<%= ligueBaseball.gestionMatch.afficherResultatDate() %>
	<%
		}else{ %>
			<%= ligueBaseball.gestionMatch.afficherResultat(request.getParameter("dateOuEquipe")) %>
	<%
		}
			
	}catch(LigueBaseballException e){
		List listeMessageErreur = new LinkedList();
		listeMessageErreur.add(e.getMessage());
		request.setAttribute("listeMessageErreur", listeMessageErreur);
	}
	
	%>



<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 
