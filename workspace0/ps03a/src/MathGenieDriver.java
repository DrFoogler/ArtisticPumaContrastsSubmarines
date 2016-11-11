public class MathGenieDriver {
	public static void main(String[] args) {
		double num1 = 8.2;
		
		MathGenie genie1 = new MathGenie(num1);
		System.out.println("Created a MathGenie with the number " 
				+ num1 + "!");
		
		//demonstrate MathGenie.divideBy()
		System.out.println("\nDivide " + num1 + " by 4.1...");
		System.out.println("--> result = " + genie1.divideBy(4.1));
		
		//demonstrate MathGenie.sqrt()
		System.out.println("\nSquare root of " + num1 + "...");
		System.out.println("--> result = " + genie1.sqrt());
		
	}
}