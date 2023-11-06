public class TotalZ{
	public static int totalZ(String[] strs){
		int total = 0;
		for (String s : strs){
			if (s.substring(0,1).equals("z")){
				total += s.length();
			}
			if (s.substring(0,1).equals("Z")){
				total += s.length();
			}
		}
		return total;
	}
	public static int testTotalZ(String[] strs, int expected){
		int result = totalZ(strs);

		System.out.println("exptected: " + expected + " result: " + result);

		if (result == expected)
			System.out.println("Yay");
		else
			System.out.println("Boo");

		return result;
	}
	public static void main (String [] args){
		String [] astrs = {"Zoo", "zombie", "run"};
		String [] bstrs = {"Loo", "backpack", "dirt"};
		String [] cstrs = {"Zoo", "zombie", "run", "zigzag"};
		testTotalZ(astrs, 9);
		testTotalZ(bstrs, 0);
		testTotalZ(cstrs, 15);
	}
}