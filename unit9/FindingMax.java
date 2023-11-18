import java.util.*;

public class FindingMax{
	public static double findingMax(double [] vals){
		double max = vals[0];
		for (double x : vals){
			if (x>max){
				max = x;
			}
		}
	return max;
	}
	public static double testFindingMax(double [] vals, double expected){
		double result = findingMax(vals);

		System.out.println("Result: " + result + " expected: " + expected);

		if (result == expected){
			System.out.println("YAY");
		}
		else{
			System.out.println("boooo");
		}
		return result;
	}
	public static void main (String [] args){
		double [] avals = {1.0, 2.1, 5.3};
		double [] bvals = {-0.1, -35.0, -90.1};

		testFindingMax(avals, 5.3);
		testFindingMax(bvals, -0.1);
	}
}