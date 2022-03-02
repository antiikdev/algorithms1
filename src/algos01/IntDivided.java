/**
 * Is integer divided with another int
 * without division calculation
 */
package algos01;

/**
 * @author antiik.dev
 * @version 2 March 2022
 */
public class IntDivided {
	
	
	/**
	 * Is integer equally divided with another integer
	 * withouth division calculation
	 * @param n study if equal
	 * @param m dividend
	 * @return true is equally divided, false if not
	 * @example
	 * <pre name="test">
	 * 	int n = 100, m = 5;
	 * 	tasanJaollinen(n, m)	=== true;
	 *	n = 10; m = 3;
	 * 	tasanJaollinen(n, m)	=== false;
	 * 	n = 2; m = 0;
	 * 	tasanJaollinen(n, m)	=== false;
	 * </pre>
	 */
	public static boolean tasanJaollinen(int n, int m) {
		if ( n == 0 || m == 0 ) return false;
			
	    while (m <= n) {
	    	n = n - m;
	    }
	    if (n == 0) return true;
	    else return false;
	}


	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		int n = 8, m = 2;
		boolean onkoJaollinen = tasanJaollinen(n, m);
		System.out.println("Number " + n + " divided with " + m +
				" equals to zero? Answer: " +  onkoJaollinen);
	}

}
