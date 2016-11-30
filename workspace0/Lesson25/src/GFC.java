
public class GFC {
	
	 public static int GFC(int a, int b) {
		if ( a == b )
			return a;
		if (a > b)
			return GFC(a-b, b);
		else
			return GFC(a, b-a);
	}

	public static void main(String[] args) {
		
		int result = GFC(100, 5);
		System.out.println(result);
		
	}
}