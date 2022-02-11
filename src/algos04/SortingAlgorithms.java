/**
 * Bubble and insertion sort algorithms
 */
package algos04;

import java.util.Arrays;

/**
 * @author AntiikDev
 * @ver 11 Feb 2022
 */
public class SortingAlgorithms {
	
	
	/**
	 * Bubble sort for integer number array
	 * @param array to be sorted
	 * @return sorted array
	 */
	public static int[] BubbleSort(int[] array) {
		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = array.length-2; j >=0 ; j--) {
				if (array[j] < array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	
	/**
	 * Insertion sort with integer array
	 * @param array to be sorted
	 * @return insertion sorted array
	 */
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int p = array[i];
			int j = i-1;
			while (j >= 0 && array[i] > p) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = p;
		}
		return array;
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int[] array = null;
		array = algos01.RandomArrayO1.addRandomNumbers(array, 1, 10);
		System.out.println("Random array: " + Arrays.toString(array));
		
		// Bubble sort
		array = BubbleSort(array);
		System.out.println("Bubble sort:  " + Arrays.toString(array));
		
		// TODO: Insertion sort
		System.out.println("------");
		int[] array2 = null;
		array2 = algos01.RandomArrayO1.addRandomNumbers(array2, 1, 10);
		System.out.println("Random array:   " + Arrays.toString(array2));
		array2 = insertionSort(array2);
		System.out.println("Insertion sort: " + Arrays.toString(array2));
	}

}
