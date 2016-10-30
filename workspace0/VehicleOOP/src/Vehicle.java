public class Vehicle {
	
	private int numWheels;
	private int mpg; //miles per gallon
	private String maker; //brand, e.g., Ford
	
	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int w) {
		numWheels = w;
	}
	
	public int getMPG() {
		return mpg;
	}
	
	public void setMPG(int m) {
		mpg = m;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String k) {
		maker = k;
	}
	
	public String toString() {
		String desc;
		desc = "This vehicle has " + numWheels + " wheels, \n";
		desc += "gets " + mpg + " miles to the gallon, and\n";
		desc += "is manufactured by " + maker +".";
		
		return desc;
	}
}
