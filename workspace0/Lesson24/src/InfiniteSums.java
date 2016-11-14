import java.util.Scanner;

public class InfiniteSums {
	
	public static void main(String[] args) {
		double sum = 0;
		int i = 1;
		Scanner keybd = new Scanner(System.in);
		
		int numIterations = keybd.nextInt();
		System.out.println("numIterations: " + numIterations);
		
		while (i <= numIterations) {
			sum += (1/Math.pow(i, 2));
			i++;
		}
		
		double pi = Math.sqrt(sum*6);
		
		System.out.println("pi estimate for " + numIterations + " of Euler's infinite sum: "  + pi);
	}
}
