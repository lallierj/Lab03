package Bunco;

import frameworkJeuDe.CollectionJoueurs;
import frameworkJeuDe.IStrategie;
import frameworkJeuDe.IterateurDe;
import frameworkJeuDe.Jeu;

public class StrategieBunco implements IStrategie {
	int[] tabValeurs = new int[3];
	@Override
	public CollectionJoueurs calculerLeVainqueur(Jeu jeu) {
		return jeu.getCollectionJoueurs().trierParScore();
	}

	@Override
	public int calculerScoreTour(Jeu jeu) {
		boolean changerJoueur = false;
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
			if(tabValeurs[0] == tabValeurs[1] && tabValeurs[0] == tabValeurs[2]){
				if(tabValeurs[0] == jeu.getCurrentRound()){
					scoreTour+=25;
					changerJoueur = true;
				}
				else{
					scoreTour+=5;
					changerJoueur = true;
				}
			}
			else{
				if(tabValeurs[0] == jeu.getCurrentRound()){
					scoreTour+=1;
				}
				if(tabValeurs[1] == jeu.getCurrentRound()){
					scoreTour+=1;
				}
				if(tabValeurs[2] == jeu.getCurrentRound()){
					scoreTour+=1;
				}
				if(tabValeurs[0] != jeu.getCurrentRound() && tabValeurs[1] != jeu.getCurrentRound() && tabValeurs[2] != jeu.getCurrentRound()){
					changerJoueur = true;
				}
			}
			System.out.println("Score du tour jusqu'à maintenant: "+scoreTour);
		}
		
		return scoreTour;
	}

}
