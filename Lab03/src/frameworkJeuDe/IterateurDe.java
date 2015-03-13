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
Nom du fichier : IterateurDe.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;

import java.util.Iterator;
/**
 * Classe qui permet d'itérer dans la collection de dés
 * */
public class IterateurDe implements Iterator<De> {
	/**
	 * @attr CollectionDes la collection de dés dans laquelle on veut itérer
	 * @attr int l'index où se trouve présentement l'itérateur
	 * */
	private CollectionDes collectionDes;
	private int indexCourant = 0;
	/**
	 * Constructeur
	 * @param CollectionDes la collection de dés dans laquelle on veut itérer
	 * */
	public IterateurDe(CollectionDes collection){
		collectionDes = collection;
	}
	/**
	 * Méthode qui retourne le dé à l'index courant de l'itérateur
	 * @return De le dé à l'index courant de l'itérateur
	 * */
	public De deCourant(){
		De[] tabDes = collectionDes.getTabDes();
		return tabDes[indexCourant];
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
	 * Méthode qui permet de savoir si l'index courant n'est pas le dernier
	 * @return si l'index courant n'est pas le dernier
	 * */
	@Override
	public boolean hasNext() {
		De[] tabDes = collectionDes.getTabDes();
		return indexCourant + 1 < tabDes.length;
	}
	/**
	 * Méthode qui permet de passer au dé suivant
	 * @return De le dé suivant
	 * */
	@Override
	public De next() {
		De[] tabDes = collectionDes.getTabDes();
		indexCourant ++;
		if(indexCourant == tabDes.length){
			indexCourant = 0;
		}
		return tabDes[indexCourant];
	}
}
