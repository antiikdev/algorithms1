/**
 * Class NOT FINISHED! Calculates polynomial functions
 * 
 * Evaluation of f(n) asymptomatic upper limits (ylarajat) O(g(n)) in Finnish:
 * <Evaluation>
 * f(n) ja g(n) samaa kertaluokkaa, jos lim(n->M) f(n)/g(n) = C (!=0)
 * 
 * f(n) = 3n^5 + 3n^3 + 24n
 * lim n->M f(n) / n^5  =  3 + 3/n^2 + 24/n^4 = 3
 * -> f(n) = O(n^5)
 * 
 * f(n) = 800 + 50.SQUARE(n) + 3n 
 * lim n->M f(n) / n  = 800/n + 50.SQUARE(n) + 3  =  3
 * -> f(n) = O(n)
 * 
 * f(n) = 4n^3 + 2^n
 * lim n->M f(n) / 2^n  =  (4n^3 / 2^n) + 1 = 1
 * -> f(n) = O(2^n)
 * 
 * f(n) = 4log2n + 10n 
 * lim n->M f(n) / n  =  4log2n/n + 10 = 10
 * -> f(n) = O(n)
 * 
 * f(n) = 3nlog2n + 5n
 * -> lim n->M f(n) / nlog2n  =  3 + 5/log2n = 3
 * -> f(n) = O(nlog2n)
 * 
 * f(n) = 2n/log2n + n
 * -> lim n->M f(n) / n  =  2/log2n + 1 = 1 
 * -> f(n) = O(n)
 * 
 * </Evaluation>
 */
package algos01;

/**
 * @author Antiikdev
 * @ver 22 Jan 2022
 * @todo NOT FINISHED!
 *
 */
public class Asymptomatic {

	// private static final int MAXVALUE = 1000000;
	
	
	/**
	 * TODO: calculate NOT FINISHED, issue: double numbers
	 * @param m1
	 * @param p1
	 * @param m2
	 * @param p2
	 * @param m3
	 * @param p3
	 */
	public static void polynomial(double m1,double p1, double m2,double p2, double m3,double p3) {
		double result = 0;
		
		for (int n = 1; n < 20; n++) {
			double temp = Math.pow(m1*n,p1);
			System.out.print(temp + " / ");
			result = ((Math.pow(m1*n,p1) + Math.pow(m2*n,p2) + Math.pow(m3*n,m3)) / n);
			System.out.print(result + ", ");
		}
		System.out.println();
	}
	
	
	/**
	 * Main for testing and functions use
	 * @param args not in use
	 */
	public static void main(String[] args) {
		// Polynomial sum
		// (multiplair, power, | multiplair, power, | multiplair, power)
		polynomial(3.0,5.0, 3.0,3.0, 24.0,0.0);

	}

}
