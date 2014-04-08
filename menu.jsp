<%@ page import="java.util.*,java.text.*" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ include file="/WEB-INF/jspf/header.jspf" %> 

<a class="btn btn-default" href="ajoutequipe">Creer Equipe</a>
<BR>
<a class="btn btn-default" href="afficherEquipe">Afficher Equipes</a>
<BR>
<a class="btn btn-default" href="supprimerEquipe">Supprimer Equipe</a>
<BR>
<a class="btn btn-default" href="creerJoueur">Creer joueur</a>
<BR>
<a class="btn btn-default" href="afficherJoueur">Afficher joueur equipe</a>
<BR>
<a class="btn btn-default" href="supprimerJoueur">Suprimer joueur</a>
<BR>
<a class="btn btn-default" href="creerMatch">Creer match</a>
<BR>
<a class="btn btn-default" href="creerArbitre">Creer arbitre</a>
<BR>
<a class="btn btn-default" href="afficherArbitre">Afficher arbitre</a>
<BR>
<a class="btn btn-default" href="arbitrerMatch">Assigner un arbitre a un match</a>
<BR>
<a class="btn btn-default" href="entrerResultat">Entrer les resultats</a>
<BR>
<a class="btn btn-default" href="afficherResultats">Afficher resultats</a>



<BR>
<a class="btn btn-default" href="ExportXml">Exporter Equipe XML</a>
<BR>
<a class="btn btn-default" href="ImportXml">Importer Equipe XML</a>

<%-- inclusion d'une autre page pour l'affichage des messages d'erreur--%>
<jsp:include page="/WEB-INF/messageErreur.jsp" />
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 
