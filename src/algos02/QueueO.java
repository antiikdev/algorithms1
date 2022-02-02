/**
 * Queue (finn. jono) with enqueue, dequeue, isEmpty,
 * size and front operations.
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
	}
// -----------------------------------------------------------------------		

	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		Array a = new Array(10);
		
		// TODO enqueue
		// TODO dequeue
		// TODO isEmpty
		// TODO size
		// TODO front
		
	}

}
