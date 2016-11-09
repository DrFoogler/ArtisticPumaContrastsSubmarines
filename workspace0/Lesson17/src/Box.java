/**
 * 
 * @author Ben Reynoso
 * @version 1.0
 *
 */
public class Box {
	
	/**
	 * length of box
	 */
	private double length;
	
	/**
	 * width of box
	 */
	private double width;
	
	/**
	 * depth of box
	 */
	private double depth; 
	
	/**
	 * Creates new Box object
	 * 
	 * 
	 * 
	 */
	public Box() {  /* for a new Box, assume it's a 1x1x1 */ 
	length = 1;  
	width = 1;  
	depth = 1; 
	}
	
	/**
	 * Sets dimensions of Box object
	 * 
	 * @param l length of box
	 * @param w width of box
	 * @param d depth of box
	 */
	public void setDimensions(double l, double w, double d) {  
		length = l;  
		width = w;  
		depth = d; 
		} 
	
	/**
	 * Gets volume of Box
	 * 
	 * @return volume of box
	 */
	public double getVolume() { 
		return length * width * depth; 
		}
	}
