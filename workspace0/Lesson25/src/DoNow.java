
public class DoNow {
	public static int doNowFcn(int x) {
		if ( x == 1 ) {
		return -1;
		}
		return -1 * x + doNowFcn( x - 1 );
	}
	
	public static void main(String[] args) {
		
		int result = doNowFcn(4);
		System.out.println("Result: " + result);
	}
}
