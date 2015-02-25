package frameworkJeuDe;

public class Jeu {
	private String nom;
	private int nbTours;
	
	public Jeu(String nom, int nbTours){
		this.nom = nom;
		this.nbTours = nbTours;
	}
	
	public int calculerScoreTour(){
		return 0;
	}
	
	public Joueur calculerLeVainqueur(){
		return new Joueur("auto-generated player");
	}
}
