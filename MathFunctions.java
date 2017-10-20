
// Mihir - 10/20/17
// Importing the entire math package
import java.math.*;

public class MathFunctions {
	
	//This function pulls purely the remained of the BigDecimal
	public static BigDecimal getRemaineder(BigDecimal bd1, BigDecimal bd2) {
		return bd1.remainder(bd2);
	}
		
		
	//This function pulls the full answer of the first parameter divided by the second
	public static BigDecimal Div(BigDecimal bd1, BigDecimal bd2) {
		return bd1.divide(bd2);
	}
		
	//Decimal To Binary
	public static String decToBin(BigDecimal bd1) {
		if (!Integer.toString(bd1.intValue()).equals(bd1.toString())){
			System.out.println("Error due to digit precision");
			return null;
		}
		return Integer.toBinaryString(bd1.intValue());
	}
	
	/* ----------------------- getExponent() ----------------------
	 * Mihir - 10/20/17
	 * returns the value of the first provided value raised to the value 
	 * of the second provided value.
	*/
	public static BigDecimal getExponent (BigDecimal d, int n) {
		return (d.pow(n));
	}

	/* ----------------------- getSquareRoot() ----------------------
	 * Mihir - 10/20/17
	 * returns the square root value of the provided number
	*/
	public static double getSquareRoot(double d1) {
		return (Math.sqrt(d1));
	}
	
	/* ----------------------- main() ---------------------- */
	public static void main(String[] args) {
		BigDecimal b = new BigDecimal("5");
		BigDecimal a = new BigDecimal("2");
		BigDecimal c = new BigDecimal("2.6");
		BigDecimal d = new BigDecimal("1.3");
		
		System.out.println(MathFunctions.getRemaineder(b,a));
		System.out.println(MathFunctions.Div(b,a));
		System.out.println(MathFunctions.decToBin(b));
		System.out.println(MathFunctions.decToBin(a));
		
		System.out.println(MathFunctions.getRemaineder(c, b));
		System.out.println(MathFunctions.decToBin(d));
		
		// Mihir - 10/20/17
		// test for getExponent()
		BigDecimal x = new BigDecimal("3");
		int n = 2;
		BigDecimal exponent_value = getExponent(x,n);
		System.out.println(x + " raised to the power of " + n + " is " + exponent_value);
		
		// test for getSquareRoot() 
		double s = 4;
		double square_root_value = getSquareRoot(s);
		System.out.println("Sqrt of " + s + " is " + square_root_value);
	}
	

}
