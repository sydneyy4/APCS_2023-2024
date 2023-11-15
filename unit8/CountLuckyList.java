import java.util.*;

public class CountLuckyList {
	public static int countLucky(ArrayList<Integer> nums){
	int count = 0;
		for (int i = 0; i < nums.size(); i++){
			int a = nums.get(i);
			if (a%7 == 0 || a%10 == 7){
				count ++;
			}
		}
		return count;

	}

	public static int testCountLucky (ArrayList<Integer> nums, int expected){
		int result = countLucky(nums);
		
		System.out.println("expected: " + expected + " result: " + result);

		if (result == expected){
			System.out.println("YAY");
		}
		else{
			System.out.println("boo");
		}
		return result;
	}

	public static void main (String [] args){
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(1);
		nums1.add(2);
		nums1.add(3);
		testCountLucky(nums1, 0);

		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(7);
		nums2.add(13);
		nums2.add(17);
		testCountLucky(nums2, 2);


		ArrayList<Integer> nums3 = new ArrayList<Integer>();
		nums3.add(107);
		nums3.add(207);
		testCountLucky(nums3, 2);

	}
}