package functions;

import java.math.BigDecimal;

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
	
	public static void main(String args[]) {
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
		
	}
	
	
}
