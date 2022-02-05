/**
 * Binary tree nodes (Finnish "solmu).
 * 			-------h---------
 * 			c				j
 * 		--------			----
 * 		a		e				l
 * 			  -----			----	
 * 			 d	   f		k
 * 		   -
 *  	  b
 */

package algos03;


/**
 * @author AntiikDev
 * @ver 4 Feb 2022
 */
public class Solmu {
	
	public char key;
	public Solmu left;
	public Solmu right;
	
					  //     0   1   2   3   4   5   6   7   8   9
	static char[] array = { 'h','c','j','a','e','l','d','f','k','b'};

	// Nodes (Finn. solmut)
	static Solmu b = new Solmu(array[9]);
	static Solmu k = new Solmu(array[8]);
	static Solmu f = new Solmu(array[7]);
	static Solmu d = new Solmu(array[6],b,null); // d.addLeft(b);
	static Solmu e = new Solmu(array[4],d,f);
	static Solmu a = new Solmu(array[3]);
	static Solmu l = new Solmu(array[5],k,null); // l.addLeft(k);
	static Solmu j = new Solmu(array[2],null,l); // j.addRight(l);
	static Solmu c = new Solmu(array[1],a,e);
	static Solmu h = new Solmu(array[0],c,j);
	
	
	/**
	 * Initialize empty Solmu (binary tree's node)
	 */
	public Solmu() {
		// Class intialized attributes are null
	}
	
	/**
	 * Initialize Solmu
	 * @param value of char
	 */
	public Solmu(char value) {
		this.key = value;
	}
	
	
	/**
	 * Initialize Solmu
	 * @param value of char
	 * @param l left Solmu (binary tree's node)
	 * @param r right Solmu (binary tree's node)
	 */
	public Solmu(char value, Solmu l, Solmu r) {
		this.key = value;
		this.left = l;
		this.right = r;
	}	
	
	
	/**
	 * Preorder (Finn. esijarjestys) 1. node, 2. right, 3 left
	 * Prints binary tree node (Finn. solmu)
	 * @param solmu printed
	 */
	public static void esijarjestys(Solmu solmu) {
		System.out.print(solmu.key);
		if (solmu.left != null) esijarjestys(solmu.left);
		if (solmu.right != null) esijarjestys(solmu.right);
	}
	
	
	/**
	 * Inorder (Finn. sisajarjestys) 1. left, 2 node, 3. right
	 * Prints binary tree node (Finn. solmu)
	 * @param solmu printed
	 */
	public static void sisajarjestys(Solmu solmu) {
		if (solmu.left != null) sisajarjestys(solmu.left);
		System.out.print(solmu.key);
		if (solmu.right != null) sisajarjestys(solmu.right);
	}
	
	
	/**
	 * Postorder (Finn. jalkijarjestys): 1. left, 2 right 3. node
	 * Prints binary tree node (Finn. solmu)
	 * @param solmu printed
	 */
	public static void jalkijarjestys(Solmu solmu) {
		if (solmu.left != null) jalkijarjestys(solmu.left);
		if (solmu.right != null) jalkijarjestys(solmu.right);
		System.out.print(solmu.key);
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		
		// Preorder (Finn. esijarjestys): 1. node, 2. right, 3 left
		System.out.print("Preorder (Finn. esijarjestys): ");
		esijarjestys(h);
		System.out.println();
		
		// Inorder (Finn. sisajarjestys): 1. left, 2 node, 3. right
		System.out.print("Inorder (Finn. sisajarjestys): ");
		sisajarjestys(h);
		System.out.println();
		
		// Postorder (Finn. jalkijarjestys): 1. left, 2 right 3. node
		System.out.print("Postorder (Fi jalkijarjestys): ");
		jalkijarjestys(h);
		System.out.println();
	}

}
