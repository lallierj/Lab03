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
Nom du fichier : DeTest.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package testUnitaireBunco;

import frameworkJeuDe.De;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test unitaire pour les méthodes de De
 *
 */

public class DeTest {
	/**
	 * @attr int valeurDe1 la valeur du premier dé utilisé pour les tests
	 * @attr int valeurDe2 la valeur du deuxième dé utilisé pour les tests
	 * @attr De de1 le premier dé utilisé pour les tests
	 * @attr De de2 le deuxième dé utilisé pour les tests
	 * */
	private int valeurDe1;
	private int valeurDe2;
	De de1 = new De(1,6);
	De de2 = new De(1,6);
	
	/**
	 * Test de lancer le dé aléatoire
	 *
	 */
	@Test
	public void testLancer() {
		valeurDe1 = de1.lancer();
		assert(de1 != null);
		valeurDe2 = de2.lancer();
		assert(de2 != null);
		if (valeurDe1 >= 1 && valeurDe1 <=6 && valeurDe2 >= 1 && valeurDe2 <=6) {
			assertTrue(true);
		}
		else assertFalse(true);
		
	}
	/**
	 * Test de comparer avec get et set
	 *
	 */
	@Test
	public void testComparerGetSet() {
		de1.setValue(3);
		de2.setValue(5);
		assertEquals(3,de1.getValue());
		assertEquals(5,de2.getValue());
		assertEquals(-1,de1.compareTo(de2));
	}
	
	/**
	 * Test de comparer les dés
	 *
	 */
	@Test
	public void testCompareTo() {
		valeurDe1 = de1.lancer();
		valeurDe2 = de2.lancer();
		if (valeurDe1 > valeurDe2) {
			assertEquals(1,de1.compareTo(de2));
		}
		else if (valeurDe1 < valeurDe2) {
			assertEquals(-1,de1.compareTo(de2));
		}
		else {
			assertEquals(0,de1.compareTo(de2));
		}
	}

}
