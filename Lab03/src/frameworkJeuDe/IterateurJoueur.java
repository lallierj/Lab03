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
*******************************************************/
package frameworkJeuDe;

import java.util.Iterator;

public class IterateurJoueur implements Iterator<Joueur> {
	private CollectionJoueurs collectionJoueurs;
	private int indexCourant = 0;
	
	public IterateurJoueur(CollectionJoueurs collectionJoueurs){
		this.collectionJoueurs = collectionJoueurs;
	}
	public Joueur joueurCourant(){
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		return tabJoueurs[indexCourant];
	}
	public Joueur prochainJoueur(){
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		if(indexCourant < tabJoueurs.length)
			return tabJoueurs[indexCourant+1];
		else
			return null;
	}
	public int getIndex(){
		return indexCourant;
	}
	public void reset(){
		indexCourant = 0;
	}
	public void setJoueurCourant(Joueur joueur){
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		tabJoueurs[indexCourant] = joueur;
	}
	@Override
	public boolean hasNext() {
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		return indexCourant + 1 < tabJoueurs.length;
	}

	@Override
	public Joueur next() {
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		indexCourant ++;
		if(indexCourant == tabJoueurs.length){
			indexCourant = 0;
		}
		return tabJoueurs[indexCourant];
	}
}
