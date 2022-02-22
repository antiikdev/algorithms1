/**
 * Lucas Number: Ln = L(n-1) + L(n-2), when n > 1
 * and where L0 = 2 and L1 = 1, for example:
 * Ln = 2, 1, 3, 4, 7, 11, 18, ... 
 */
package algos05;

/**
 * @author AntiikDev
 * @version 22 Feb 2022
 */
public class LucasNumber {
	
	
	/**
	 * Calculates recursiely Lucas number
	 * @param n times calculated
	 */
	public static void recursiveLucas(int n, int l0, int l1) {
		if (l0 == 2 && l1 == 1) { // first round
			System.out.print("[" + l0 + "], [" + l1 + "], ");
		}
		if (n <= 2) return; // end recursive
		int sum = l0 + l1;
		System.out.print("[" + sum + "], ");
		l0 = l1;
		l1 = sum;
		n--;
		recursiveLucas(n, l0, l1);
	}
	
	
	/**
	 * Calculates non-recursive Lucas number
	 * @param n times calculated
	 */
	public static void nonRecursiveLucas(int n) {
		int l0 = 2;
		int l1 = 1;
		int sum = 0;
		System.out.print("[" + l0 + "], ");
		System.out.print("[" + l1 + "], ");
		
		for (int i = 2; i < n; i++) {
			sum = l0 + l1;
			System.out.print("[" + sum + "], ");
			l0 = l1;
			l1 = sum;
		}
	}

	
	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		System.out.println("Recursively calculated Lucas number: ");
		recursiveLucas(6, 2, 1); // n, L0, L1
		
		System.out.println();
		
		System.out.println("Non-recursively calculated Lucas number: ");
		nonRecursiveLucas(6);
	}

}
