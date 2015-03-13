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

public class Joueur implements Comparable<Joueur> {
	private String nom;
	private int score;
	
	public Joueur(String nom){
		score = 0;
		this.nom = nom;
	}
	
	public int getScore(){
		return score;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setScore(int scoreTour){
		score += scoreTour;
	}
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
