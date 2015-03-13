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
Nom du fichier : Jeu.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package frameworkJeuDe;
/**
 * Classe qui détermine le comportement d'un jeu de dé
 * */
public class Jeu {
	/**
	 * @attr String nom le nom du jeu
	 * @attr int nbTours le nombre de tours du jeu
	 * @attr int nbJoueurs le nombre de joueurs du jeu 
	 * @attr int nbDes le nombre de dés du jeu
	 * @attr CollectionJoueurs collectionJoueurs la collection de joueurs du jeu
	 * @attr CollectionDes collectionDes la collection de dés du jeu
	 * @attr IStrategie strategie la stratégie utilisée pour le jeu
	 * @attr int rondeCourante la ronde en cours présentement dans le jeu
	 * */
	private String nom;
	private int nbTours;
	private int nbJoueurs;
	private int nbDes;
	private CollectionJoueurs collectionJoueurs;
	private CollectionDes collectionDes;
	private IStrategie strategie;
	private int rondeCourante;
	/**
	 * Constructeur
	 * @param String nom le nom du jeuint 
	 * @param int nbTours le nombre de tours du jeu
	 * @param int nbJoueurs le nombre de joueurs du jeu 
	 * @param int nbDes le nombre de dés du jeu
	 * */
	public Jeu(String nom, int nbTours, int nbJoueurs, int nbDes){
		this.nom = nom;
		this.nbTours = nbTours;
		this.nbJoueurs = nbJoueurs;
		this.nbDes = nbDes;
		rondeCourante = 0;
	}
	/**
	 * Méthode qui permet de calculer le pointage du tour avec la stratégie
	 * @return int le pointage du tour
	 * */
	public int calculerScoreTour(){
		return strategie.calculerScoreTour(this);
	}
	/**
	 * Méthode qui tri les joueurs avec la stratégie et retourne la collection de joueurs triée
	 * @return la collection de joueurs triée
	 * */
	public CollectionJoueurs calculerLeVainqueur(){
		return strategie.calculerLeVainqueur(this);
	}
	/**
	 * Méthode qui commence la partie et qui s'occupe de son déroulement
	 * */
	public void play(){
		System.out.println("La partie commence!");
		IterateurJoueur itr = collectionJoueurs.iterator();
		for(int tour = 1; tour <= nbTours; tour++){
			rondeCourante = tour;
			System.out.println("***************Ronde "+rondeCourante+"***************");
			for(int j = 0; j < nbJoueurs; j++){
				System.out.println(itr.joueurCourant().getNom());
				//Changer le joueur et ajouter le score au bon joueur
				itr.joueurCourant().setScore(calculerScoreTour());
				System.out.println("Changement de joueur (score pour "+itr.joueurCourant().getNom()+" jusqu'à maintenant: "+itr.joueurCourant().getScore()+")");
				itr.next();
			}
		}
		System.out.println("La partie est terminée");
		System.out.println("***************Classement***************");
		itr = calculerLeVainqueur().iterator();
		itr.reset();
		int i=1;
		while(itr.hasNext()){
			System.out.println(i+". "+itr.joueurCourant().getNom()+": "+itr.joueurCourant().getScore()+" points");
			itr.next();
			i++;
			if(itr.getIndex() == collectionJoueurs.getTabJoueurs().length -1){
				System.out.println(i+". "+itr.joueurCourant().getNom()+": "+itr.joueurCourant().getScore()+" points");
			}
		}
	}
	/**
	 * Méthode qui retourne le nombre de joueurs du jeu
	 * @return int le nombre de joueurs du jeu
	 * */
	public int getNbJoueurs(){
		return nbJoueurs;
	}
	/**
	 * Méthode qui retourne le nombre de dés du jeu
	 * @return int le nombre de dés du jeu
	 * */
	public int getNbDes(){
		return nbDes;
	}
	/**
	 * Méthode qui retourne la ronde courante du jeu
	 * @return int la ronde courante du jeu
	 * */
	public int getCurrentRound(){
		return rondeCourante;
	}
	/**
	 * Méthode qui retourne la stratégie du jeu
	 * @return IStrategie la stratégie du jeu
	 * */
	public IStrategie getStrategie(){
		return strategie;
	}
	/**
	 * Méthode qui retourne la collection de joueurs du jeu
	 * @return CollectionJoueurs la collection de joueurs du jeu
	 * */
	public CollectionJoueurs getCollectionJoueurs(){
		return collectionJoueurs.clone();
	}
	/**
	 * Méthode qui retourne la collection de dés du jeu
	 * @return CollectionDes la collection de dés du jeu
	 * */
	public CollectionDes getCollectionDes(){
		return collectionDes.clone();
	}
	/**
	 * Méthode qui initialise la collection de joueurs du jeu
	 * @param CollectionJoueurs la collection de joueurs du jeu
	 * */
	public void setCollectionJoueurs(CollectionJoueurs collectionJoueurs){
		this.collectionJoueurs = collectionJoueurs;
	}
	/**
	 * Méthode qui initialise la collection de dés du jeu
	 * @param CollectionDes la collection de dés du jeu
	 * */
	public void setCollectionDes(CollectionDes collectionDes){
		this.collectionDes = collectionDes;
	}
	/**
	 * Méthode qui initialise la stratégie du jeu
	 * @param IStrategie la stratégie du jeu
	 * */
	public void setStrategie(IStrategie strategie){
		this.strategie = strategie;
	}
}
