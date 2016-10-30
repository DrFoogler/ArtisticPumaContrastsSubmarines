public class ShirtDriver {

	public static void main(String[] args) {

		Shirt shirt1 = new Shirt();	
		shirt1.setColor("purple");
		shirt1.setMaterial("velvet");
		shirt1.setSize(16); 

		Shirt shirt2 = new Shirt();	
		shirt2.setColor("green");
		shirt2.setMaterial("nylon");
		shirt2.setSize(12); //smallest shirt 
                                  //this brand makes! 
		
		Shirt shirt3 = new Shirt();
		//good size:
		shirt3.setSize(15);
		System.out.println("a. shirt3 is size " + shirt3.getSize());
		//bad size:
		shirt3.setSize(2);
		System.out.println("b. shirt3 is size " + shirt3.getSize());


		System.out.println("Shirt shirt1 is " 
		  + shirt1.getColor() + ", made of "
		  + shirt1.getMaterial() + ", and has a neck size of "
		  + shirt1.getSize() + ".");

		System.out.println("Shirt shirt2 is " 
		  + shirt2.getColor() + ", made of "
		  + shirt2.getMaterial() + ", and has a neck size of "
		  + shirt2.getSize() + ".");
	}

}
