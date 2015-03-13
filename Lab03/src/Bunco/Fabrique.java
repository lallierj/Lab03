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
Nom du fichier : Fabrique.java
Date créé : 2015‐03-08
Date dern. modif. 2015‐03-08
*******************************************************/
package Bunco;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frameworkJeuDe.AbstractFabrique;
import frameworkJeuDe.CollectionDes;
import frameworkJeuDe.CollectionJoueurs;
import frameworkJeuDe.De;
import frameworkJeuDe.IStrategie;
import frameworkJeuDe.IterateurDe;
import frameworkJeuDe.IterateurJoueur;
import frameworkJeuDe.Jeu;
import frameworkJeuDe.Joueur;
/**
 * Classe qui étend la classe AbstractFabrique et qui dit comment créer un jeu, une collection de joueurs, une collection de dés et une strategie
 * */
public class Fabrique extends AbstractFabrique {
	/**
	 * Méthode qui dit comment créer un jeu de Bunco
	 * @return Jeu le jeu de Bunco avec le nombre de joueurs spécifié par l'utilisateur
	 * */
	@Override
	public Jeu creerJeu() {
		int nbJoueurs = Integer.parseInt(JOptionPane.showInputDialog(new JFrame(), "Entrez le nombre de joueurs", "2"));
		return new Jeu("Bunco",6,nbJoueurs,3);
	}
	/**
	 * Méthode qui dit comment créer une collection de joueurs pour le jeu de Bunco
	 * @return CollectionJoueurs la collection de joueurs qui sera utilisée pour le jeu
	 * */
	@Override
	public CollectionJoueurs creerCollectionJoueurs(Jeu jeu) {
		CollectionJoueurs collectionJoueurs = new CollectionJoueurs(jeu.getNbJoueurs());
		IterateurJoueur itr = collectionJoueurs.iterator();
		for(int i = 0; i < jeu.getNbJoueurs();i++){
			String nom = JOptionPane.showInputDialog(new JFrame(), "Entrez le nom du joueur "+(i+1), "Joueur "+(i+1));
			collectionJoueurs.add(new Joueur(nom));
			itr.next();
		}
		return collectionJoueurs;
	}
	/**
	 * Méthode qui dit comment créer une collection de dés pour le jeu de Bunco
	 * @return CollectionDes la collection de dés qui sera utilisée pour le jeu
	 * */
	@Override
	public CollectionDes creerCollectionDes(Jeu jeu) {
		CollectionDes collectionDes = new CollectionDes(jeu.getNbDes());
		IterateurDe itr = collectionDes.iterator();
		for(int i = 0; i < jeu.getNbDes(); i++){
			collectionDes.add(new De(1, 6));
			itr.next();
		}
		return collectionDes;
	}
	/**
	 * Méthode qui crée une stratégi du jeu Bunco et la retourne
	 * @return StrategieBunco la stratégie utilisée pour le jeu*/
	@Override
	public IStrategie creerStrategie() {
		return new StrategieBunco();
	}

}
