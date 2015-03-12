package Bunco;


import frameworkJeuDe.Jeu;

public class Application {
	private int nbJoueurs;
	public static void main(String[] args) {
		Fabrique fabrique = new Fabrique();
		Jeu jeu = fabrique.creerBaseJeu();
		jeu.play();
	}

}
