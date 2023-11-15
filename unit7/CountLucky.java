public class CountLucky{
	public static int countLucky(int[] nums){
		int count = 0;
		for (int i = 0; i < nums.length; i++){
			if (nums[i]%7 == 0 || nums[i]%10 == 7){
				count ++;
			}
		}
		return count;

		//int count = 0;
		//for (int value : nums)
			//if (value%7 == 0 || value%10 == 7){
				//count ++;
			//}
	}
	public static int testCountLucky(int[] nums, int expected){
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
	public static void main(String [] args){
		int [] avalues = {0,7,14};
		int [] bvalues = {9,49,77};
		int [] cvalues = {207,97,87,1};
		int [] dvalues = {107, 56, 77};
		testCountLucky(avalues, 3);
		testCountLucky(bvalues,2);
		testCountLucky(cvalues,3);
		testCountLucky(dvalues, 3);
	}
}