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
Nom du fichier : JeuTest.java
Date créé : 2015‐02-25
Date dern. modif. 2015‐02-25
*******************************************************
Historique des modifications
*******************************************************
2015‐02‐25 Version initiale 
2015-02-25 Ajout du constructeur
*******************************************************/
package testUnitaireBunco;

import frameworkJeuDe.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test unitaire pour les méthodes de jeu
 *
 */


public class JeuTest {

	Jeu jeu = new Jeu("Bunco+",1,2,3);
	
	
	/**
	 * Test unitaire pour getNbJoueurs
	 *
	 */
	@Test
	public void testGetNbJoueurs() {
		assertEquals(2, jeu.getNbJoueurs());
	}
	/**
	 * Test unitaire pour getNbDes
	 *
	 */
	@Test
	public void testGetNbDes() {
		assertEquals(3, jeu.getNbDes());
	}
	/**
	 * Test unitaire pour les collections de joueur ainsi que leurs Set Get
	 *
	 */
	@Test
	public void testCollectionJoueurs() {
		Joueur j1 = new Joueur("Test1");
		Joueur j2 = new Joueur("Test2");
		CollectionJoueurs CJ = new CollectionJoueurs(2);
		CJ.add(j1);
		CJ.add(j2);
		assert(CJ != null);
		jeu.setCollectionJoueurs(CJ);
		assert(jeu.getCollectionJoueurs() != null);
	}
	/**
	 * Test unitaire pour les collections de dé ainsi que leurs Set Get
	 *
	 */
	@Test
	public void testCollectionDes() {
		De d1 = new De(1,6);
		De d2 = new De(1,6);
		CollectionDes CD = new CollectionDes(2);
		CD.add(d1);
		CD.add(d2);
		assert(CD != null);
		jeu.setCollectionDes(CD);
		assert(jeu.getCollectionDes() != null);
	}

}
