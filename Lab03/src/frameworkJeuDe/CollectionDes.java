/******************************************************
Cours : LOG121
Session : H2015
Groupe : 01
Projet : Laboratoire #3
Étudiant(e)(s) : Jérôme L'Allier-Décary
				 Alexandre Lusignan
Code(s) perm. : LALJ26059304
				LUSA11049100
Professeur : Dominic St‐Jacques
Chargés de labo : Alex Levesque et Simon Robert
Nom du fichier : CollectionDes.java
Date créé : 2015‐02-25
Date dern. modif. 2015‐02-25
*******************************************************
Historique des modifications
*******************************************************
2015‐02‐25 Version initiale 
2015-02-25 Ajout du constructeur
*******************************************************/
package frameworkJeuDe;

public class CollectionDes {
	private De[] tabDes;
	private IterateurDe iterateur;
	
	public CollectionDes(int nbDes){
		tabDes = new De[nbDes];
		iterateur = new IterateurDe(this);
	}	
	public void addDe(De de){
		tabDes[iterateur.getIndex()] = de;
	}
	public De[] getTabDes(){
		return tabDes.clone();
	}
}
