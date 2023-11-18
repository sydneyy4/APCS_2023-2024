import java.util.*;

public class FilteringList{
	public static ArrayList<Integer> filtering (ArrayList<Integer> scores){
		ArrayList<Integer> filtering = new ArrayList<Integer>();

		for (int x : scores){
			if (x > 90){
				filtering.add(x);
			}
		}
		return filtering;
	}

	public static void main (String [] args){
		ArrayList<Integer> scores1 = new ArrayList<Integer>();
		scores1.add(51);
		scores1.add(52);
		scores1.add(53);
		scores1.add(100);
		System.out.println(filtering(scores1));

		ArrayList<Integer> scores2 = new ArrayList<Integer>();
		scores2.add(92);
		scores2.add(89);
		scores2.add(90);
		scores2.add(99);
		System.out.println(filtering(scores2));
	}
}