import java.util.*;

public class TotalZList{
	public static int totalZList(ArrayList<String> strings){
		int total = 0;

		for (String x : strings){
			if ((x.substring(0,1).equals("z")) || (x.substring(0,1).equals("Z"))){
				total += x.length();
			}
		}
		return total;
	}

	public static int testTotalZList(ArrayList<String> strings, int expected){
		int result = totalZList(strings);

		System.out.println("Result: " + result + " expected: " + expected);

		if (result == expected){
			System.out.println("yay!");
		} else {
			System.out.println("boo");
		}
		return result;
	}
	public static void main (String [] args){
		ArrayList<String> strings1 = new ArrayList<String>();
		strings1.add("Dr. Kessner");
		strings1.add("Dr. Sands");
		testTotalZList(strings1, 0);

		ArrayList<String> strings2 = new ArrayList<String>();
		strings2.add("Zorro");
		strings2.add("zero");
		strings2.add("zippy");
		testTotalZList(strings2, 14);
	}
}

//countZNames(ArrayList{"Dr. Kessner", "Dr. Sands"}) -> 0
//countZNames(ArrayList{"Zorro", "zero", "zippy"}) -> 14