public class Car extends Vehicle {
	
	private int numDoors;
	private String model; //e.g. Mustang or Forester
	
	public Car() {
		numWheels = 4;
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


	
}
