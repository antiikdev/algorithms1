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
		String m = "aataminomena";
		char letter = 'a';
		int kirjaimet = countLetters(m, letter);
		System.out.println("String '"+m+"' has "+kirjaimet+" '"+letter+"' letters.");
	}

}
