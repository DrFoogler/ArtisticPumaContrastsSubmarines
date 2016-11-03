public class BoxDriver {
	
	public static void main(String[] args) {
		
		Box box1 = new Box();
		
		// since default Box obj is a 1 x 1 x 1, vol = 1
		System.out.println("Box box1, with default attributes, " + "has a volume of " + box1.getVolume() + ".");
		
		box1.setDimensions(5.2, 2.9, 1);
		
		System.out.println("\n\nAfter setting dimensions, box1 " + "has a volume of " + box1.getVolume() + ".");
	}
}