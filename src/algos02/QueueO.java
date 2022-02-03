/**
 * Queue (finn. jono) with an Array class that includes functions
 * enqueue, dequeue, isEmpty, size and front operations.
 * "First-In-First-Out (FIFO)"
 */
package algos02;

/**
 * @author AntiikDev
 * @version 2 Feb 2022
 */
public class QueueO {
	
	
// ------------------------- ARRAY CLASS --------------------------------
	/**
	 * Dynamic array class
	 * @author AntiikDev
	 */
	static class Array {
		
		private static final int MAXVALUES = 10;
		private int n = 0;
		private int[] array;
		
// -------- Array and queue functions --------
		/**
		 * Initialize Array
		 */
		public Array() {
			this.array = new int[MAXVALUES];
		}
		
		
		/**
		 * Initialize Array
		 * @param size of the array
		 */
		public Array(int size) {
			this.array = new int[size];
		}

	
	/**
	 * Tests if an array is empty
	 * @return true if empty, false if not
	 */
	public boolean isEmpty() {
		if ( this.n <= 0 ) return true;
		return false;
	}
	
	
	/**
	 * Size of an array stack
	 * @return number of values in an array
	 */
	public int size() {
		return this.n;
	}
	
	
	/**
	 * Adds value to the end of the array
	 * @param value that is added
	 */
	public void enqueue(int value) {
		this.array[n] = value;
	}
	
	
	/**
	 * @return first value in the array
	 */
	public int front() {
		if ( this.array == null || this.n <= 0 ) return -1;
		return this.array[0];
	}
	
	
	/**
	 * Prints array as a string
	 * @return 
	 */
	@Override
	public String toString() {
		if ( this.n == 0 || this.array.length < 0 ) return "[ ]";
		String text = "[";
		for (int i = 0; i < this.n; i++) {
			text += this.array[i];
			if ( i == n-1 ) return text += "]";
			text += ", ";
		}
		return text;
	}
}
	
// -----------------------------------------------------------------------		

	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		Array array = new Array();
		System.out.println("Array: " + array.toString());
		
		// isEmpty
		System.out.println("Is the array empty? Answer: " + array.isEmpty());
		
		// enqueue (add to end of queue)
		array.enqueue(1); array.enqueue(2);	array.enqueue(3);
		
		// front
		int firstValue = 0;
		firstValue = array.front();
		System.out.print("First value in the array: " + firstValue);
		
		// TODO dequeue (remove beginning, return value)
		int delVal = 0;
		// delVal= array.dequeue();
		System.out.println("Following value was deleted from the beginnig: " + delVal);
		
		// size
		System.out.println("Size of the array: " + array.size());
	}

}
