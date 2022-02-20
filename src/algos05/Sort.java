/**
 * Sorting algorighmts for alphabetical order:
 * Merge sort and 
 */
package algos05;

/**
 * @author AntiikDev
 * @version 20 Feb 2022
 */
public class Sort {
	
	
	/**
	 * Merge sort char array to alphabetical order
	 * @param ca char array to be sorted
	 * @param l first index
	 * @param h last index
	 */
	public static void mergeSort(char[] ca, int l, int h) {
		if (l < h) {
			int k = (l + h) / 2;
			mergeSort(ca, l, k);
			mergeSort(ca, k+1, h);
			merge(ca, l, k, h);
		}
	}
	
	
	/**
	 * Merge, source geeksforgeeks.org/merge-sort/
	 * @param ca array to be merged
	 * @param l first index of first subarray
	 * @param k last index of first subarray
	 * @param h last index of second subarray
	 */
	public static void merge(char[] ca, int l, int k, int h) {
	    // Find sizes of two subarrays to be merged
        int n1 = k - l + 1;
        int n2 = h - k;
  
        /* Create temp arrays */
        char[] L = new char[n1];
        char[] R = new char[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = ca[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = ca[k + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int x = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                ca[x] = L[i];
                i++;
            }
            else {
                ca[x] = R[j];
                j++;
            }
            x++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            ca[x] = L[i];
            i++;
            x++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            ca[x] = R[j];
            j++;
            k++;
        }
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
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		String s = "OPERAATIO";
		System.out.println("Before: " + s);
		char ca[] = stringToChar(s);
		
		// Merge sort (Finn. lomituslajittelu),
		// Pivot is (Finn. jakotietue) k = (l + h)/2
		mergeSort(ca, 0, ca.length-1); // char array, first and last indexes
		String s2 = String.valueOf(ca);
		System.out.println("After:  " + s2);

	}

}
