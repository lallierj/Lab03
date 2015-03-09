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

import frameworkJeuDe.De;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test unitaire pour les méthodes de De
 *
 */

public class DeTest {
	private int valeurDe1;
	private int valeurDe2;
	De de1 = new De(1,6);
	De de2 = new De(1,6);
	
	/**
	 * Test de lancer le dé
	 *
	 */
	@Test
	public void testLancer() {
		valeurDe1 = de1.lancer();
		assert(de1 != null);
		valeurDe2 = de2.lancer();
		assert(de2 != null);
	}
	/**
	 * Test de comparer les dés
	 *
	 */
	@Test
	public void testCompareTo() {
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
