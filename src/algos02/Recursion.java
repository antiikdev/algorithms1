/**
 * 
 */
package algos02;

import java.util.Arrays;

/**
 * @author AntiikDev
 *
 */
public class Recursion {
	
	
	/**
	 * Find's the smallest number in array recursively
	 * @param t array
	 * @param n length of array
	 * @return smallest number in array
	 * @example
	 * <pre name="test">
	 * 	int[] t1 = { 1, 2, 3 };
	 * 	int n = t1.length - 1, smallest = n;
	 * 	findSmallest(t1, n, smallest) === 1;
	 * 	int[] t2 = { 4, 2, 0 }; n = t2.length - 1; smallest = n;
	 * 	findSmallest(t2, n, smallest) === 0;
	 * </pre>
	 */
	public static int findSmallest(int[] t, int n, int smallest) {
		if (n < 0) return smallest;
		if (t[n] < smallest) smallest = t[n];
		n--;
		smallest = findSmallest(t, n, smallest);
		return smallest;
	}
	
	
	/**
	 * Set's a given number to all array's indexses
	 * @param t array
	 * @param n length of array
	 * @param number input to an array
	 * @return array with all its indexses as number
	 */
	public static int[] setNumber(int[] t, int n, int number) {
		if ( n < 0 ) return t;
		t[n] = number;
		setNumber(t, --n, number);
		return t;
	}
	

	/**
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int[] t = { 5, 2, 1, 9, 2, 7};
		int n = t.length - 1;
		int result = 0, number = 0;
		
		// a) Find smallest
		result = findSmallest(t, n, t[n]);
		System.out.println(Arrays.toString(t));
		System.out.println("Array's smallest number is " + result + "\n");
		
		// b) Set number to array indexses
		t = setNumber(t, n, number);
		System.out.println(Arrays.toString(t));
		System.out.println("Array indexses filled with number " + number);
		
		
	}

}
