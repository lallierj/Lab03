package frameworkJeuDe;

public interface IStartegie {
	public Joueur calculerLeVainqueur(Jeu jeu);
	public int calculerScoreTour(Jeu jeu);
}
