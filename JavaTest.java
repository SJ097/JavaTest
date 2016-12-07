/* Java Test Program. Created by Sathya Jayakumar.
   This program was created to test and familiarize myself with Java programming. */
public class JavaTest {
	
	// Main function declaration
	public static void main(String[] args) {
		// Integer declarations; Feel free to change them
		int n = 7;
		int m = 4;
		
		// Calling the difference function to subtract m from n
		int diff = difference(n, m);
		
		// Printing the difference between n and m in the Console
		System.out.printf("The difference between %s and %s is %s.\n", n, m, diff);
		
		// Calculating the product of the three terms using a function
		int prod = product(n, m, diff);
		
		// Printing out the product in the Console
		System.out.printf("The product of those three numbers is %s.", prod);
	}
	
	// Difference function
	private static int difference(int n, int m) {
		// Returning the difference
		return n-m;
	}
	
	// Product function
	private static int product(int n, int m, int k) {
		// Returning the product
		return n*m*k;
	}
}
