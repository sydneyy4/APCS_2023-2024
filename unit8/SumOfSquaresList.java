import java.util.*;

public class SumOfSquaresList{
	public static double SumOfSquaresList (ArrayList<Double> nums){
		int sum = 0;
		for (double x : nums){
			sum += x*x;
		}
		return sum;
	}

	public static double testSumOfSquaresList (ArrayList<Double> nums, double expected){
		double result = SumOfSquaresList(nums);
		
		System.out.println("result: " + result + " expected: " + expected);

		if (result == expected){
			System.out.println("Yay");
		} else {
			System.out.println("boo");
		}

		return result;
	}

	public static void main (String [] args){

		ArrayList<Double> nums1 = new ArrayList<Double>();
		nums1.add(0.0);
		testSumOfSquaresList(nums1, 0);

		ArrayList<Double> nums2 = new ArrayList<Double>();
		nums2.add(1.0);
		nums2.add(2.0);
		nums2.add(3.0);
		testSumOfSquaresList(nums2, 14.0);

		ArrayList<Double> nums3 = new ArrayList<Double>();
		nums3.add(2.0);
		nums3.add(2.0);
		nums3.add(2.0);
		testSumOfSquaresList(nums3, 12.0);
	}
}