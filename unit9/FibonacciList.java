import java.util.*;

public class FibonacciList{
	public static int[] fibonacci(int n){

		int[] fibonacci = new int[n];

		if (n > 0){
			fibonacci[0] = 0;
		}
		 if (n > 1){
			fibonacci[1]=1;
		} 

		for (int i = 2; i < n; i++){
				fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			}
		
		return fibonacci;
	}

	public static void main (String [] args){

		for (int f : fibonacci(2)){
			System.out.print(" " + f);
		}
		System.out.println();

		for (int f : fibonacci(3)){
			System.out.print(" " + f);
		}
		System.out.println();

		for (int f : fibonacci(4)){
			System.out.print(" " + f);
		}
		System.out.println();

		for (int f : fibonacci(5)){
			System.out.print(" " + f);
		}
		System.out.println();
	}
}