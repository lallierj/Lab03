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
Nom du fichier : CollectionDes.java
Date créé : 2015‐02-25
Date dern. modif. 2015‐02-25
*******************************************************
Historique des modifications
*******************************************************
2015‐02‐25 Version initiale 

*******************************************************/
package frameworkJeuDe;

import java.util.Iterator;

public class IterateurDe implements Iterator<De> {
	private CollectionDes collectionDes;
	private int indexCourant = 0;
	
	public IterateurDe(CollectionDes collection){
		collectionDes = collection;
	}
	
	public int getIndex(){
		return indexCourant;
	}
	@Override
	public boolean hasNext() {
		De[] tabDes = collectionDes.getTabDes();
		return indexCourant + 1 < tabDes.length;
	}

	@Override
	public De next() {
		De[] tabDes = collectionDes.getTabDes();
		indexCourant ++;
		if(indexCourant == tabDes.length){
			indexCourant = 0;
		}
		return tabDes[indexCourant];
	}
}
