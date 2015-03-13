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
Nom du fichier : Joueur.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;
/**
 * Classe qui indique le comportement d'un joueur de jeu de dé
 * */
public class Joueur implements Comparable<Joueur> {
	/**
	 * @attr String le nom du joueur
	 * @attr int le pointage total du joueur
	 * */
	private String nom;
	private int score;
	/**
	 * Constructeur
	 * @param String le nom du joueur
	 * */
	public Joueur(String nom){
		score = 0;
		this.nom = nom;
	}
	/**
	 * Méthode qui retourne le pointage courant total du joueur
	 * @return int le pointage courant total du joueur
	 * */
	public int getScore(){
		return score;
	}
	/**
	 * Méthode qui retourne le nom du joueur
	 * @return String le nom du joueur
	 * */
	public String getNom(){
		return nom;
	}
	/**
	 * Méthode qui permet de changer manuellement le pointage d'un joueur
	 * @param le nouveau pointage du joueur
	 * */
	public void setScore(int scoreTour){
		score += scoreTour;
	}
	/**
	 * Méthode qui compare le pointage de deux joueurs
	 * @return -1 si la valeur du pointage du joueur sur lequel la méthode est appelée est inférieure à la valeur du pointage du joueur auquel il est comparé
	 * @return 0 si la valeur du pointage du joueur sur lequel la méthode est appelée est égale à la valeur du pointage du joueur auquel il est comparé
	 * @return 1 si la valeur du pointage du joueur sur lequel la méthode est appelée est supérieure à la valeur du pointage du joueur auquel il est comparé
	 * */
	@Override
	public int compareTo(Joueur autreJoueur) {
		if(score < autreJoueur.getScore()){
			return -1;
		}
		else if(score == autreJoueur.getScore()){
			return 0;
		}
		else{
			return 1;
		}
	}
}
