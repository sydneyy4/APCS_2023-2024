import java.util.*;

public class FibonacciList{
	public static int[] fibonacci(int n){

		int[] fibonacci = new int[n];

		if (n <= 0){
			fibonacci[0] = 0;
		}
		else if (n > 1){
			fibonacci[1]=1;
		
			for (int i = 2; i < n; i++){
				fibonacci[i] = fibonacci[i-1] - fibonacci[i-2];
			}
		}

		return fibonacci;
	}

	public static void main (String [] args){
		int[] a = fibonacci(2);
		//int b = 3;
		//int c = 4;
		//int d = 5; 
		System.out.println(" " + a);
		//System.out.println(" " + fibonacci(b));
		//System.out.println(" " + fibonacci(c));
		//System.out.println(" " + fibonacci(d));
	}
}