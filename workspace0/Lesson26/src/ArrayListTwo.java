import java.util.ArrayList;
import java.io.*;
public class ArrayListTwo {
	
	public static int adder(ArrayList<Integer> myList) {
		int sum = 0;
		
		for ( Integer elt : myList ) {
			sum += elt;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listB = new ArrayList<Integer>();
		
		listB.add(6);
		listB.add(7);
		listB.add(2);
		listB.add(-3);

		System.out.println("Sum of elements in " 
				+ listB + " is " 
				+ adder(listB));
		
		System.out.println(((CharSequence) listB).length());		
	}
}