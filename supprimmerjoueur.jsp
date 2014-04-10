<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="SupprimerJoueur" METHOD="POST">
1.Nom du joueur (obligatoire) : <INPUT TYPE="TEXT" NAME="nomJoueur"
  VALUE="">
<BR>
2.Prenom du joueur (obligatoire) : <INPUT TYPE="TEXT" NAME="prenomJoueur"
  VALUE="">
<BR>
<INPUT TYPE="SUBMIT" NAME="supprimerJoueur"VALUE="Supprimer Joueur">
</FORM>
</CENTER>
<BR>
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 