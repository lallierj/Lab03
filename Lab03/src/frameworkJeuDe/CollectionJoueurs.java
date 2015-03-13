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
Nom du fichier : CollectionJoueurs.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;
/**
 * Classe qui contient et gère les actions des joueurs du jeu
 * */
public class CollectionJoueurs{
	/**
	 * @attr Joueur[] le tableau de joueurs du jeu
	 * @attr IterateurJoueur l'itérateur qui permettra de traverser la liste de joueurs du jeu
	 * */
	private Joueur[] tabJoueurs;
	private IterateurJoueur iterateur;
	/**
	 * Constructeur qui crée le nombre de joueurs spécifié en paramètre
	 * @param int le nombre de joueurs à créer
	 * */
	public CollectionJoueurs(int nbJoueurs){
		tabJoueurs = new Joueur[nbJoueurs];
		iterateur = new IterateurJoueur(this);
	}
	/**
	 * Constructeur qui crée une collection de joueurs à partir d'un tableau de joueurs
	 * @param Joueur[] tableau de joueurs à cloner dans une nouvelle collection de joueurs
	 * */
	public CollectionJoueurs(Joueur[] tabJoueurs){
		this.tabJoueurs = tabJoueurs;
		iterateur = new IterateurJoueur(this);
	}
	/**
	 * Méthode qui permet d'ajouter un joueur à la collection
	 * @param Joueur le joueur à ajouter*/
	public void add(Joueur joueur){
		tabJoueurs[iterateur.getIndex()] = joueur;
	}
	/**
	 * Méthode qui retourne le tableau de joueurs de la collection
	 * @return Joueur[] le tableau de joueurs de la collection
	 * */
	public Joueur[] getTabJoueurs(){
		return tabJoueurs;
	}
	/**
	 * Méthode qui retourne l'iterateur de la collection
	 * @return IterateurJoueur l'iterateur de la collection
	 * */
	public IterateurJoueur iterator(){
		return iterateur;
	}
	/**
	 * Méthode qui clone la collection courante et retourne le clone créé
	 * @return CollectionJoueurs la collection clone de la collection*/
	public CollectionJoueurs clone(){
		return new CollectionJoueurs(tabJoueurs);
	}
	/**
	 * Méthode qui trie les joueurs de la collection par leur pointage
	 * @return la collection triée*/
	public CollectionJoueurs trierParScore(){
		Joueur joueurTemp;
		for(int i = 1; i < tabJoueurs.length; i++){
			iterateur.reset();
			for(int j = i; j < tabJoueurs.length; j++){
				if(iterateur.joueurCourant().compareTo(iterateur.prochainJoueur()) == -1){
					joueurTemp = iterateur.joueurCourant();
					iterateur.setJoueurCourant(iterateur.prochainJoueur());
					iterateur.next();
					iterateur.setJoueurCourant(joueurTemp);
				}
				else{
					iterateur.next();
				}
			}
		}
		return this;
	}
}