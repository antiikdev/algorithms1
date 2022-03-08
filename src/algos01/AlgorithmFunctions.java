/**
 * Small algorithms with evalutions
 * 
 */
package algos01;

import java.util.Arrays;

/**
 * @author Antiik.dev
 * @version 21 Jan 2022
 *
 */
public class AlgorithmFunctions {

	
	/**
	 * Difference between biggest and smallest number in an array
	 * <Evaluation>
	 * Algorithm processing time based on array size:
	 * Processing time is linear as each of the array indexes
	 * are searched for min and max:
	 * T(n) = n * t1 + t2 = O(n)
	 * </Evaluation>
	 * @param array where random integer numbers
	 * @return difference between biggest and smallest numbers
	 */														// time complexity/
	public static int findMaxMinDifference(int[] array) {	// suoritusaika:
		int smallest = array[0];							// vakio
		int biggest = array[0];								// vakio
		
		for (int i = 1; i < array.length; i++) {			// loop n-1
			if ( array[i] < smallest ) smallest = array[i];	// (aina) tarvittaessa
			if ( array[i] > biggest ) biggest = array[i];	// (aina) tarvittaessa
		}
		System.out.println("Biggest number: " + biggest);
		System.out.println("Smallest number: " + smallest);
		return biggest - smallest;							// vakio
	}
	
	
	/**
	 * Zeroes or dublicate numbers in an array
	 * @param array with positive integers
	 * @return number of zeroed indexes in an array
	 * <Evaluatio>
	 * T(n) = n * t1 + T2 = O(n)
	 * Linear
	 * </Evaluation>
	 */
	public static int zeroDoubleNumbers(int[] array) {	// Suoritusaika:
		if ( array.length <= 0) return 0;				// vakio
		int zeroes = 0;	// count amount of zeroes 			// vakio
		int temp = array[0];							// vakio
		
		for ( int i = 1; i < array.length; i++ ) {		// loop n-1
			if ( array[i] == temp) {					// everytime
				array[i] = 0;							// if needed
				zeroes++;
			}
			else temp = array[i];						// if needed
		}
		return zeroes;
	}
	
	
	/**
	 * Main for algorithms testing purpose
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// D02a max min difference (substraction)
		int minMaxDif = 0;
		int[] array1 = new int[100];
		
		array1 = RandomArrayO1.addRandomNumbers(array1, 0, 100);
		minMaxDif = findMaxMinDifference(array1);
		System.out.println("Difference between biggest and smallest is " + minMaxDif);
		System.out.println();
		
		// D02b zero dublicate positive integer numbers and count them
		int numberOfZeros = 0;
		int[] array2 = { 2, 4, 4, 8, 10, 15, 22, 22 };
		numberOfZeros = zeroDoubleNumbers(array2);
		System.out.println("Number of double numbers zeroed: " + numberOfZeros);
		System.out.println(Arrays.toString(array2));
		System.out.println();
	}

}
