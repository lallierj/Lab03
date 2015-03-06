package frameworkJeuDe;

import java.util.Iterator;

public class IterateurJoueur implements Iterator<Joueur> {
	private CollectionJoueurs collectionJoueurs;
	private int indexCourant = 0;
	
	public IterateurJoueur(CollectionJoueurs collectionJoueurs){
		this.collectionJoueurs = collectionJoueurs;
	}
	
	public int getIndex(){
		return indexCourant;
	}
	@Override
	public boolean hasNext() {
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		if(indexCourant + 1 < tabJoueurs.length){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public Joueur next() {
		Joueur[] tabJoueurs = collectionJoueurs.getTabJoueurs();
		indexCourant ++;
		if(indexCourant == tabJoueurs.length){
			indexCourant = 0;
		}
		return tabJoueurs[indexCourant];
	}
}
