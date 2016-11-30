
public class DoNow {
	
	public static int DoNow(int a, int b) {
		int result = a;
		while ( b > 1 ) {
		result *= a;
		b--;
		}
		return result;
		}

	public static void main(String[] args) {
		int result = DoNow(2, 3);
		System.out.println(result);
	}

}
