public class Diff21 {
	
	public static void testDiff21(int n, int expected){
		int result = diff21(n);
		System.out.println("n:" + n + " expected:" + expected + " result:" + result);

		if (result == expected){
			System.out.println(" Expected");
		}
		else {
			System.out.print(" Unexpected");
		}
	}
	public static int diff21(int n){
		if (n <= 21){
			return 21 - n;
		} else {
			return (n - 21)*2;
		}
	}
	public static void main (String[] args) {
		testDiff21(19, 2);
		testDiff21(10, 11);
		testDiff21(43, 44);
		testDiff21(67, 92);
	}
}