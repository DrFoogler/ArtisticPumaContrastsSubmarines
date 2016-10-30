public class Student extends Person {
	
	private int gradeLevel;
	private String intendedMajor;
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
	public void setGradeLevel(int g) {
		g = gradeLevel;
	}

	public String getIntendedMajor() {
		return intendedMajor;
	}
	
	public void setIntendedMajor(String m) {
		m = intendedMajor;
	}
	
	public void makeAngry() {
		System.out.println("Screw you, Mr. Sprinkles.\n\n");
	}
}
