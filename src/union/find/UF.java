package union.find;

// Illustrate union find using quick find

public class UF {
	
	// a primitive array to hold the objects
	private int[] id;
	
	// initialize the array elements with values same as the index
	public UF(int n) {
		id = new int[n];
		for (int i=0; i<n; i++) {
			id[i] = i;
		}
	}
	
	// connected if and only if the value of p is equal to the value of q
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	// connect all the objects
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		
		// check if the value pid is equal to the current value
		// if so then assign qid to the current value
		for (int i = 0; i < id.length; i++) {
			if(id[i] == pid) {
				id[i] = qid;
			}
		}
	}

	public static void main(String[] args) {
		// init the array
		UF uf = new UF(6);
		// perform a few union operations
		uf.union(2, 3);
		uf.union(3, 4);
		uf.union(1, 3);
		// check if 1 and 4 are connected
		if(uf.connected(1, 4)) {
			System.out.println("Connected!!");
		}
		else {
			System.out.println("Not Connected!!");
		}
		
	}

}
