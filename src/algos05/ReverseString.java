/**
 * Reverses words in string to opposite order
 */
package algos05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author AntiikDeb
 * @version 17 Feb 2022
 */
public class ReverseString {
	
	// String array to save individual words
	public static List<String> stringArray = new ArrayList<>();
	
	
	/**
	 * Reverses string words to opposite
	 * @param jono string reversed
	 * @return reversed string
	 */
	public static String reverse(String jono) {
		if (jono.length() <= 0) return jono;
				
		// String to char array
		char[] charArray = stringToChar(jono);
		
		// cut individual words and add to the array
		int firstIndex = nextCharIndex(charArray);
		String word = getWord(charArray, firstIndex);
		stringArray.add(word);
		
		// create Strings and add to a String array
		

		// reverse String array words
		
		// translate to String and retunr
		
		
		return jono;
	}
	
	
	/**
	 * Next index where char
	 * @param array char
	 * @return index of next char
	 */
	public static int nextCharIndex(char[] array) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			char c = array[i];
			if ( c != ' ' ) return index = i;
		}
		return index;
	}
	
	
	/**
	 * 
	 * @param array
	 * @param firstIndex
	 * @return
	 */
	public static String getWord(char[] array, int startIndex) {
		String word = "";
		for (int i = startIndex; i < array.length; i++) {
			char c = array[i];
			if ( c == ' ' ) break;
			word += c;
		}
		return word;
	}
		
	
	
	
	/**
	 * Trims a word by removing empty spaces
	 * @param taulu a char array that is trimmed
	 * @return trimmed String
	 */
	public static String trim(char[] taulu) {
		String sana = "";
		if (taulu.length < 0) return sana;
		
		for (int i=0; i<taulu.length; i++) {
			char c = taulu[i];
			if ( c != ' ' ) {
				sana += c;
			}
		}
		return sana;
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
		jono = reverse(jono);
		System.out.println("After reverse:  " + jono);

	}

}
