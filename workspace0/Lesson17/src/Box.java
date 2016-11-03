public class Box { 
	private double length; 
	private double width; 
	private double depth; 
	
	public Box() {  /* for a new Box, assume it's a 1x1x1 */ 
	length = 1;  
	width = 1;  
	depth = 1; 
	}
	
	public void setDimensions(double l, double w, double d) {  
		length = l;  
		width = w;  
		depth = d; 
		} 
	
	public double getVolume() { 
		return length * width * depth; 
		}
	}
