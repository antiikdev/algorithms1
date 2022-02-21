/**
 * Quicksort (Finn. pikalajittelu) algorithm for alphabetical order
 */
package algos05;


/**
 * @author AntiikDev
 * @version 21 Feb 2022
 */
public class Quicksort {
	
	
	/**
	 * Quicksort of char array
	 * @param ca array to be sorted
	 * @param l first place of index
	 * @param r last place of index
	 */
	public static void quicksort(char[] ca, int l, int r) {
		// If variables n <= 3 we use insertionSort (algos04)
		if (r-l <= 3) insertionSort(ca);
		else {
			int k = pivot(ca, l, r); 		// Pivot (Finn. jakotietue)
			int j = partition(ca, l, r, k);	// ositus
			quicksort(ca, l, j-1);			// first part (alkuosa)
			quicksort(ca, j+1, r);			// last part (loppuosa)
		}
	}
	
	
	/**
	 * Pivot (Finn. jakotietue) with median method
	 * @param ca char array
	 * @param l first index of array
	 * @param r last index of array
	 * @return median pivot 
	 */
	public static int pivot(char[] ca, int l, int r) {
		if ((r-l) %2 != 0) return (r-l)/2;
		return (r-1 / 2 + r/2) / 2;
	}
	
	
	/**
	 * Partition (part of quikcsort), pseudo vode source: Jyu Algoritmit 1 material
	 * @param t char array
	 * @param l first index of array
	 * @param r last index of array
	 * @param k pivot
	 * @return partitioned index
	 */
	public static int partition(char[] t, int l, int r, int k)
	 {
	   swap(t[l], t[k]); // jakotietue taulukon alkuun
	   int i = l;
	   int j = r+1;
	   while (true)
	   {
	     do
	       i++;
	     while (i < r+1 && t[i] < t[l]);
	     do
	       j--;
	     while (t[j] > t[l]);
	     if (j < i)
	       break;
	     swap(t[i], t[j]); // vaihdetaan t[i] ja t[j]
	   }
	   swap(t[l], t[j]); // jakotietue lopulliselle paikalleen
	   return j;         // palautetaan jakotietueen indeksi
	 }
	
	
	/**
	 * Swap two chars
	 * @param l first swapped char
	 * @param k second swapped char
	 * TODO: Swap method check with array
	 */
	public static void swap(char l, char k) {
		char temp = l;
        l = k;
        k = temp;
	    }
	
	
	/**
	 * Insertion sort with String
	 * @param String to be sorted
	 * @return sorted  String
	 */
	public static void insertionSort(char[] ca) {
		for (int i = 1; i < ca.length; i++) {
			char p = ca[i];
			int j = i-1;
			while (j >= 0 && ca[j] > p) {
				ca[j+1] = ca[j];
				j = j-1;
			}
			ca[j+1] = p;
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
		System.out.println("---- Quicksort ----");
		String s = "OPERAATIO";
		System.out.println("Before: " + s);
		char ca[] = stringToChar(s);
		
		// Quicksort (Finn. pikalajittelu),
		// Median method if variables n <= 3
		quicksort(ca, 0, ca.length-1); // array, first and last indexes
		String s2 = String.valueOf(ca);
		System.out.println("After:  " + s2);
		
		// Test insertion sort
		System.out.println("---- From quick to insertion ----");
		String s3 = "CBA";
		System.out.println("Before: " + s3);
		char ca2[] = stringToChar(s3);
		quicksort(ca2, 0, ca2.length-1);
		String s4 = String.valueOf(ca2);
		System.out.println("After:  " + s4);
	}

}
