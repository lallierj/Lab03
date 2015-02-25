package frameworkJeuDe;

public class De implements Comparable<De> {
	private int minValue;
	private int maxValue;
	
	public De(int minValue, int maxValue){
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	public int lancer(){
		return (int) Math.round(Math.random() * (maxValue - minValue) + minValue);
	}
	
	@Override
	public int compareTo(De autreDe) {
		// TODO Auto-generated method stub
		return 0;
	}
}
