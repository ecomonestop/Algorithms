
public class QuickUnion {
	//Value at this array is the parent of the object (node in a tree pretty much)
	//This implementation of Dynamic-connectivity problem uses forest of trees, meaning that at each indicie represents parts of several trees that can determine if a object is connected.
	//This is a lazy implementation i.e. because union doesnt update every node to the if and only if value as QuickFind does; it however, updates the node to point to its new parent; therefore,
	//allowing less operations on averages in the union method. 
	private int[] id;
	
	public QuickUnion(int n){
		id = new int[n];
		for(int i=0; i<n; i++){
			id[i]=i;
		}
	}
	
	public boolean connected(int p, int q){
		return root(p)==root(q);
	}
	
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		id[i]=j;
	}
	
	private int root(int i){
		//root occurs when id[i]= i
		while(i!=id[i]){
			i = id[i];
		}
		return i;
		
	}
	
	

}
