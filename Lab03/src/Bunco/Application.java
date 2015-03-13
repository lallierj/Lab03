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
Nom du fichier : Application.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package Bunco;


import frameworkJeuDe.Jeu;
/**
 * Classe principale de l'application qui demande à la fabrique de créer les éléments nécessaires au fonctionnement du jeu*/
public class Application {
	/**
	 * Méthode qui demande de créer les éléments nécessaire au fonctionnement du jeu et qui le démarre par la suite*/
	public static void main(String[] args) {
		Fabrique fabrique = new Fabrique();
		Jeu jeu = fabrique.creerBaseJeu();
		jeu.play();
	}

}
