/**
 * Counting sort (Finn. laskentalajittelu)
 */
package algos05;

import java.util.Arrays;

/**
 * @author Antiikdev
 * @version 21 Feb 2022
 */
public class Counting_sort {
	
	
	/**
	 * Find max value from int table
	 * @param t array of integeres
	 * @return max integer value from an array
	 */
	public static int findMax(int[] t) {
		int max = t[0];
		for (int i = 1; i < t.length; i++) {
			if (t[i] > max) max = t[i];
		}
		return max;
	}
	
	/**
	 * Counting sort (laskentalajittelu)
	 * Algorighm source: Jyu, algoritmit 1 material
	 * @param t integer array
	 * @param n integer value in the table
	 */
	public static void countingSort(int[] t, int n) {
		int max = findMax(t);
		int[] s = new int[n+1]; // output
		
		int[] u = new int[max+1]; // store count (tyotila)
		
		for (int i = 0; i <= max; i++) {
			u[i] = 0;
		}
			// store count zeroed (tyotilataulukko u nollattu)
		for (int j = 0; j < n; j++) {
			u[t[j]]++;
		}
			// u[i] includes i count (sisaltaa alkioiden i lukumaaran)
		for (int i = 1; i <= max; i++) {
			u[i] += u[i-1];
		}
			// u[i] includes information on how many smaller or bigger
			// (u[i] sisaltaa tiedon montako alkiota pienempia tai
			// yhtasuuria kuin i)
		for (int j = n - 1; j >= 0; j--) {
			s[u[t[j]] - 1] = t[j]; // variable t[j] in place (paikalleen)
			u[t[j]]--; // update count (lukumaaran paivitys)
		}
		for (int i = 0; i < n; i++) {
			t[i] = s[i];
		}
		// copy sorted to original array (kopioidaan sortatut
		// alkuperaiseen taulukkoon)
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int[] t = { 6, 3, 6, 1, 9, 4, 6, 8, 3 };
		System.out.println("Before: " + Arrays.toString(t));
		countingSort(t, t.length);
		System.out.println("After:  " + Arrays.toString(t));
	}

}
