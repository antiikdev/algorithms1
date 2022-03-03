/**
 * LinkedList
 * Source for the basics of LinkedList and Node:
 * https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 */
package algos02;

/**
 * @author AntiikDev
 * @version 30 Jan 2022
 */
public class LinkedList {
	Node first; // head of list, i.e. first value's pointer
	Node last; // last of the list, i.e. pointer to last value

	
// ----------------- Linked list node -----------------
	static class Node {
		int data;
		Node next;
		
		/**
		 * Constructor for new node
		 * Next null by default
		 */
		Node () {
			next = null;
		}
		
		/**
		 * Constructor for new node
		 * Next null by default
		 * @param d data value
		 */
		Node (int d) {
			data = d;
			next = null;
		}
		
		/**
		 * Addes data to a node
		 * @param d data added
		 */
		public void addData(int d) {
			data = d;
		}
		
		public int getData() {
			return data;
		}
		
	}
// --------------------------------------------------
	
	
	/**
	 * Inserts new node
	 * @param list where inserted
	 * @param data that is inserted
	 * @return list by head
	 */
	public static LinkedList insert(LinkedList list, int data) {
		// New node with data
		Node new_node = new Node(data);
		new_node.next = null;
		
		// If list is empty, new node as head
		if (list.first == null) list.first = new_node;
		else {
			// till the last node and insert new_node there
			Node last = list.first;
			while (last.next != null) {
				last = last.next;
			}
			// Insert new_node at last node
			last.next = new_node;
		}
		return list;	
	}
	
	
	/**
	 * Inserts 'last' reference that points to the final value of the LinkedList
	 * @param list where the 'last' is inserted
	 */
	public static LinkedList insertLastPointer(LinkedList list) {
		if ( list.first == null ) return list;
		int size = list.size(list);
		
		Node last = list.first;
		for (int i = 0; i < size; i++) {
			last = last.next;
			i++;
		}
		last = last.next;
		list.last = last;
		return list;
	}
	
	
	/**
	 * Calculates LinkedList size
	 * @param list that size is calculated
	 * @return size of the list
	 */
	public int size(LinkedList list) {
		Node currentNode = list.first;
		int size = 0;
		
		while (currentNode !=null) {
			size++;
			currentNode = currentNode.next;
		}
		return size;
	}
	
	
	/**
	 * Prints list
	 * @param list that is printed
	 */
	public static void printList(LinkedList list) {
		Node currentNode = list.first;
		System.out.print("LinkedList: ");
		
		while (currentNode !=null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	
	/**
	 * Changes place of first and last nodes of the list
	 * @param list what is changed
	 * @return list where first and last values have been changed
	 * NOTE: Only data changed
	 */
	public static LinkedList changeFirstLast(LinkedList list) {
		if (list.first == null) return list; // empty list
		if (list.first.next == null) return list; // only one node
		
		int firstData = list.first.getData();
		int lastData = list.last.getData();
		
		list.first.addData(lastData);
		list.last.addData(firstData);
		
		return list;
	}
// ---------------------------------------------------------------	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		printList(list);
		
		// Adds last pointer
		System.out.println("Size of the list: " + list.size(list));
		insertLastPointer(list);
		System.out.println("Last value in the list: " + list.last.getData());
		
		// Change first and last 
		System.out.print("LinkedList after first and last values changed: ");
		changeFirstLast(list);
		printList(list);
	}

}
