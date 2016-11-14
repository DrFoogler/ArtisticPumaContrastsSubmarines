public class gCF {

	public static int mysteryFcn(int n) {
		//precondition: n > 0
	int result = 1;
	while ( n >= 1 ) {
		result *= n;
		n--;
	}
		return result;
}
	public static void main(String[] args) {
		System.out.println(mysteryFcn(5));
	}
}
