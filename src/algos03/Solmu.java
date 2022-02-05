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

import java.util.Arrays;

/**
 * @author AntiikDev
 * @ver 4 Feb 2022
 */
public class Solmu {
	
	public char key;
	public Solmu left;
	public Solmu right;

	
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
	 * Adds left node (solmu)
	 * @param l left node
	 */
	public void addLeft(Solmu l) {
		this.left = l;
	}
	
	
	/**
	 * Adds right node (solmu)
	 * @param r right node
	 */
	public void addRight(Solmu r) {
		this.right = r;
	}
	
	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		//				  0   1   2   3   4   5   6   7   8   9
		char[] array = { 'h','c','j','a','e','l','d','f','k','b'};
		// Add nodes (Finn. solmut)
		Solmu b = new Solmu(array[9]);
		Solmu k = new Solmu(array[8]);
		Solmu f = new Solmu(array[7]);
		Solmu d = new Solmu(array[6]); d.addLeft(b);
		Solmu e = new Solmu(array[4],d,f);
		Solmu a = new Solmu(array[3]);
		Solmu l = new Solmu(array[8]); l.addLeft(k);
		Solmu j = new Solmu(array[2]); j.addRight(l);
		Solmu c = new Solmu(array[1],a,e);
		Solmu h = new Solmu(array[0]);
		
		char[] keyValues = new char[10];
		// keyValues = esijarjestys();
		System.out.println(Arrays.toString(keyValues));
	}

}
