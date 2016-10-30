public class Shirt {

	private String color;
	private String material;
	private int size;

	public int getSize() {
		return size;
	}
	
	public void setSize(int s) {
		if( s >= 12 ) { //valid size
			size = s;
			}
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String m) {
		material = m;
	}
	
	
}
