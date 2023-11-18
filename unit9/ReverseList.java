import java.util.*;

public class ReverseList{
	public static String reverse(String s){
		String result = "";

		for (int i = s.length() - 1; i >= 0; i--){
			result += s.substring(i, i+1);
		}
		return result;
	}
	public static ArrayList<String> reverseAll(ArrayList<String> strings){
		ArrayList<String> result = new ArrayList<String>();

		for (String str : strings){
			result.add(reverse(str));
		}
		return result;
	}
	public static void main (String [] args){
		ArrayList<String> strings1 = new ArrayList<String>();
		strings1.add("abcd");
		strings1.add("xyz");
		System.out.println(reverseAll(strings1));

		ArrayList<String> strings2 = new ArrayList<String>();
		strings2.add("1234");
		strings2.add("5678");
		System.out.println(reverseAll(strings2));
	}
}