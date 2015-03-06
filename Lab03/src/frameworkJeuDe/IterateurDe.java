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
		
		return false;
	}

	@Override
	public De next() {
		// TODO Auto-generated method stub
		return null;
	}
}
