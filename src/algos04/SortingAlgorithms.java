/**
 * Bubble sort and ... algorithms
 */
package algos04;

import java.util.Arrays;

/**
 * @author AntiikDev
 * @ver 11 Feb 2022
 */
public class SortingAlgorithms {
	
	
	/**
	 * Bubble sort for integer numbers
	 * @param array to be sorted
	 * @return sorted array
	 */
	public static int[] BubbleSort(int[] array) {
		return array;
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int[] array = null;
		array = algos01.RandomArrayO1.addRandomNumbers(array, 0, 10);
		System.out.println(Arrays.toString(array));
		
		// Bubble sort
		array = BubbleSort(array);
		System.out.println(Arrays.toString(array));
		
		// TODO: sort
		array = algos01.RandomArrayO1.addRandomNumbers(array, 0, 10);
		System.out.println(Arrays.toString(array));
		
	}

}
