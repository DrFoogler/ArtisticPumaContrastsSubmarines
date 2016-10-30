public class Teacher extends Person {
	
	private int yearsTeaching;
	private String primarySubject;
	
	public int getYearsTeaching() {
		return yearsTeaching;
	}
	
	public void setYearsTeaching(int y) {
		yearsTeaching = y;
	}
	
	public String getPrimarySubject() {
		return primarySubject;
	}
	
	public void setPrimarySubject( String p) {
		primarySubject = p;
	}
	
	public Teacher() {
		
	}
	
	public void makeAngry() {
		System.out.println("You have made your teacher, " + this.getFullName() + ", angry. Your grade has been reduced by 6%.\n\n");
	}

}
