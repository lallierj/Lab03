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
