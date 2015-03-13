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
Nom du fichier : IterateurJoueur.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;

import java.util.Iterator;
/**
 * Classe qui permet d'itérer dans la collection de joueurs
 * */
public class IterateurJoueur implements Iterator<Joueur> {
	/**
	 * @attr Collection joueurs la collerction de joueurs dans laquelle on veut itérer
	 * @attr int l'index où se trouve présentement l'itérateur
	 * */
	private CollectionJoueurs collectionJoueurs;
	private int indexCourant = 0;
	/**
	 * Constructeur
	 * @param CollectionJoueurs la collection de joueurs dans laquelle on veut itérer
	 * */
	public IterateurJoueur(CollectionJoueurs collectionJoueurs){
		this.collectionJoueurs = collectionJoueurs;
	}
	/**
	 * Méthode qui retourne le joueurs à l'index courant de l'itérateur
	 * @return Joueur le joueur à l'index courant de l'itérateur
	 * */
	public Joueur joueurCourant(){
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		return tabJoueurs[indexCourant];
	}
	/**
	 * Méthode qui retourne le joueurs à l'index suivant de l'itérateur
	 * @return Joueur le joueur à l'index suivant de l'itérateur
	 * */
	public Joueur prochainJoueur(){
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		if(indexCourant < tabJoueurs.length)
			return tabJoueurs[indexCourant+1];
		else
			return null;
	}
	/**
	 * Méthode qui retourne l'index courant de l'itérateur
	 * @return int l'index courant de l'itérateur
	 * */
	public int getIndex(){
		return indexCourant;
	}
	/**
	 * Méthode qui remet l'itérateur à l'index 0
	 * */
	public void reset(){
		indexCourant = 0;
	}
	/**
	 * Méthode qui permet de changer le joueur à l'index courant de l'itérateur
	 * @param le nouveau joueur
	 * */
	public void setJoueurCourant(Joueur joueur){
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		tabJoueurs[indexCourant] = joueur;
	}
	/**
	 * Méthode qui permet de savoir si l'index courant n'est pas le dernier
	 * @return si l'index courant n'est pas le dernier
	 * */
	@Override
	public boolean hasNext() {
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		return indexCourant + 1 < tabJoueurs.length;
	}
	/**
	 * Méthode qui permet de passer au joueur suivant
	 * @return Joueur le joueur suivant
	 * */
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
