public class Person {
	
	private int age;
	private int weight;
	private String location;
	private String fullName;
	private String greeting;
	
	public Person() { //default, no-args constructor
	}
	
	public void makeAngry() {
		
		System.out.println("You have made me, " + fullName + ", angry. I will get even.");
		
	}

	// accessor and mutator methods follow ////////////////////

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int w) {
		weight = w;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String l) {
		location = l;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String f) {
		fullName = f;
	}
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String g) {
		greeting = g;
	}
	
	// end accessor and mutator methods ////////////////////

}
