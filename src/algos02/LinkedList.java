/**
 * LinkedList 
 * Source for the basics:
 * https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 */
package algos02;

/**
 * @author AntiikDev
 * @version 30 Jan 2022
 */
public class LinkedList {
	
	
	class Node {
		int data;
		Node next;
		
		/**
		 * Constructor for new node
		 * Next null by default
		 * @param d data value
		 */
		Node (int d) {
			data = d;
			next = null;
		}
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
