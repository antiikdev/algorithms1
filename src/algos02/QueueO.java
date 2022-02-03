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
		
		private int QMAX = 10; // Max. number of values
		private int f = 0; // first value index
		private int b = 0; // index before the last value
		private int[] array;
		
// -------- Array and queue functions --------
		/**
		 * Initialize Array
		 */
		public Array() {
			this.array = new int[QMAX];
		}
		
		
		/**
		 * Initialize Array
		 * @param size of the array
		 */
		public Array(int size) {
			this.array = new int[size];
			this.QMAX = size;
		}

	
	/**
	 * Tests if an array is empty
	 * @return true if empty, false if not
	 */
	public boolean isEmpty() {
		if ( f == b ) return true;
		return false;
	}
	
	
	/**
	 * Size of an array stack
	 * @return number of values in an array
	 */
	public int size() {
		return this.array.length;
	}
	
	
	/**
	 * Adds value to the end of the array
	 * @param value that is added
	 */
	public void enqueue(int value) {
		if ( this.b >= this.QMAX-1 ) return;
		if ( b < QMAX-1) {
			this.array[b++] = value;
		} else b = 0;
		
	}
	
	
	/**
	 * @return first value in the array
	 */
	public int front() {
		if ( f == b) return -1;
		return this.array[f];
	}
	
	
	/**
	 * Returns and removes value from the beginning of the queue
	 * @return first value from the queue
	 */
	public int dequeue() {
		if ( f == b ) return -1;
		
		int temp = this.array[f];
		
		if ( f < QMAX -1 ) f++;
		else f = 0;
		return temp;
	}
	
	
	/**
	 * Prints array as a string
	 * @return 
	 */
	@Override
	public String toString() {
		if ( f == b) return "[ ]";
		String text = "[";
		for (int i = f; i < b; i++) {
			text += this.array[i];
			if ( i == b-1 ) return text += "]";
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
		System.out.println("Array in the beginning: " + array.toString());
		
		// isEmpty
		System.out.println("Is the array empty? Answer: " + array.isEmpty());
		
		// enqueue (add to end of queue)
		array.enqueue(1);
		System.out.println(array.toString());
		array.enqueue(2);
		System.out.println(array.toString());
		array.enqueue(3);
		System.out.println(array.toString());
		array.enqueue(4);
		System.out.println("Queue after enqueues: " + array.toString());
		
		// front
		int firstValue = 0;
		firstValue = array.front();
		System.out.println("First value in the queue: " + firstValue);
		
		// TODO dequeue (remove beginning, return value)
		int delVal = 0;
		delVal= array.dequeue();
		System.out.println("Dequeue deleted value from the queue: " + delVal);
		System.out.println("Queue after dequeue: " + array.toString());
		
		// size
		System.out.println("Size of the array: " + array.size());
		firstValue = array.front();
		System.out.println("First value in the queue: " + firstValue);
	}

}
