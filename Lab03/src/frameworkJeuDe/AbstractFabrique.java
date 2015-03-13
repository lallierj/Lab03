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
Nom du fichier : AbstractFabrique.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;
/**
 * Classe abstraite qui donne l'ordre de création obligatoire des éléments nécessaires à la création d'un jeu
 * */
public abstract class AbstractFabrique {
	/**
	 * Méthode qui détermine l'ordre de création des éléments nécessaires à la création d'un jeu
	 * @return le jeu prêt à être démarré
	 * */
	public final Jeu creerBaseJeu(){
		Jeu jeu  = creerJeu();
		jeu.setCollectionJoueurs(creerCollectionJoueurs(jeu));
		jeu.setCollectionDes(creerCollectionDes(jeu));
		jeu.setStrategie(creerStrategie());
		return jeu;
	}
	/**
	 * Méthode à implémenter qui détermine comment créer un jeu 
	 * */
	public abstract Jeu creerJeu();
	/**
	 * Méthode à implémenter qui détermine comment créer une collection de joueurs 
	 * @param Jeu le jeu qui recevra la collection de joueurs
	 * @return CollectionJoueurs la collection de joueurs utilisée pour le jeu
	 * */
	public abstract CollectionJoueurs creerCollectionJoueurs(Jeu jeu);
	/**
	 * Méthode à implémenter qui détermine comment créer une collection de dés
	 * @param Jeu le jeu qui recevra la collection de joueurs
	 * @return CollectionDes la collection de dés utilisée pour le jeu
	 * */
	public abstract CollectionDes creerCollectionDes(Jeu jeu);
	/**
	 * Méthode à implémenter qui détermine comment créer un jeu 
	 * @return IStrategie la stratégie utilisée pour le jeu
	 * */
	public abstract IStrategie creerStrategie();
	
}
