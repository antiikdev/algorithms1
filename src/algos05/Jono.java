/**
 * String functions (Finn. merkkijono funktioita)
 */
package algos05;

/**
 * @author AntiikDev
 * @version 21 Feb 2022
 */
public class Jono {
	
	
	/**
	 * Counts length of the longest letter group
	 * @param s String which letters are counted
	 * @return length int of longest letter group
	 * @example
	 * <pre name="test">
	 * 	String s = "a";
	 * 	countLongestLetterGroup(s)	=== 1;
	 * 	String s2 = "aaaabcd";
	 * 	countLongestLetterGroup(s2)	=== 4;
	 * 	String s3 = "axboo";
	 * 	countLongestLetterGroup(s3)	=== 2;
	 * </pre>
	 */
	public static int countLongestLetterGroup(String s) {
		if ( s.length() < 0 ) return 0;
		if ( s.length() == 1 ) return 1;
		char[] ca = stringToChar(s);
		int longest = 1, current = 1;
		char previous = ca[0];
		
		for (int i = 1; i < ca.length; i++) {
			if (previous != ca[i]) current = 1;
			if ( previous == ca[i] ) {
				current++;
				if (current > longest) longest = current;
			}
			previous = ca[i];
		}
		return longest;
	}

	
	/**
	 * Counts number of letter groups in a String
	 * @param s String where letters counted
	 * @return number of letter groups int
	 * @example
	 * <pre name="test">
	 *  String p = "a";
	 * 	countGroupsOfLetters(p) === 1;
	 * 	String s = "abba";
	 * 	countGroupsOfLetters(s) === 3;
	 *  String m = "aakkaacccpp";
	 *  countGroupsOfLetters(m) === 5;
	 * </pre>
	 */
	public static int countGroupsOfLetters(String s) {
		if (s.length() < 0) return 0;
		if (s.length() == 1) return 1;
		
		int number = 1;
		char[] ca = stringToChar(s);
		char previous = ca[0];
		
		for (int i = 1; i < ca.length; i++) {
			if (previous != ca[i]) {
				number++;
			}
			previous = ca[i];
		}
		return number;
	}
	
	
	/**
	 * Counts number of char letters in a String
	 * @param m String 
	 * @param letter counted
	 * @return number of letters in a String
	 */
	public static int countLetters(String m, char letter) {
		int number = 0;
		char[] ca = stringToChar(m);
		
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] == letter) number++;
		}
		return number;
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
		// How many 'a' letters in a String
		String m = "aataminomena";
		char letter = 'a';
		int kirjaimet = countLetters(m, letter);
		System.out.println("String '"+m+"' has "+kirjaimet+" '"+letter+"' letters.");
		
		// How many groups of letters in a String
		String m2 = "aabcccaa";
		int tulos = countGroupsOfLetters(m2);
		System.out.println("String '"+m2+"' has "+tulos+" groups of letters.");
		
		// How long is the longest letter group in a String
		String m3 = "aabcccaa";
		int length = countLongestLetterGroup(m3);
		System.out.println("String '"+m3+"' longest letter group length is "+length);
	}

}
