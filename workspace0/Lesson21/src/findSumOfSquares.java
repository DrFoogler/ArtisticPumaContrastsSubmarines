public class findSumOfSquares {
	
	public static void main(String[] args){
		
		System.out.println(findSumOfSquares(5));
		
	}
	
	public static int findSumOfSquares(int n) {
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum += i*i;
			i++;
			
		}
		return sum;
	}
	
}
