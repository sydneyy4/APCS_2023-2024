public class HelloAlgorithms {
	public static int findFirstE (String s){
		for (int i = 0; i < s.length(); i++){
			//substring (index, next index) to get one index
			String sub = s.substring(i,i+1);
			if (sub.equals("e"))
				return i;
		}

		return -1; //if there is no e in the name
	}
	public static int countE (String s){
		int count = 0;

		for (int i = 0; i<s.length(); i++){
		String sub = s.substring(i, i+1);
			if (sub.equals("e"))
				count++;
		}
		return count;
		}

	public static String binimate(String s) {
		String s = "";

		for (int i = 1; i < s.length(); i+=2){
			String sub = s.substring(i, i+1);
			if (i%2 ==1)
				result += sub;

		}


		return result;
	}

	public static void main(String[] args) {
	String s = "Dr. Kessner";
	System.out.println("firstE " + s + " " + findFirstE(s));
	//System.out.println("countE" + sub + " " + countE(sub));
	s = "banana";
	System.out.println(binimate(s));
	}
}