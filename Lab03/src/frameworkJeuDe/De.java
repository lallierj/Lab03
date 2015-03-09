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
2015-02-25 Ajout du constructeur et de la méthode lancer()
*******************************************************/
package frameworkJeuDe;

public class De implements Comparable<De> {
	private int minValue;
	private int maxValue;
	private int value;
	
	public De(int minValue, int maxValue){
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	public int lancer(){
		value = (int) Math.round(Math.random() * (maxValue - minValue) + minValue);
		return value;
	}
	
	public int getValue(){
		return value;
	}
	
	@Override
	public int compareTo(De autreDe) {
		if(value < autreDe.getValue()){
			return -1;
		}
		else if(value == autreDe.getValue()){
			return 0;
		}
		else{
			return 1;
		}
	}
}
