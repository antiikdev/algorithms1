/**
 * Nodes (Finn. solmut) with letters in alphabetical order
 */
package algos03;

/**
 * @author AntiikDev
 * @ver 6 Feb 2022
 */
public class BinaryTreeD1 {
	
	// a) arrange nodes in alphabetical order (a < b)
					   //     0   1   2   3   4   5   6   7   8   9
	static char[] arrayA = { 'F','C','G','A','I','D','E','J','H','B'};
	/*
					F
	 		C				G
	     A    D				  I
	 		 B E			 H J
	 						  
	 */
	static Solmu B = new Solmu(arrayA[9]);
	static Solmu H = new Solmu(arrayA[8]);
	static Solmu J = new Solmu(arrayA[7]);
	static Solmu E = new Solmu(arrayA[6]);
	static Solmu D = new Solmu(arrayA[5],B,E);
	static Solmu I = new Solmu(arrayA[4],H,J);
	static Solmu A = new Solmu(arrayA[3]);
	static Solmu G = new Solmu(arrayA[2],null,I);
	static Solmu C = new Solmu(arrayA[1],A,D);
	static Solmu F = new Solmu(arrayA[0],C,G);
	
	
	/**
	 * Height of the binary tree, i.e. longest path from root node
	 * to any leaf node in the tree
	 * @param solmu Node searched
	 * @return longest path of the binary tree
	 */
	public static int binaryTreeHeight(Solmu solmu) {
		int vasen=0, oikea=0;
		if (solmu == null) return -1;
		if (solmu.left == null) {
			vasen = -1;
		} else vasen = binaryTreeHeight(solmu.left);
		if (solmu.right == null) {
			oikea = -1;
		} else oikea = binaryTreeHeight(solmu.right);
		if ( vasen > oikea ) return vasen+1;
		else return oikea+1;
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int result = 0;
		result = binaryTreeHeight(F);
		System.out.println("Height of the binary tree: " + result);
	}

}
