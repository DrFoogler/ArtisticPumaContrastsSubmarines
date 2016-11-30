import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) { //create file in Lesson26 project!
		
		ArrayList<String> listA = new ArrayList<String>();
		
		String oneStr = "one";
		
		listA.add(oneStr);
		listA.add("two"); //adding a NAMED String
		listA.add("three"); //adding an ANONYMOUS String
		
		for (String curStr : listA) {
			System.out.println("current element:\t" + curStr);
		}
		
		//System.out.println(listA);

	}

}
