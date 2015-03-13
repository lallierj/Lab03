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
Nom du fichier : Istrategie.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;
/**
 * Interface qui définit les méthode minimale à implémenter pour les regles d'un jeu de dé
 * */
public interface IStrategie {
	/**
	 * Méthode qui tri les joueurs et retourne la collection de joueurs triée
	 * @param Jeu le jeu duquel on veut déterminer le gagnant
	 * @return CollectionJoueurs la collection de joueurs triée
	 * */
	public CollectionJoueurs calculerLeVainqueur(Jeu jeu);
	/**
	 * Méthode qui détermine le pointage d'un tour et le retourne
	 * @param Jeu le jeu duquel on veut déterminer le pointage du tour
	 * @return int le pointage du tour
	 * */
	public int calculerScoreTour(Jeu jeu);
}
