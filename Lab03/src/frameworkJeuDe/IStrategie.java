/******************************************************
Cours : LOG121
Session : H2015
Groupe : 01
Projet : Laboratoire #3
Étudiant(e)(s) : Jérôme L'Allier-Décary
				 Alexandre Lusignan
Code(s) perm. : LALJ26059304
				LUSA11049100
Professeur : Dominic St‐Jacques
Chargés de labo : Alex Levesque et Simon Robert
Nom du fichier : IStrategie.java
Date créé : 2015‐02-25
Date dern. modif. 2015‐02-25
*******************************************************
Historique des modifications
*******************************************************
2015‐02‐25 Version initiale 
2015-02-25 Ajout des méthodes calculerLeVainqueur et calculerScoreTour
*******************************************************/
package frameworkJeuDe;

public interface IStrategie {
	public Joueur calculerLeVainqueur(Jeu jeu);
	public int calculerScoreTour(Jeu jeu);
}
