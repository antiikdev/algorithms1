/**
 * NOT FINISHED! Calculates polynomial functions
 */
package algorithms1;

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
