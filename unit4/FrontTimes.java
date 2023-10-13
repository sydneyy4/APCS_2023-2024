public class FrontTimes{
	public static String frontTimes(String str, int n){
		String result = "";
		if (str.length() < 3){
			for (int i = 0; i < n; i++){
				result += str;
			}
		} else {
			for (int i = 0; i < n; i++){
				String front = str.substring(0,3);
				result += front;
			}
		}
		return result;
	}
	public static String testFrontTimes(String str, int n, String expected){
		String result = frontTimes(str, n);

		System.out.println("str:" + str + " n:" + n + " result:" + result);

		if (result.equals(expected)){
			System.out.println("Expected");
		}else{
			System.out.println("Unexpected");
		}
		return result;
	}
	public static void main (String [] args){
		testFrontTimes("abcde", 2, "abcabc");
		testFrontTimes("he", 4, "hehehehe");
		testFrontTimes("dibs", 3, "dibdibdib");
	}
}