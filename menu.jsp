<%@ include file="/WEB-INF/jspf/header.jspf" %> 

  <script src="//code.jquery.com/jquery-1.9.1.js"></script>
  <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#accordion" ).accordion({
      heightStyle: "content"
    });
  });</script>

<div id="accordion">
	<h3>Creer equipe</h3>
	<div>
	<form action="Menu" METHOD="GET" class="form-horizontal">
	  <div class="control-group">
	    <label class="control-label" for="nomEquipeCreer">Nom equipe</label>
	    <div class="controls">
	      <input type="text" id="nomEquipeCreer" placeholder="" VALUE="">
	    </div>
	  </div>
	  <div class="control-group">
	    <label class="control-label" for="terrainCreer">Nom terrain*</label>
	    <div class="controls">
	      <input type="text" id="terrainCreer" placeholder="">
	    </div>
	  </div>
	  <div class="control-group">
	    <label class="control-label" for="adresseCreer">Adresse Terrain*</label>
	    <div class="controls">
	      <input type="text" id="adresseCreer" placeholder="">
	    </div>
	  </div>
	  <div class="control-group">
	    <div class="controls">
	      <button type="submit" class="btn btn-inverse" name="creerEquipe">Creer l'equipe </button>
	    </div>
	  </div>
	</form>
Need : nom equipe, nom-terrain*, adresse-terrain*
	</div>
  <h3>Afficher equipe</h3>
  <div>
    <p>
  	  <%= (new ligueBaseball.GestionLigueBaseball("postgres", "localhost", "postgres", "postgres", "superstar")).gestionEquipe.getEquipes()%>
    </p>
  </div>
	<h3>Supprimer equipe</h3>
		<div>
			<p>
				Pour supprimer une equipe, vous devez supprimer tout les joueurs en faisant partie. <br>
				Si des joueurs font partie de l'equipe que vous tentez de supprimer, aucune action ne sera prise. <br>
				<div class="input-append">
	  				<input class="span2" id="nomEquipeSupprimer" type="text" placeholder="Nom de l'equipe">
	  				<button class="btn" type="btn btn-inverse">Effacer l'equipe</button>
				</div>
				Nom d'equipe  
			</p>
		</div>
  	<h3>Creer joueur</h3>
  		<div>
			<form action="creerJoueur" METHOD="POST" class="form-horizontal">
			  <div class="control-group">
			    <label class="control-label" for="prenomJoueurCreer">Prenom Joueur</label>
			    <div class="controls">
			      <input type="text" id="prenomJoueurCreer" placeholder="">
			    </div>
			  </div>
			  <div class="control-group">
			    <label class="control-label" for="nomJoueurCreer">Nom Joueur</label>
			    <div class="controls">
			      <input type="text" id="nomJoueurCreer" placeholder="">
			    </div>
			  </div>
			  <div class="control-group">
			    <label class="control-label" for="nomEquipeCreerJoueur">Nom Equipe*</label>
			    <div class="controls">
			      <input type="text" id="nomEquipeCreerJoueur" placeholder="">
			    </div>
			  </div>
			  <div class="control-group">
			    <label class="control-label" for="numeroJoueurCreer">Numero*</label>
			    <div class="controls">
			      <input type="text" id="numeroJoueurCreer" placeholder="">
			    </div>
			  </div>
			  <div class="control-group">
			    <label class="control-label" for="dateDebut">Date debut*</label>
			    <div class="controls">
			      <input type="text" id="dateDebut" placeholder="">
			    </div>
			  </div>
			  <div class="control-group">
			    <div class="controls">
			      <button type="submit" class="btn btn-inverse">Creer joueur</button>
			    </div>
			  </div>
			</form>
    		<p>
    			Need: Nom joueur, (nom equipe et numero)*, date de debut*
    		</p>
   		</div>
	  <h3>Afficher joueur par equipe</h3>
	  <div>
	    <p>
		   Option1 : rien
		   Option2 : equipe
	    </p>
	  </div>
	  <h3>Supprimer joueur</h3>
	  <div>
	    <p>
	    <form action="effacerJoueur" METHOD="POST" class="form-horizontal">

			<input class="span2" name="prenomJoueur" type="text" placeholder="Prenom joueur">
			<input class="span2" name="nomSupprimer" id="appendedInputButton" type="text" placeholder="Nom de l'equipe">
  			<button class="btn" type="submit">Effacer joueur</button>
				
		</form>	
	    </p>
	  </div>
	  <h3>Creer match</h3>
	  <div>
	    <p>
	    <form action="creerMatch" METHOD="POST" class="form-horizontal">

			<input class="span2" name="prenomJoueur" type="text" placeholder="Prenom joueur">
			<input class="span2" name="nomSupprimer" id="appendedInputButton" type="text" placeholder="Nom de l'equipe">
  			<button class="btn" type="submit">Effacer joueur</button>
				
		</form>	
	    </p>
	  </div>
	  <h3>Creer arbitre</h3>
	  <div>
	  Mettre les arbitres dans un seul onglet?
	  </div>
	  <h3>Afficher arbitre</h3>
	  <div>
	  </div>
	  <h3>Arbitrer match</h3>
	  <div>
	  </div>
	  <h3>Entrer les resultats d'un match</h3>
	  <div>
	  </div>
	  <h3>Afficher les resultats </h3>
	  <div>
	  	Avec une date ou bien avec un nom d'equipe
	  </div>
	  
	</div> <!--fin du accordion-->		

	* signifie non nécessaire
<%@ include file="/WEB-INF/jspf/footer.jspf" %> 