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
	 * @param array with integers to be sorted
	 * @return sorted integer array
	 */
	public static int[] bubbleSort(int[] array) {
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
	 * Bubble sort for String
	 * @param String to be sorted
	 * @return sorted  String
	 */
	public static String bubbleSort(String array) {
		char temp;
		char[] ca = stringToChar(array);
		
		for (int i = 1; i < ca.length; i++) {
			for (int j = ca.length-2; j >=0 ; j--) {
				if (ca[j] < ca[j+1]) {
					temp = ca[j];
					ca[j] = ca[j+1];
					ca[j+1] = temp;
				}
			}
		}
		String result = String.valueOf(ca);
		return result;
	}
	
	
	/**
	 * This function prints String to char
	 * @param array String printed to char
	 * @return char array
	 */
	public static char[] stringToChar(String array) {
		char[] ca = new char[array.length()];
		for (int i = 0; i < array.length(); i++) {
			ca[i] = array.charAt(i);
		}
		return ca;
	}
	
	
	/**
	 * Insertion sort with integer array
	 * @param array with integers to be sorted
	 * @return sorted integer array
	 */
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int p = array[i];
			int j = i-1;
			while (j >= 0 && array[j] > p) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = p;
		}
		return array;
	}
	
	
	/**
	 * Insertion sort with String
	 * @param String to be sorted
	 * @return sorted  String
	 */
	public static String insertionSort(String array) {
		char[] ca = stringToChar(array);
		
		for (int i = 1; i < ca.length; i++) {
			char p = ca[i];
			int j = i-1;
			while (j >= 0 && ca[j] > p) {
				ca[j+1] = ca[j];
				j = j-1;
			}
			ca[j+1] = p;
		}
		String result = String.valueOf(ca);
		return result;
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int[] array = null;
		array = algos01.RandomArrayO1.addRandomNumbers(array, 1, 10);
		System.out.println("Random array: " + Arrays.toString(array));
		
		// Bubble sort - INT array
		array = bubbleSort(array);
		System.out.println("Bubble sort:  " + Arrays.toString(array));
		
		// Insertion sort - INT array
		System.out.println("------");
		int[] array2 = null;
		array2 = algos01.RandomArrayO1.addRandomNumbers(array2, 1, 10);
		System.out.println("Random array:   " + Arrays.toString(array2));
		array2 = insertionSort(array2);
		System.out.println("Insertion sort: " + Arrays.toString(array2));
		
		// Bubble sort - char array
		String line = "REKURSIO";
		System.out.println("------");
		System.out.println("Original String:      " + line);
		line = bubbleSort(line);
		System.out.println("String bubble sorted: " + line);
		
		// Bubble sort - char array
		line = "REKURSIO";
		System.out.println("------");
		System.out.println("Original String:         " + line);
		line = insertionSort(line);
		System.out.println("String insertion sorted: " + line);
	}

}
