package Bunco;

import frameworkJeuDe.AbstractFabrique;
import frameworkJeuDe.CollectionDes;
import frameworkJeuDe.CollectionJoueurs;
import frameworkJeuDe.De;
import frameworkJeuDe.IStrategie;
import frameworkJeuDe.IterateurDe;
import frameworkJeuDe.IterateurJoueur;
import frameworkJeuDe.Jeu;
import frameworkJeuDe.Joueur;

public class Fabrique extends AbstractFabrique {

	@Override
	public Jeu creerJeu() {
		return new Jeu("Bunco",6,3,3);
	}

	@Override
	public CollectionJoueurs creerCollectionJoueurs(Jeu jeu) {
		CollectionJoueurs collectionJoueurs = new CollectionJoueurs(jeu.getNbJoueurs());
		IterateurJoueur itr = collectionJoueurs.iterator();
		for(int i = 0; i < jeu.getNbJoueurs();i++){
			collectionJoueurs.add(new Joueur("Player "+ i+1));
			itr.next();
		}
		return collectionJoueurs;
	}

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

	@Override
	public IStrategie creerStrategie() {
		return new StrategieBunco();
	}

}
