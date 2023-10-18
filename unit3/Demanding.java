public class Demanding{
	public static boolean demanding(String s){
		if(s.length() < 4){
			return false;
		} else if (s.substring(0,4).equals("Give")){
			return true;
		} else {
			return false;
		}
	}
	public static void main (String [] args){
		String a = "Give me my soup!";
		System.out.println(demanding(a));
		String b = "Please give that to me";
		System.out.println(demanding(b));
	}
}