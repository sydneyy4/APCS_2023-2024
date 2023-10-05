public class Attention{
	public static boolean attention(String s){
		System.out.println(s);
		
		String sub = s.substring(0,9);
		if (sub.equals("Hey, you!")){
			return true;
		} else {
			return false;
		}	
	}
	public static boolean testAttention(String s, boolean expected){
		boolean result = attention(s);

		if (result == expected){
			System.out.println("Expected");
			return true;
		} else {
			System.out.println("Unexpected");
			return false;
		}
	}
	public static void main (String [] args){
		testAttention("Hello, my name is Inigo Montoya.", false);
		testAttention("Excuse me, Dr. Kessner?", false);
		testAttention("Hey, you! Give me your code!", true);
	}
}