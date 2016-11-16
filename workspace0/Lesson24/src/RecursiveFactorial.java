public class RecursiveFactorial {

	public static int factorialRec(int n) {
		
		return n * factorialRec(n-1);
		
	}

	public static void main(String[] args) {
		
		System.out.println("5-factorial is " + factorialRec(5));
	}
}
