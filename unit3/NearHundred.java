public class NearHundred {
	public static boolean nearHundred (int n){
		 return (n >= (100-10) && n <= (100+10) || n >= (200-10) && n <= (200+10));
	}
	public static boolean testNearHundred (int n, boolean expected){
		boolean result = nearHundred (n);

		System.out.println("n: " + n + " result: " + result);

		if (result == expected){
			System.out.println ("Expected");
			return true;
		} else {
			return false;
		}
	}
	public static void main (String [] args){
		testNearHundred (93, true);
		testNearHundred(90, true);
		testNearHundred(89, false);
	}
}