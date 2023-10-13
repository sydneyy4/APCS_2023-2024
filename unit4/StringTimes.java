public class StringTimes{
	public static String stringTimes(String str, int n) {
  		String result = "";
  		for (int i = 0; i < n; i ++){
   			result += str;
  		}
  return result;
	}	
	public static String testStringTimes (String str, int n, String expected){
		String result = stringTimes(str,n);

		System.out.println("str:" + str + " n:" + n + " result:" + result);

		if (result.equals(expected)){
			System.out.println ("Expected");
		}else{
			System.out.println ("Unexpected");
		}
		return result;
	}
	public static void main (String [] args){
		testStringTimes("hello", 3, "hellohellohello");
		testStringTimes("Hi", 5, "HiHiHiHiHi");
		testStringTimes("Oh Boy!", 2, "Oh Boy!Oh Boy!");
	}
}