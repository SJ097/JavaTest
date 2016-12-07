
public class JavaTest {
	
	public static void main(String[] args) {
		int n = 7;
		int m = 4;
		
		int diff = difference(n, m);
		
		System.out.printf("The difference between %s and %s is %s.\n", n, m, diff);
		
		int prod = product(n, m, diff);
		
		System.out.printf("The product of those three numbers is %s.", prod);
	}
	
	private static int difference(int n, int m) {
		return n-m;
	}
	
	private static int product(int n, int m, int k) {
		return n*m*k;
	}
}
