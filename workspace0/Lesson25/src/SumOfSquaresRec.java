
public class SumOfSquaresRec {
	
	public static int findSumOfSquares(int x) {
		
		if (x == 1)
			return 1;
		else
			return x * x + findSumOfSquares(x - 1);
	}

	public static void main(String[] args) {
		
		int result = findSumOfSquares(7);
		System.out.println(result);
	}

}
