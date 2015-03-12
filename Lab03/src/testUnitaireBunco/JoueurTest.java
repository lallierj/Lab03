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
package testUnitaireBunco;

import frameworkJeuDe.Joueur;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test unitaire pour les méthodes de joueur
 *
 */

public class JoueurTest {
	
	Joueur joueur1 = new Joueur("Henry");
	Joueur joueur2 = new Joueur("Thierry");
	/**
	 * Test de la création d'un joueur
	 *
	 */
	@Test
	public void testJoueur() {
		Joueur j = new Joueur("Test");
		assert(j != null);
	}
	/**
	 * Test de setScore
	 *
	 */
	@Test
	public void testSetScore() {
		joueur1.setScore(5);
		joueur2.setScore(10);
	}
	/**
	 * Test de getScore
	 *
	 */
	@Test
	public void testGetScore() {
		assertEquals(5,joueur1.getScore());
		assertEquals(10,joueur2.getScore());
	} 
	/**
	 * Test de getNom 
	 *
	 */
	@Test
	public void testGetNom() {
		assertEquals("Henry",joueur1.getNom());
		assertEquals("Thierry",joueur2.getNom());
	}
	/**
	 *  Test de compareTo
	 *
	 */
	@Test
	public void testCompareTo() {
		assertEquals(-1,joueur1.compareTo(joueur2));
		assertEquals(1,joueur2.compareTo(joueur1));
	}
	

}