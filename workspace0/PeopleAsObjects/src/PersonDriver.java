public class PersonDriver {
	
	public static void main(String[] args) {

		Person ralph = new Person();
		Teacher teacher1 = new Teacher();
		
		teacher1.setAge(31);
		teacher1.setWeight(168);
		teacher1.setFullName("Mr. Sprinkles");
		teacher1.setYearsTeaching(14);
		teacher1.setPrimarySubject("Math");
		teacher1.makeAngry();
		

		//using mutator methods to set field variable values
		ralph.setAge(7); 
		ralph.setWeight(83);
		ralph.setLocation("Boston, MA");
		ralph.setFullName("Ralph W. Emerson");
		ralph.setGreeting("Heloooo there!");
		ralph.makeAngry();
		
		String ralphStats; // let's build this string up over successive steps 
                                   // using the values gotten via accessor methods (getters)
		String teacher1Stats;
		

		ralphStats =  "Here are the vital stats for person/object 'ralph'\n";
		ralphStats = ralphStats + "--------------------------------------------------\n";
		ralphStats += "Name:     " + ralph.getFullName() + "\n"; // += is a shortcut
		ralphStats += "Age:      " + ralph.getAge() + "\n";
		ralphStats += "Weight:   " + ralph.getWeight() + "\n";
		ralphStats += "Location: " + ralph.getLocation() + "\n\n";
		ralphStats += "How he likes to say hello: " + ralph.getGreeting() + "\n";
		
		
		teacher1Stats = "Here are the stats for 'teacher 1' \n";
		teacher1Stats += " ********************************************\n";
		teacher1Stats += "Name : " +teacher1.getFullName() + "\n";
		teacher1Stats += "Age: " + teacher1.getAge() + "\n";
		teacher1Stats += "Weight: " + teacher1.getWeight() + "\n";
		
		String teacher1Stats2;
		teacher1Stats2 = teacher1.getFullName() + " has been teaching ";
		teacher1Stats2 += teacher1.getPrimarySubject() + " for ";
		teacher1Stats2 += teacher1.getYearsTeaching() + " years!";
		System.out.println(teacher1Stats2);

		System.out.println(ralphStats);
		
	}
	
}
