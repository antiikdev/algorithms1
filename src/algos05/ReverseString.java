/**
 * Reverses string words to opposite order
 */
package algos05;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author AntiikDev
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
	public static void findwords(String jono) {
		if (jono.length() <= 0) return;
				
		// String to char array
		char[] array = stringToChar(jono);
		int startIndex = startCharIndex(array);
		int endIndex = 0;

		// cut individual words and add to the array
		while (endIndex < array.length) {
			endIndex = endCharIndex(array, startIndex);
			String word = getWord(array, startIndex, endIndex);
			stringArray.add(word);
			startIndex = endIndex+1;
		}
		
		// create Strings and add to a String array
		

		// reverse String array words
		
		// translate to String and retunr
		
	}
	
	
	/**
	 * Next index where char
	 * @param array char
	 * @return index of next char
	 */
	public static int startCharIndex(char[] array) {
		if ( array.length <= 0 ) return 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			char c = array[i];
			if ( c != ' ' ) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	
	/**
	 * End index where char
	 * @param array char
	 * @return index of ending char
	 */
	public static int endCharIndex(char[] array, int start) {
		if ( array.length <= 0 ) return 0;
		int index = 0;
		for (int i = start; i < array.length; i++) {
			char c = array[i];
			if ( c == ' ') {
				index = i;
				break;
			}
			if ( i == array.length-1) {
				index = i+1;
				break;
			}
		}
		return index;
	}
	
	
	/**
	 * Creates a word from char array from start to end points
	 * @param array where the string is created
	 * @param start of index
	 * @parem end of index
	 * @return String 
	 */
	public static String getWord(char[] array, int start, int end) {
		if ( array.length <= 0 ) return "";
		String word = "";
		for (int i = start; i < end; i++) {
			char c = array[i];
			word += c;
		}
		return word;
	}	
	
	
	/** NOTE: NOT USED METHOD
	 * Trims a word by removing empty spaces
	 * @param taulu a char array that is trimmed
	 * @return trimmed String
	 */
	public static String trim(char[] taulu) {
		if ( taulu.length <= 0 ) return "";
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
		findwords(jono);
		// Collections.reverse(stringArray);
		// jono = stringArray.toString();
		System.out.print("After reverse:  ");
		ListIterator<String> li = stringArray.listIterator(stringArray.size());
		while (li.hasPrevious()) {
			System.out.print(li.previous());
			System.out.print(" ");
		}
	}

}
