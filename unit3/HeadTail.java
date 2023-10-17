public class HeadTail{
	public static String headTail (String s){
		String h = s.substring(0,2);
		String t = s.substring(s.length() - 2, s.length());
		return h + t;
	}

	public static void main (String[]args){
		String s = "Sydney";
		System.out.println(headTail(s));
	}
}