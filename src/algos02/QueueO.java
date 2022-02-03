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
		
		private int QMAX = 6; // Max. number of values
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
	 * @return array's length
	 */
	public int length() {
		return this.array.length;
	}

	
	/**
	 * Tests if queue is empty
	 * @return true if empty, false if not
	 */
	public boolean isEmpty() {
		if ( f == b ) return true;
		return false;
	}
	
	
	/**
	 * Size of a queue
	 * @return number of values in an array
	 */
	public int size() {
		int size = 0;
		for (int i = f; i < b; i++) {
			size++;
		}
		return size;
	}
	
	
	/**
	 * Adds value to the end of the array
	 * @param value that is added
	 */
	public void enqueue(int value) {
		if ( (f==0 && b >= QMAX-1) || (f>0 && f-b==1) ) return;
		if ( b < QMAX-1) {
			this.array[b++] = value;
		} else {
			b = 0;
			this.array[b] = value;
		}
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
	 * @return string
	 */
	@Override
	public String toString() {
		if ( f == b) return "Empty";
		String text = "";
		
		for(int i = f; i < this.array.length; i++) {
			if (this.array[i] != 0) {
				text += this.array[i];
				// if ( i == b-1 ) return text += "]";
				text += " ";
			}
		}
		
		if (f > 0 && b == 0) {
			for(int y = 0; y <= b; y++) {
				if (this.array[y] != 0) {
					text += this.array[y];
					// if ( y == b-1 ) return text += "]";
					text += " ";
				}	
			}
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
		System.out.println("Array's total length: " + array.length());
		
		// isEmpty
		System.out.println("Is the array really empty?");
		System.out.println("Answer: "+ array.isEmpty() + ", as size: " + array.size());
		System.out.println();
		
		// enqueue (add to end of queue)
		System.out.println("Enqueues: ");
		array.enqueue(1);
		System.out.println(array.toString());
		array.enqueue(2);
		System.out.println(array.toString());
		array.enqueue(3);
		System.out.println(array.toString());
		array.enqueue(4);
		System.out.println(array.toString());
		
		// front
		int firstValue = 0;
		firstValue = array.front();
		System.out.println("First value in the queue: " + firstValue);
		
		// dequeue (remove beginning, return value)
		int delVal = 0;
		delVal= array.dequeue();
		System.out.println("Dequeue deleted value from the queue: " + delVal);
		System.out.println("Queue after dequeue: " + array.toString());
		
		// size
		System.out.println("Size of the array: " + array.size());
		firstValue = array.front();
		System.out.println("First value in the queue: " + firstValue);
		
		
		// enqueue (add to end of queue)
		System.out.println();
		System.out.println("More enqueues: ");
		array.enqueue(5);
		System.out.println(array.toString());
		array.enqueue(6);
		System.out.println(array.toString());
	}

}
