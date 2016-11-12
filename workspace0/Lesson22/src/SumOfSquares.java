
public class SumOfSquares {

	public static void main(String[] args) {
		
		System.out.println(SumOfSquares(5));
	}
	
	public static int SumOfSquares(int n) {
		int sum = 0; 
		
		while (n > 0) {
			sum += n*n;
			n--;
		}
		return sum;
	}

}
