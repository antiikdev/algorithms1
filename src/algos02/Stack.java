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
		private int n = 0;
		private int[] array;
		
		
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
		 * Pushes a value on top of the stack
		 * @param value pushed
		 */
		public void push(int value) {
			this.array[n] = value;
			this.n++;
		}
		
		
		/**
		 * Returns and removes a value from top of the stack
		 * @param value added
		 */
		public int pop() {
			if ( n < 0 ) return -1;
			int temp = n-1;
			n--;
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
		 * Deletes all values from the stack's array
		 */
		public void delete() {
			n = 0;
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
	 * Main for testing the stack 
	 * @param args not in use
	 */
	public static void main(String[] args) {
		
		// Operate: remove two values (variables, finn. alkio) and
		// replace with one new
		// ----------------------------------------
		System.out.println("Operate:");
		Array a = new Array();
		System.out.println(a.toString());
		for (int i = 1; i < 4; i++) {
			a.push(i);
		}
		System.out.println(a.toString());
		
		int removed1 = a.pop(), removed2 = a.pop();
		int sum = removed1 + removed2;
		a.push(sum);
		System.out.println(a.toString());
		
		
		// Sink: move stack's top value to first, other values go up in stack
		// ----------------------------------------
		System.out.println("Sink:");
		Array b = new Array();
		// Array from 1 to 4
		for (int i = 1; i < 5; i++) {
			b.push(i);
		}
		System.out.println(b.toString());
		int finalValue = b.pop();
		
		Array c = new Array();
		int temp = 0;
		
		while (b.size() > 0) {
			temp = b.pop();
			c.push(temp);
		}
		System.out.println(c.toString());
		
		Array d = new Array();
		c.push(finalValue);
		while (c.size() > 0) {
			temp = c.pop();
			d.push(temp);
		}
		System.out.println(d.toString());
		
		
		// Flips the stack upside down
		// ----------------------------------------
		System.out.println("Flip:");
		Array e = new Array();
		// Array from 1 to 4
		for (int i = 1; i < 5; i++) {
			e.push(i);
		}
		System.out.println(e.toString());
		
		Array f = new Array();
		int temps = 0;
		
		while (e.size() > 0) {
			temps = e.pop();
			f.push(temps);
		}
		System.out.println(f.toString());
		
		
		// STRING "DAGEBFICH": remove in alphabethical order using stacks
		// ----------------------------------------
		/* TODO: Would require an array class that saves char values
		System.out.println("String remove in alphabetical order");
		String line = "DAGEBFICH";
		Array one = new Array(), two = new Array(), three = new Array(), four = new Array();
		// Order: A(1), B(4), C(7), D(0), E(3), F(5), G(2), H(8), I(6)
		// Stacks#: one(-D,-A,-B,-C), two(-G, -F), three(-E), d(-I)
		
		// D one.push(line), A one.push(line) one.pop(A), G two.push(line),
		char D = line.charAt(0); one.push(D); // D
		char A = line.charAt(1); one.push(A); one.pop(); // A
		char G = line.charAt(2); two.push(G); // G
		
		// E three.push(line), B one.push(line) one.pop(B), F two.push(line),
		char E = line.charAt(3); three.push(E); // E
		char B = line.charAt(4); one.push(B); one.pop(); // B
		char F = line.charAt(5); two.push(F); // F
		
		// I four.push(line), C one.push(line) one.pop(C), one.pop(D) three.pop(E)
		char I = line.charAt(6); four.push(I); // I
		char C = line.charAt(7); one.push(C); one.pop(); one.pop(); three.pop(); // C D E
		
		// two.pop(F) two.pop(G), H one.push(line) one.pop(H) d.pop(I)
		two.pop(); two.pop();
		char H = line.charAt(6); one.push(H); one.pop(); one.pop(); // H I
		
		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
		System.out.println(four.toString());
		*/
		
		// STRING "IDCBHGAFE": remove in alphabethical order using stacks
		// ----------------------------------------
		// String line2 = "IDCBHGAFE";
		// Stacks#: one(-I,-H,-G,-F,-E), two(-D,-C,-B-A)
		// I one.push(I), D two.push(D), C two.push(C), B two.push(B),
		// H one.push(H), G one.push(G),
		// A one.push(A), one.pop() A,B,C,D
		// F one.push(F), E one.push(E), one.pop() E,F,G,H,I
	}

}
