/******************************************************
Cours : LOG121
Session : H2015
Groupe : 01
Projet : Laboratoire #3
Étudiant(e)(s) : Jérôme L'Allier-Décary
				 Alexandre Lusignan
				 Tristan Roy
Code(s) perm. : LALJ26059304
				LUSA11049100
				ROYT05059408
Professeur : Dominic St‐Jacques
Chargés de labo : Alex Levesque et Simon Robert
Nom du fichier : CollectionDes.java
Date créé : 2015‐02-25
Date dern. modif. 2015‐02-25
*******************************************************
Historique des modifications
*******************************************************
2015‐02‐25 Version initiale 
2015-02-25 Ajout du constructeur
*******************************************************/
package frameworkJeuDe;

public class CollectionJoueurs{
	private Joueur[] tabJoueurs;
	private IterateurJoueur iterateur;
	
	public CollectionJoueurs(int nbJoueurs){
		tabJoueurs = new Joueur[nbJoueurs];
		iterateur = new IterateurJoueur(this);
	}
	public CollectionJoueurs(Joueur[] tabJoueurs){
		this.tabJoueurs = tabJoueurs;
		iterateur = new IterateurJoueur(this);
	}
	public void add(Joueur joueur){
		tabJoueurs[iterateur.getIndex()] = joueur;
	}
	public Joueur[] getTabJoueurs(){
		return tabJoueurs;
	}
	public IterateurJoueur iterator(){
		return iterateur;
	}
	public CollectionJoueurs clone(){
		return new CollectionJoueurs(tabJoueurs);
	}
	public CollectionJoueurs trierParScore(){
		Joueur joueurTemp;
		for(int i = 1; i < tabJoueurs.length; i++){
			iterateur.reset();
			for(int j = 1; j < tabJoueurs.length; j++){
				if(iterateur.joueurCourant().compareTo(iterateur.prochainJoueur()) == -1){
					joueurTemp = iterateur.joueurCourant();
					iterateur.setJoueurCourant(iterateur.prochainJoueur());
					iterateur.next();
					iterateur.setJoueurCourant(joueurTemp);
				}
				else{
					iterateur.next();
				}
			}
		}
		return this;
	}
}