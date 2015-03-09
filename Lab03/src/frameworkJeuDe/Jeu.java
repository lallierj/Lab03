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
2015-02-25 Ajout du constructeur et des méthodes qui devront être override lors de l'implémentation d'un jeu concret
*******************************************************/
package frameworkJeuDe;

public class Jeu {
	private String nom;
	private int nbTours;
	private int nbJoueurs;
	private int nbDes;
	
	public Jeu(String nom, int nbTours, int nbJoueurs, int nbDes){
		this.nom = nom;
		this.nbTours = nbTours;
		this.nbJoueurs = nbJoueurs;
		this.nbDes = nbDes;
	}
	
	public int calculerScoreTour(){
		return 0;
	}
	
	public Joueur calculerLeVainqueur(){
		return new Joueur("auto-generated player");
	}
}
