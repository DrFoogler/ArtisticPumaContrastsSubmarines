import java.util.Scanner;

public class No8 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int n = kb.nextInt();
		kb.nextLine();
		
		System.out.println("Enter a line of text: ");
		String text = kb.nextLine();
		
		while(n > 0) {
			System.out.println(text);
			n--;
		}
		
		if(n < 0) {
			System.out.println("Enter a positive integer");
		}
	}
}
