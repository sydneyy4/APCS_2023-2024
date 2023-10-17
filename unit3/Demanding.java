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
		String s = "Give me my soup!";
		System.out.println(demanding(s));
	}
}