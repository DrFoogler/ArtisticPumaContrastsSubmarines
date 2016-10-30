
public class PersonDriver2 {

	public static void main(String[] args) {
		Person rhonda = new Person();
		rhonda.age = 50;
		rhonda.weight = 200;
		rhonda.location = "Boston, MA";
		rhonda.fullName = "Ralph W. Emerson";
		rhonda.greeting = "Heloooo there!";

		System.out.println("Rhonda is " + rhonda.age + " years old.");
		System.out.println("His weight is " + rhonda.weight + "lbs");
		System.out.println("Unless you know him already, you should " + "call him " + rhonda.fullName);

	}

}
