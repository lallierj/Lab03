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
2015-02-25 Ajout du constructeur et des méthodes qui devront être override lors de l'implémentation d'un jeu concret
*******************************************************/
package frameworkJeuDe;

public class Jeu {
	private String nom;
	private int nbTours;
	private int nbJoueurs;
	private int nbDes;
	private CollectionJoueurs collectionJoueurs;
	private CollectionDes collectionDes;
	private IStrategie strategie;
	private int rondeCourante;
	
	public Jeu(String nom, int nbTours, int nbJoueurs, int nbDes){
		this.nom = nom;
		this.nbTours = nbTours;
		this.nbJoueurs = nbJoueurs;
		this.nbDes = nbDes;
		rondeCourante = 0;
	}
	
	public int calculerScoreTour(){
		return strategie.calculerScoreTour(this);
	}
	
	public CollectionJoueurs calculerLeVainqueur(){
		return strategie.calculerLeVainqueur(this);
	}
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
	public int getNbJoueurs(){
		return nbJoueurs;
	}
	public int getNbDes(){
		return nbDes;
	}
	public int getCurrentRound(){
		return rondeCourante;
	}
	public CollectionJoueurs getCollectionJoueurs(){
		return collectionJoueurs.clone();
	}
	public CollectionDes getCollectionDes(){
		return collectionDes.clone();
	}
	public void setCollectionJoueurs(CollectionJoueurs collectionJoueurs){
		this.collectionJoueurs = collectionJoueurs;
	}
	public void setCollectionDes(CollectionDes collectionDes){
		this.collectionDes = collectionDes;
	}
	public void setStrategie(IStrategie strategie){
		this.strategie = strategie;
	}
}
