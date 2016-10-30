import java.util.Scanner;

public class VehicleDriver {
	
	public static void main(String[] args){
		
		Vehicle v1 = new Vehicle();
		Car car1 = new Car();
		
		v1.setNumWheels(3);
		v1.setMPG(39);
		v1.setMaker("Yamaha");
		
		car1.setMPG(81);
		car1.setMaker("Nissan ");
		car1.setNumDoors(4);
		car1.setModel("Altima SL ");
	
		
		String car1Desc;
		
		Scanner numWheels = new Scanner(System.in);
		car1Desc = "Number of wheels: " + numWheels + ".\n";
		System.out.println("How many wheels does the " + car1.getMaker() + car1.getModel() + "have?");
		int totWheels = new Integer(numWheels.nextLine());
		
		car1Desc = "Number of wheels: " + totWheels + ".\n";
		car1Desc += "MPG: " + car1.getMPG() + "!\n";
		car1Desc += "Number of doors: " + car1.getNumDoors() +".\n";
		car1Desc += "Maker: " + car1.getMaker() + ".\n";
		car1Desc += "Model: " + car1.getModel() + ".\n";
		
		System.out.println(car1Desc);
		System.out.println(v1);
		
	}

}
