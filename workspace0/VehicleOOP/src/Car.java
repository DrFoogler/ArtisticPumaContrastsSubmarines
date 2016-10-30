import java.util.Scanner;

public class Car extends Vehicle {
	
	private int numDoors;
	private String model; //e.g. Mustang or Forester
	
	public Car() {
		//assume all car have 4 wheels
		setNumWheels(4);
	}
	
	public int getNumDoors() {
		return numDoors;
	}
	
	public void setNumDoors(int n) {
		numDoors = n;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String m) {
		model = m;
	}

	public String toString() {
		String desc;
		
		desc = "We pimped out yo car and now it has: " + this.getNumWheels() + " and " + numDoors + "!\n";
		desc += "This baby gets about: " + this.getMPG() + "!\n";
		desc += "Pretty good considering it's a: " + this.getMaker() + " " + this.getModel() +".\n";
		
		return desc;
	}

	
}
