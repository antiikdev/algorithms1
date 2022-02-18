/**
 * Reverses words in string to opposite order
 */
package algos05;

import java.util.Arrays;

/**
 * @author AntiikDeb
 * @version 17 Feb 2022
 */
public class ReverseString {
	
	
	/**
	 * Reverses string words to opposite
	 * @param jono string reversed
	 * @return reversed string
	 */
	public static String reverse(String jono) {
		if (jono.length() <= 0) return jono;
				
		// to char array
		char[] charArray = stringToChar(jono);
		System.out.println(Arrays.toString(charArray)); // TEST REMOVE
		
		// cut individual words
		char[] yksiSana = new char[jono.length()];
		String[] jonotaulu = new String[jono.length()]; // extra long array
		
		int i = 0, j = 0;
		while(i < charArray.length) {
			char kirjain = charArray[i];
			yksiSana[i] = kirjain;
			if ( kirjain == ' ' ) {
				String sana = String.valueOf(yksiSana);
				System.out.println(sana); // TEST REMOVE
				jonotaulu[j] = sana;
				j++;
			}
			i++;
		}
		
		System.out.println(Arrays.toString(jonotaulu)); // TEST REMOVE
		
		// create Strings and add to a String array
		

		// reverse String array words
		
		// translate to String and retunr
		
		
		return jono;
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
		String jono = "algoritmien opiskelu on kivaa";
		System.out.println("Before reverse: " + jono);
		reverse(jono);
		System.out.println("After reverse:  " + jono);

	}

}
