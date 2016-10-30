
public class Driver3 {

	public static void main(String[] args) {
		Person Jim = new Person();
		Jim.age = 22;
		Jim.weight = 170.2;
		Jim.location = "Buffalo, NY";
		Jim.fullName = "Jim Kelly";
		Jim.greeting = "Brr..it's cold here.";

		System.out.println("Rhonda is " + Jim.age + " years old.");
		System.out.println("His weight is " + Jim.weight + "lbs");
		System.out.println("Unless you know him already, you should " + "call him " + Jim.fullName);

	}

}
