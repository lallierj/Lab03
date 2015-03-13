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
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;
/**
 * Classe qui contient et gère les actions des dés du jeu
 * */
public class CollectionDes {
	/**
	 * @attr De[] le tableau de dés du jeu
	 * @attr IterateurDe l'itérateur qui permettra de traverser la liste de dés
	 * */
	private De[] tabDes;
	private IterateurDe iterateur;
	/**
	 * Constructeur qui crée le nombre de dés spécifié en paramètre
	 * @param int le nombre de dés à créer
	 * */
	public CollectionDes(int nbDes){
		tabDes = new De[nbDes];
		iterateur = new IterateurDe(this);
	}
	/**
	 * Constructeur qui crée une collection de dés à partir d'un tableau de dé existant
	 * @param De[] tableau de dés à cloner dans une nouvelle collection de dés
	 * */
	public CollectionDes(De[] tabDes){
		this.tabDes = tabDes;
		iterateur = new IterateurDe(this);
	}
	/**
	 * Méthode qui permet d'ajouter un dé à la collection
	 * @param De le dé à ajouter
	 * */
	public void add(De de){
		tabDes[iterateur.getIndex()] = de;
	}
	/**
	 * Méthode qui retourne le tableau de dés de la collection
	 * @return De[] le tableau de dés de la collection
	 * */
	public De[] getTabDes(){
		return tabDes.clone();
	}
	/**
	 * Méthode qui retourne l'iterateur de la collection
	 * @return IterateurDe l'iterateur de la collection
	 * */
	public IterateurDe iterator(){
		return iterateur;
	}
	/**
	 * Méthode qui clone la collection courante et retourne le clone créé
	 * @return CollectionDes la collection clone de la collection*/
	public CollectionDes clone(){
		return new CollectionDes(tabDes);
	}
}
