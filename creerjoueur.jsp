<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ include file="/WEB-INF/jspf/header.jspf" %> 
<BR>
<FORM ACTION="CreerJoueur" METHOD="POST">
1.Nom du joueur (obligatoire) : <INPUT TYPE="TEXT" NAME="nomJoueur"
  VALUE="">
<BR>
2.Prenom du joueur (obligatoire) : <INPUT TYPE="TEXT" NAME="prenomJoueur"
  VALUE="">
 <BR>
3.Equipe du joueur : <INPUT TYPE="TEXT" NAME="equipeJoueur"
  VALUE="">
<BR>
4.Numero du joueur [obligatoire si une equipe est specidier] : <INPUT TYPE="TEXT" NAME="numeroJoueur"
  VALUE="">
<BR>
5.Date de debut du joueur [doit avoir une Equipe]: <INPUT TYPE="TEXT" NAME="DateDebutJoueur"
  VALUE="">
<BR>
<BR>
<INPUT TYPE="SUBMIT" NAME="creerEquipe"VALUE="CreerEquipe">
</FORM>
</CENTER>
<BR>
<%@ include file="/WEB-INF/jspf/messageErreur.jspf" %>
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 