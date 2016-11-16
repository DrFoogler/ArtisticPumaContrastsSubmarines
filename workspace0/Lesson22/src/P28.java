public class P28 {

	public static void main(String[] args) {

		System.out.println(P28(63, 14));
		System.out.println(P28(16,128));
		System.out.println(P28(55,7));
	}
	
	public static int P28(int a, int b) {
		
		while(a != b) {
			
			if(a > b) {
				
				a -= b;
			}
			
			else {
				
				b -= a;
			}
		}
		return a;
	}
}
