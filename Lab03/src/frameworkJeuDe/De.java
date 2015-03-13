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
Nom du fichier : De.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;
/**
 * Classe qui détermine le comportement d'un dé
 * */
public class De implements Comparable<De> {
	/**
	 * @attr int minValue la valeur minimale du dé
	 * @attr int maxValue la valeur maximale du dé
	 * @attr int value la valeur courante du dé
	 * */
	private int minValue;
	private int maxValue;
	private int value;
	/**
	 * Constructeur qui initialise les valeurs maximale et minimale du dé
	 * */
	public De(int minValue, int maxValue){
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	/**
	 * Méthode qui retourne un chiffre entre la valeur minimale et la valeur maximale du dé et qui met la valeur du dé à ce nombre
	 * @return un chiffre entre la valeur minimale et la valeur maximale du dé*/
	public int lancer(){
		value = (int) Math.round(Math.random() * (maxValue - minValue) + minValue);
		return value;
	}
	/**
	 * Méthode qui permet de déterminer manuellement la valeur du dé
	 * @param int la valeur du dé
	 * */
	public void setValue(int valeur) {
		this.value = valeur;
	}
	/**
	 * Méthode qui retourne la valeur du dé
	 * @return la valeur du dé
	 * */
	public int getValue(){
		return value;
	}
	/**
	 * Méthode qui compare deux dés
	 * @return -1 si la valeur du dé sur lequel la méthode est appelée est inférieure à la valeur du dé auquel il est comparé
	 * @return 0 si la valeur du dé sur lequel la méthode est appelée est égale à la valeur du dé auquel il est comparé
	 * @return 1 si la valeur du dé sur lequel la méthode est appelée est supérieure à la valeur du dé auquel il est comparé
	 * */
	@Override
	public int compareTo(De autreDe) {
		if(value < autreDe.getValue()){
			return -1;
		}
		else if(value == autreDe.getValue()){
			return 0;
		}
		else{
			return 1;
		}
	}
}
