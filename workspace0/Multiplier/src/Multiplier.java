import java.util.Scanner;

public class Multiplier {

	public static void main(String[] args) {
		
		System.out.println("Please enter an integer: ");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		
		System.out.println("2 * " + n + " = " + (n +n));

	}

}
