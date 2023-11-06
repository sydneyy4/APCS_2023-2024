public class SumOfSquares{
	public static double sumOfSquares(double[] vals){
		int sum = 0;
		for (double value : vals) {
			sum += value*value; 
		}
		return sum;
	}
	public static double testSumOfSquares (double [] vals, double expected){
		double result = sumOfSquares(vals);

		System.out.println("expected: "+ expected + " result:" + result);

		if (result == expected)
			System.out.println("Woohoo!");
		else
			System.out.println("Boo");

		return result;
	}
	public static void main (String [] args){
		double [] avalues = {0.0,1.0,2.0};
		double [] bvalues = {3.0,3.0,4.0};
		double [] cvalues = {5.0,5.0,1.0,2.0};
		testSumOfSquares(avalues, 5.0);
		testSumOfSquares(bvalues,34.0);
		testSumOfSquares(cvalues,55.0);
	}
}