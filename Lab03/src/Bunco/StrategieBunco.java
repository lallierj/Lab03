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
Nom du fichier : StrategieBunco.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package Bunco;

import frameworkJeuDe.CollectionJoueurs;
import frameworkJeuDe.IStrategie;
import frameworkJeuDe.IterateurDe;
import frameworkJeuDe.Jeu;
/**
 * Classe qui implémente IStratégie et qui dit comment calculer le score d'un tour et le vainqueur d'une partie
 * */
public class StrategieBunco implements IStrategie {
	/**
	 * @attr tabValeurs tableau des valeurs des dés
	 * @attr changerJoueur valeur booleenne qui dit si il faut changer de joueur apres un lancer de dés
	 * */
	int[] tabValeurs = new int[3];
	boolean changerJoueur = false;
	/**
	 * Méthode qui permet de calculer le vainqueur de la partie
	 * @return CollectionJoueurs la liste des joueurs en ordre décroissant de pointage
	 * */
	@Override
	public CollectionJoueurs calculerLeVainqueur(Jeu jeu) {
		return jeu.getCollectionJoueurs().trierParScore();
	}
	/**
	 * Méthode qui permet de calculer le score d'un tour pour un joueur
	 * @return int le score du tour
	 * */
	@Override
	public int calculerScoreTour(Jeu jeu) {
		changerJoueur = false;
		int scoreTour=0;
		while(!changerJoueur){
			int i = 0;
			IterateurDe itr = jeu.getCollectionDes().iterator();
			while(itr.hasNext()){
				tabValeurs[i] = itr.deCourant().lancer();
				itr.next();
				if(itr.getIndex()==tabValeurs.length-1){
					i++;
					tabValeurs[i] = itr.deCourant().lancer();
				}
				i++;
			}
			System.out.println("Lancer: "+tabValeurs[0]+"  "+tabValeurs[1]+"  "+tabValeurs[2]);
			scoreTour = verifierDes(tabValeurs, jeu.getCurrentRound());
			System.out.println("Score du tour jusqu'à maintenant: "+scoreTour);
		}
		
		return scoreTour;
	}
	/**
	 * Méthode qui permet de calculer le score d'un lancer de dé
	 * @return int score du lancer de dés
	 * */
	public int verifierDes(int[] tabValeurs, int ronde){
		changerJoueur = false;
		int scoreTour = 0;
		if(tabValeurs[0] == tabValeurs[1] && tabValeurs[0] == tabValeurs[2]){
			if(tabValeurs[0] == ronde){
				scoreTour+=21;
				changerJoueur = true;
			}
			else{
				scoreTour+=5;
				changerJoueur = true;
			}
		}
		else{
			if(tabValeurs[0] == ronde){
				scoreTour+=1;
			}
			if(tabValeurs[1] == ronde){
				scoreTour+=1;
			}
			if(tabValeurs[2] == ronde){
				scoreTour+=1;
			}
			if(tabValeurs[0] != ronde && tabValeurs[1] != ronde && tabValeurs[2] != ronde){
				changerJoueur = true;
			}
		}
		return scoreTour;
	}
	/**
	 * Méthode qui retourne si il faut changer ou non le joueur apres le lancer de dés
	 * @return si il faut changer le joueur après le lancer de dés
	 * */
	public boolean getChangerJoueur(){
		return changerJoueur;
	}

}
