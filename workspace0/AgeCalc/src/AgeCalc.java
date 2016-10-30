import java.util.Scanner;

public class AgeCalc {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.println("Hello! What is your name: ");
		String firstName = name.nextLine();
		
		System.out.println("Hi " + firstName + ". How old are you: ");
		Scanner age = new Scanner(System.in);
		int formerage = new Integer(age.nextLine()) - 3;
		
		
		System.out.println("Wow! I didn't know that you were " + formerage + " three years ago!");

	}

}
