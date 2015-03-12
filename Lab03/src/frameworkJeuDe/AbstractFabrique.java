package frameworkJeuDe;

public abstract class AbstractFabrique {
	
	public final Jeu creerBaseJeu(){
		Jeu jeu  = creerJeu();
		jeu.setCollectionJoueurs(creerCollectionJoueurs(jeu));
		jeu.setCollectionDes(creerCollectionDes(jeu));
		jeu.setStrategie(creerStrategie());
		return jeu;
	}
	public abstract Jeu creerJeu();
	public abstract CollectionJoueurs creerCollectionJoueurs(Jeu jeu);
	public abstract CollectionDes creerCollectionDes(Jeu jeu);
	public abstract IStrategie creerStrategie();
	
}
