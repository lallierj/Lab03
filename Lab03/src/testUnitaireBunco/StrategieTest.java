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
Nom du fichier : StrategieTest.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package testUnitaireBunco;

import static org.junit.Assert.*;

import org.junit.Test;

import Bunco.Fabrique;
import Bunco.StrategieBunco;
import frameworkJeuDe.CollectionDes;
import frameworkJeuDe.CollectionJoueurs;
import frameworkJeuDe.De;
import frameworkJeuDe.IStrategie;
import frameworkJeuDe.IterateurJoueur;
import frameworkJeuDe.Jeu;
import frameworkJeuDe.Joueur;
public class StrategieTest{
	/**
	 * Test de création d'une stratégie
	 * */
	@Test
	public void testStrategie(){
		IStrategie strategie = new StrategieBunco();
		assert(strategie != null);
	}
	/**
	 * Test de comparaison des dés avec les valeurs de pointage et de changement de joueurs
	 * */
	@Test
	public void testVerifierDes(){
		StrategieBunco strategie = new StrategieBunco();
		int[] valeursDes = new int[3];
		valeursDes[0] = 1;
		valeursDes[1] = 1;
		valeursDes[2] = 1;
		assertEquals(21,strategie.verifierDes(valeursDes, 1));
		assertEquals(true,strategie.getChangerJoueur());
		assertEquals(5,strategie.verifierDes(valeursDes, 2));
		assertEquals(true,strategie.getChangerJoueur());
		valeursDes[0] = 2;
		assertEquals(2,strategie.verifierDes(valeursDes, 1));
		assertEquals(false,strategie.getChangerJoueur());
		assertEquals(1,strategie.verifierDes(valeursDes, 2));
		assertEquals(false,strategie.getChangerJoueur());
		assertEquals(0,strategie.verifierDes(valeursDes, 3));
		assertEquals(true,strategie.getChangerJoueur());
		assertEquals(0,strategie.verifierDes(valeursDes, 4));
		assertEquals(true,strategie.getChangerJoueur());
		assertEquals(0,strategie.verifierDes(valeursDes, 5));
		assertEquals(true,strategie.getChangerJoueur());
		assertEquals(0,strategie.verifierDes(valeursDes, 6));
		assertEquals(true,strategie.getChangerJoueur());
	}
	/**
	 * Test de calcul de score pour un tour
	 * */
	@Test
	public void testCalculerScoreTour(){
		Jeu jeu = new Jeu("Test", 1,1,3);
		StrategieBunco strategie = new StrategieBunco();
		jeu.setStrategie(strategie);
		CollectionDes collectionDes = new CollectionDes(new De[]{new De(1,6),new De(1,6),new De(1,6)});
		jeu.setCollectionDes(collectionDes);
		strategie.calculerScoreTour(jeu);
		int score = strategie.calculerScoreTour(jeu);
		assert(score <= 0);
		assertEquals(true,strategie.getChangerJoueur());
	}
	/**
	 * Test de détermination d'un vainqueur par le tri de la collection de joueurs
	 * */
	@Test
	public void testCalculerVainqueur(){
		Jeu jeu = new Jeu("Test",1,3,3);
		StrategieBunco strategie = new StrategieBunco();
		jeu.setStrategie(strategie);
		Joueur joueur1 = new Joueur("test1");
		Joueur joueur2 = new Joueur("test2");
		Joueur joueur3 = new Joueur("test3");
		CollectionJoueurs collectionJoueurs = new CollectionJoueurs(new Joueur[]{joueur1,joueur2,joueur3});
		CollectionJoueurs orderedCollectionJoueurs = new CollectionJoueurs(new Joueur[]{joueur3,joueur1,joueur2});
		jeu.setCollectionJoueurs(collectionJoueurs);
		joueur1.setScore(3);
		joueur2.setScore(1);
		joueur3.setScore(10);
		IterateurJoueur itrOrderedJoueurs = orderedCollectionJoueurs.iterator();
		strategie.calculerLeVainqueur(jeu);
		IterateurJoueur itrJoueurs = collectionJoueurs.iterator();
		assertEquals(itrOrderedJoueurs.joueurCourant().getNom(), itrJoueurs.joueurCourant().getNom());
		itrJoueurs.next();
		itrOrderedJoueurs.next();
		assertEquals(itrOrderedJoueurs.joueurCourant().getNom(), itrJoueurs.joueurCourant().getNom());
		itrJoueurs.next();
		itrOrderedJoueurs.next();
		assertEquals(itrOrderedJoueurs.joueurCourant().getNom(), itrJoueurs.joueurCourant().getNom());
	}
}
