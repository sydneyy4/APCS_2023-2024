public class Reverse{
	public static String reverse (String str){
		String result = "";

		for (int i = str.length()-1; i >= 0; i--){
			result += str.substring(i, i+1);
		}
		return result;
	}
	public static void testReverse (String str, String expected){
		String result = reverse(str);

		System.out.println("str: " + str + "\nresult: " + result);

		if (result.equals(expected)){
			System.out.println("Expected");

		}else{
			System.out.println("Unexpected");
		}
		//void does not have a return (no need for "return result;")
	}
	public static void main (String [] args){
		testReverse("bad", "dab");
	}
}