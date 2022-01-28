/**
 * Stack operations - Pino operaatiot (Finnish)
 */
package algos02;

import java.util.Arrays;

/**
 * @author AntiikDev
 * @version 28 Jan 2022
 */
public class Stack {
	
	
// ------------------------- ARRAY CLASS --------------------------------
	/**
	 * Dynamic array class
	 * @author AntiikDev
	 * NOTE: STATIC class Array, since inner class of an class Stack
	 */
	static class Array {
		
		private static final int MAXVALUES = 10;
		private static int n = 0;
		private int[] array;
		
		
		public Array() {
			this.array = new int[MAXVALUES];
		}
		
		
		/**
		 * Adds value on top of the stack
		 * @param value added
		 */
		public void push(int value) {
			this.array[n] = value;
			n++;
		}
		
		
		/**
		 * Returns and removes a value on top of the stack
		 * @param value added
		 */
		public int pop() {
			if ( n < 0 ) return -1;
			int temp = n - 1;
			Array.n--;
			return this.array[temp];
		}
		
		
		/**
		 * Tests if an array is empty
		 * @return true if empty, false if not
		 */
		public boolean isEmpty() {
			if ( this.array == null || this.array.length < 0 ) return true;
			return false;
		}
		
		
		/**
		 * Size of an array stack
		 * @return number of values in an array
		 */
		public int size() {
			return n;
		}
		
		
		/**
		 * Top most value in array stack
		 * @return top most value in array stack
		 */
		public int top() {
			return this.array[n-1];
		}
		
		
		/**
		 * Initializes an array with zeroes
		 * @param array that is initialized
		 * @param number for all the values
		 * @return array with zeroes in all values
		 */
		public void initialize(int[] array) {
			for (int i = 0; i < array.length; i++) {
				array[i] = 0;
			}
		}
		
		
		/**
		 * Prints array as a string
		 * @return 
		 */
		@Override
		public String toString() {
			if ( Array.n == 0 || this.array.length < 0 ) return "[ ]";
			String text = "[";
			for (int i = 0; i < Array.n; i++) {
				text += this.array[i];
				if ( i == n-1 ) return text += "]";
				text += ", ";
			}
			return text;
		}
	}
	
// -----------------------------------------------------------------------
	

	/**
	 * @param args not in use
	 */
	public static void main(String[] args) {
		Array a = new Array();
		System.out.println(a.toString());
		
		// Operate: remove two values (variables, finn. alkio) and
		// replace with one new
		a.push(1); a.push(2); a.push(3);
		System.out.println(a.toString());
		int removed1 = a.pop(), removed2 = a.pop();
		int sum = removed1 + removed2;
		a.push(sum);
		System.out.println(a.toString());
		
		// Sink: move stack top to first - other values go up in stack
		// pop, 
	}

}
