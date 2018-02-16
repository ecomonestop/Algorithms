
public class QuickFind {
	//Value of this array represents the value that if and only if equals another index are they connected
	//This is one implementation of the Dynamic-connectivity problems that occur, i.e. finding if x object is connected to z object.  
	//This is  eager implementation meaning that it updates all the objects every union call to point to a deterministic value so that the connected operation runs at constant time.
	private int[] id;
	
	public QuickFind(int n){
		id = new int[n];
		for(int i=0; i<n; i++){
			id[i]=i;
		}
	}
	
	public boolean connected(int p, int q){
		return id[p]==id[q];
	}
	
	public void union(int p, int q){
		//No protection code provided, but would do so here in production
		int pid = id[p];
		int qid = id[q];
		for(int i=0; i<id.length; i++){
			if (id[i]==pid) id[i]=qid;
		}
	}
	
	public int find(int i){
		
		
		return 0;
	}
	
	
	


}
