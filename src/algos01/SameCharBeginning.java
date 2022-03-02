/**
 * How many same chars in the beginning of String
 */
package algos01;

/**
 * @author Antiik-dev
 * @version 2 March 2022
 */
public class SameCharBeginning {
	
	
	/**
	 * Counts how many same chars in the beginning
	 * @param jono String counted
	 * @example
	 * <pre name="test">
	 * 	String a = "aaapuuva!";
	 * 	sameChars(a)	=== 3;
	 *	String b = "b!";
	 * 	sameChars(b)	=== 0;
	 * 	String c = "";
	 * 	sameChars(c)	=== 0;
	 * </pre>
	 */
	public static int sameChars(String jono) {
		if (jono.length() <= 0) return 0;
		
		char[] ca = jono.toCharArray();
		char c = jono.charAt(0);
		int kpl = 0; // how many chars counted
		
		for (int i = 1; i < ca.length; i++) {
		    if ( c == ca[i] ) {
		    	if (kpl == 0) kpl++;
		    	kpl++;
		    }
		    if ( c != ca[i] ) break;
		}
		return kpl;
	}


	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		String jono = "aapeli";
		int sum = sameChars(jono);
		System.out.println(sum);
	}

}
