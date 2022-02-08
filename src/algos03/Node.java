/**
 * Binary tree nodes (Finn. solmut) in a) orders
 * as well as a) and b) search with variable pointers
 *                        30
 *           20                    37
 *       15     23             32      40
 *         16                31  33
 * 
 */
package algos03;

/**
 * @author AntiikDev
 * @ver 6 Feb 2022
 */
public class Node {

	public int key;
	public Node left;
	public Node right;
					 //     0   1   2   3   4   5   6   7   8   9
	static int[] array = { 30, 20, 37 , 15, 23, 32, 40, 16, 31, 33};
	
	
	// Nodes (Finn. solmut)
	static Node thirtythree = new Node(array[9]);
	static Node thirtyone = new Node(array[8]);
	static Node sixteen = new Node(array[7]);
	static Node fourty = new Node(array[6]);
	static Node thirtytwo = new Node(array[5], thirtyone, thirtythree);
	static Node twentythree = new Node(array[4]);
	static Node fifteen = new Node(array[3], null, sixteen);
	static Node thirtyseven = new Node(array[2], thirtytwo, fourty);
	static Node twenty = new Node(array[1], fifteen, twentythree);
	static Node thirty = new Node(array[0], twenty, thirtyseven);

	
	/**
	 * Initialize empty Solmu (binary tree's node)
	 */
	public Node() {
		// Class intialized attributes are null
	}
	
	/**
	 * Initialize Solmu
	 * @param value of char
	 */
	public Node(int value) {
		this.key = value;
	}
	
	
	/**
	 * Initialize Solmu
	 * @param value of char
	 * @param l left Solmu (binary tree's node)
	 * @param r right Solmu (binary tree's node)
	 */
	public Node(int value, Node l, Node r) {
		this.key = value;
		this.left = l;
		this.right = r;
	}	
	

	/**
	 * Preorder (Finn. esijarjestys) 1. node, 2. right, 3 left
	 * Prints binary tree node (Finn. solmu)
	 * @param solmu printed
	 */
	public static void esijarjestys(Node solmu) {
		System.out.print(solmu.key + " ");
		if (solmu.left != null) esijarjestys(solmu.left);
		if (solmu.right != null) esijarjestys(solmu.right);
	}
	
	
	/**
	 * Inorder (Finn. sisajarjestys) 1. left, 2 node, 3. right
	 * Prints binary tree node (Finn. solmu)
	 * @param solmu printed
	 */
	public static void sisajarjestys(Node solmu) {
		if (solmu.left != null) sisajarjestys(solmu.left);
		System.out.print(solmu.key + " ");
		if (solmu.right != null) sisajarjestys(solmu.right);
	}
	
	
	/**
	 * Postorder (Finn. jalkijarjestys): 1. left, 2 right 3. node
	 * Prints binary tree node (Finn. solmu)
	 * @param solmu printed
	 */
	public static void jalkijarjestys(Node solmu) {
		if (solmu.left != null) jalkijarjestys(solmu.left);
		if (solmu.right != null) jalkijarjestys(solmu.right);
		System.out.print(solmu.key + " ");
	}
	
	
	/**
	 * Searches binary tree for a node.key value and
	 * prints search Node p pointer and Node c candidate values in the end
	 * @param h key value that is searched
	 * @param thirty first node of the binary tree
	 * @return true if value is found, false if not
	 */
	public static boolean searchVariable(int h, Node thirty) {
		Node p = thirty; // pointer Node
		Node c = null; // candidate Node
		
		while (p != null) {
			if (h <= p.key) {
				c = p;
				p = p.left;
			}
			if (h > p.key) {
				p = p.right;
			}
			if (c != null && c.key == h) {
				System.out.println("p key value: null" + ", c key value: " + c.key);
				return true;
			}
		}
		System.out.println("p key value: null" + ", c key value: " + c.key);
		return false;
	}
	
	
	/**
	 * Searches longest distance between the binary tree integer key values
	 * <example>
	 * distance(p,q)=|p.key-q.key| = 31-24 = 7
	 * </example>
	 * @param solmu node searched
	 * @return longest distance between the binary tree integer key values
	 */
	public static int distance(Node solmu) {
		int left=0, right=0;
		if (solmu == null) return 0;
		
		if (solmu.left != null) {
			left += solmu.key - solmu.left.key;
			left += distance(solmu.left);
		}
		
		if (solmu.right != null) {
			right += solmu.right.key - solmu.key;
			right += distance(solmu.right);
		}
		
		if ( left > right ) return left;
		else return right;
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		
		// ------------- Print in order --------------------
		System.out.println("------------ Print in order --------------");
		// Preorder (Finn. esijarjestys): 1. node, 2. right, 3 left
		System.out.print("Preorder (Finn. esijarjestys): ");
		esijarjestys(thirty);
		System.out.println();
		
		// Inorder (Finn. sisajarjestys): 1. left, 2 node, 3. right
		System.out.print("Inorder (Finn. sisajarjestys): ");
		sisajarjestys(thirty);
		System.out.println();
		
		// Postorder (Finn. jalkijarjestys): 1. left, 2 right 3. node
		System.out.print("Postorder (Fi jalkijarjestys): ");
		jalkijarjestys(thirty);
		System.out.println();
		
		// ------------- Search variable --------------------
		System.out.println("------------ Search variable --------------");
		int h = 32; // variable key number that is searched (h.key)
		boolean searchResult = searchVariable(h, thirty);
		System.out.println(searchResult);
		
		h = 24;
		searchResult = searchVariable(h, thirty);
		System.out.println(searchResult);
		
		// ------------ Search longest integer value distance -------------
		System.out.println("------ Search longest integer value distance ------");
		int result = 0;
		result = distance(thirty);
		System.out.println(result);
		
	}

}
