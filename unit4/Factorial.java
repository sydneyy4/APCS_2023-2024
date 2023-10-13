public class Factorial{
	public static int factorial(int n){
		
		//for int count, additon: 0, multiplication: 1
		//int count always goes before any loops/statements - otherwise it'll reset for each run
		int count = 1;

		if (n == 0 || n == 1){
			return 1;
		} 
		else{
			for (int i = 1; i <= n; i++){
				count *= i;
			}
		}
		return count;
	}

	public static void testFactorial (int n, int expected){
		int result = factorial(n);

		System.out.println("n:" + n + " result:" + result);

		if (result == expected){
			System.out.println("expected");
		}else{
			System.out.println("unexpected");
		}
		//return result;
	}
	public static void main (String [] args){
		testFactorial(0,1);
		testFactorial(1,1);
		testFactorial(2,2);
		testFactorial(3,6);
		testFactorial(4, 24);
		testFactorial(5,120);
	}
}