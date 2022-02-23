/**
 * Algorithms to find duplicate integers from
 * random and ascending order arrays
 */
package algos05;

import java.util.Arrays;

/**
 * @author AntiikDev
 * @version 22 Feb 2022
 */
public class Duplicate {
	
	
// --------------------- ASCENDING INT ARRAY ----------------------------
	
	/**
	 * Non-recursive method to search duplicates from ascending order int array 
	 * @param a array with ascending order integer numbers
	 */
	public static void nonRecursiveAscendingDuplicates(int[] a) {
		if ( a.length < 0 ) return;
		
		for (int i = 0; i < a.length-1; i++) {
			int examinee = a[i];
			
			for (int j = i+1; j < a.length-1; j++) {
				if ( a[j] > examinee ) break;
				if ( examinee == a[j] ) {
					System.out.print(a[j] + " ");
					break;
				}
			}
		}
		if ( a[a.length-2] == a[a.length-1] ) {
			System.out.print(a[a.length-1] + " ");
		}
	}
	
	
	/**
	 * Rrecursive method to search duplicates from ascending order int array
	 * @param a array with ascending order integer numbers
	 */
	public static void recursiveAscendingDuplicates(int[] a, int value, int currentValueIndex, int nextIndex) {
		if ( a.length <= 0 ) return;
		
		if ( currentValueIndex >= a.length-2 ) { // end of recursio
			if ( a[a.length-2] == a[a.length-1] ) {
				System.out.print(a[a.length-1] + " ");
			}
			return;
		}
		
		if ( value == a[nextIndex] ) {
			System.out.print(a[nextIndex] + " ");
			currentValueIndex +=2;
			value = a[currentValueIndex];
			nextIndex=currentValueIndex;
		}
		if ( nextIndex >= a.length-1 ) {
			currentValueIndex++;
			value = a[currentValueIndex];
			nextIndex=currentValueIndex;
		}
		nextIndex++;
		recursiveAscendingDuplicates(a, value, currentValueIndex, nextIndex);
	}
	
	
// --------------------- RANDOM INT ARRAY ----------------------------
	
	/**
	 * Recursive method to find duplicates from a random int array
	 * @param a array with random integer numbers
	 */
	public static void recursiveRandomDuplicates(int[] a, int value, int currentValueIndex, int nextIndex) {
		if ( a.length <= 0 ) return;
		if ( currentValueIndex >= a.length-2 ) return; // end of recursio
		
		if ( value == a[nextIndex] ) { // duplicate found
			System.out.print(a[nextIndex] + " ");
			currentValueIndex++;
			value = a[currentValueIndex];
			nextIndex=currentValueIndex;
		}
		if ( nextIndex >= a.length-1 ) { // next number to search
			currentValueIndex++;
			value = a[currentValueIndex];
			nextIndex=currentValueIndex;
		}
		nextIndex++;
		recursiveRandomDuplicates(a, value, currentValueIndex, nextIndex);
	}
	
	
	/**
	 * Non-recursive method to find duplicates from a random int array
	 * @param a array with random integer numbers
	 */
	public static void nonRecursiveRandomDuplicates(int[] a) {
		if ( a.length <= 0 ) return;
		
		for (int i = 0; i < a.length; i++) {
			int examinee = a[i];
			
			for (int j = i+1; j < a.length; j++) {
				if ( examinee == a[j] ) {
					System.out.print(a[j] + " ");
					break;
				}
			}
		}
	}
// ------------------------------------------------------------------	

	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// ------------------- RANDOM ORDER ARRAY ---------------------
		// Non-recursive method to search random int array duplicates
		System.out.println("--Non-recursive-- method to search"
				+ " duplicates from random integer array");
		int[] a = { 0,9,2,3,6,7,3,0,4,9 };
		// int[] a = null;
		// a = algos01.RandomArrayO1.addRandomNumbers(a, 0, 10);
		System.out.println(Arrays.toString(a));
		System.out.print("Duplicate numbers in the array: ");
		nonRecursiveRandomDuplicates(a);
		System.out.println();
		
		// Recursive method to search random int array duplicates
		System.out.println("--Recursive-- method to search"
				+ " duplicates from random int array");
		// a = algos01.RandomArrayO1.addRandomNumbers(a, 0, 10);
		System.out.println(Arrays.toString(a));
		System.out.print("Duplicate numbers in the array: ");
		// array, index value, current index, next index
		recursiveRandomDuplicates(a, a[0], 0, 1); 
		
		System.out.println("\n");
		
		// ------------------- ASCENDING ORDER ARRAY ---------------------
		// Non-recursive method to search duplicates from ascending order int array
		System.out.println("--Non-recursive-- method to search duplicates from "
				+ "ascending order integer array");
		int[] b = { 2, 2, 4, 5, 6, 7, 7, 9, 9 };
		System.out.println(Arrays.toString(b));
		System.out.print("Duplicate numbers in the array: ");
		nonRecursiveAscendingDuplicates(b);
		System.out.println();
		
		// Recursive method to search duplicates from ascending order int array
		System.out.println("--Recursive-- method to search duplicates from "
				+ "ascending order integer array");
		System.out.println(Arrays.toString(b));
		System.out.print("Duplicate numbers in the array: ");
		recursiveAscendingDuplicates(b, b[0], 0, 1);
	}

}
