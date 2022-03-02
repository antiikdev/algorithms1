/**
 * Program calculates how many times numbers from a specified range
 * can be found from an array with random integer numbers.
 */
package algos01;

import java.util.Random;

/**
 * Random integer table numbers
 * @author Antiik.dev
 * @version 20. Jan 2022
 */
public class RandomArrayO1 {
	
	
	/**
	 * Adds random integer numbers to an array
	 * @param array for random integer numbers
	 * @param min integer numbers minimum range
	 * @param max integer numbers maximum range
	 * @return array with random integer numbers from defined range
	 */
	public static int[] addRandomNumbers(int[] array, int min, int max) {
		array = new int[max];
		Random rand = new Random();
		int randNumber = 0;
		
		for (int i = 0; i < array.length; i++) {
			randNumber = rand.nextInt((max - min)+ 1) + min; // +1 keep in range
			array[i] = randNumber;
		}
		return array;
	}
	
	
	/**
	 * Search how many numbers from integer array
	 * can be found from a certain range.
	 * <Evaluation>
	 * Algorithm processing time evaluation - linear:
	 * T(n) = n * t1 + t2
	 * where:
	 * n = array.length
	 * t1 = one iteration inside of the loop 
	 * t2 = process outside of the loop, e.g. initialiaztion of int found
	 * </Evaluation>
	 * @param array integer that is searched
	 * @param min of range
	 * @param max of range
	 * @return how many integer numbers from a range was found
	 */
	public static int foundFromArray(int[] array, int min, int max) {
		int found = 0;
		System.out.print("Found numbers: ");
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= min && array[i] <= max) {
				System.out.print(array[i] + ", ");
				found++;
			}
		}
		System.out.println();
		return found;
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int arrayMin = 0, arrayMax = 100; // range min and max values
		int rangeMin = 0, rangeMax = 0;
		int[] array = null; // array for random numbers
		int result; 
		
		array = addRandomNumbers(array, arrayMin, arrayMax);
		System.out.println("Arrays min. " + arrayMin + " and max. " + arrayMax);
		
		System.out.println("1. Array");
		rangeMin = 0; rangeMax = 10;
		result = foundFromArray(array, rangeMin, rangeMax);
		System.out.println("Sum of found numbers: " + result);
		
		System.out.println("2. Array");
		rangeMin = 50; rangeMax = 100;
		result = foundFromArray(array, rangeMin, rangeMax);
		System.out.println("Sum of found numbers: " + result);
		
		System.out.println("3. Array");
		rangeMin = 67; rangeMax = 75;
		result = foundFromArray(array, rangeMin, rangeMax);
		System.out.println("Sum of found numbers: " + result);
	}
}
