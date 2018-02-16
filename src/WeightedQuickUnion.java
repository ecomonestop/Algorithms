
public class WeightedQuickUnion {
	private int[] id;
	private int[] sz;
	
	public WeightedQuickUnion(int N){
		id = new int[N];
		for(int i = 0; i < id.length; i++){
			id[i]=i;
		}
	}

}
