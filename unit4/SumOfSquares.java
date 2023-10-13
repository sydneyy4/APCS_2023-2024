public class SumOfSquares{
	public static int sumOfSquares (int n){
		int result = 0;
		for (int i = 1; i <= n; i ++){
			int square = i*i;
			result += square;
		} 
		return result;
	}
	public static int testSumOfSquares (int n, int expected){
		int result = sumOfSquares(n);

		System.out.println("n: " + n + " result: " + result);

		if (result == expected){
			System.out.println("expected");

		}else{
			System.out.println("unexpected");
		}
		return result;
	}
	public static void main (String [] args){
		testSumOfSquares(1, 1);
		testSumOfSquares(2,5);
		testSumOfSquares(3,14);
		testSumOfSquares(4,30);
		testSumOfSquares(5,55);
	}
}