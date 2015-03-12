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

import frameworkJeuDe.Jeu;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test unitaire pour les méthodes de jeu
 *
 */


public class JeuTest {
	Jeu jeu = new Jeu("Bunco+",6,4,3);
	
	/**
	 * Test de calculerScore
	 *
	 */
	@Test
	public void testCalculerScore() {
		assertEquals(0,jeu.calculerScoreTour());
	}
	
	

}
