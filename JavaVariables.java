
public class JavaVariables {

	public static void main(String[] args) {

// 1	
		int a = 1;
		int b = 2;
		int result = a + b;
		System.out.println(result);

// 2
		double c = 4000;
		double d = 4004;
		double result2 = c + d;
		System.out.println(result2);
		
// 3
		int e = 4;
		double f = 15;
		double result3 = e + f;
		System.out.println(result3); 
		//ANSWER MUST BE A DOUBLE
		
// 4
		int g = 100;
		int h = 10;
		int result4 = g / h;
		System.out.println(result4);
		//When changed to a decimal, error code was thrown, int needs to be a double or float)
		
// 5
		int x = 5;
		double y = 6;
		double q = y / x;
		System.out.println(q);
		//When both were ints the answer was 1, as a double its 1.2
		
// 6
		final int z = 27;
		int y = 3;
		int result6 = z + y;
		System.out.println(result6);
		
// 7
		double coffee = 2.50;
        	double biscuit = 4.55;
        	double cookies = 3.50;
        	String s = "$";

        	double subtotal = 3*coffee + 4*biscuit + 2*cookies;
        	final double SALES_TAX = subtotal * .08;
        	double totalSale = subtotal + SALES_TAX;
        	System.out.printf(s + "%.2f", totalSale);
		
		
		
		
		}

	}


