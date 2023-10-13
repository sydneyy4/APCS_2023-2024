public class CountOccurrences{
	public static int countOccurrences(String str, String fraction){

		int count = 0;

		for (int i = 0; i <= str.length()-fraction.length(); i++){
			if(str.substring(i, i+fraction.length()).equals(fraction)){
				count ++;
			}
		}
		return count;
	}
	public static int testCountOccurrences(String str, String fraction, int expected){
		int result = countOccurrences(str, fraction);

		System.out.println("Str:" + str + " fraction:" + fraction + " result:" + result);

		if (result == expected){
			System.out.println("expected");

		}else{
			System.out.println("unexpected");
		}
		return result;
	}
	public static void main (String [] args){
		testCountOccurrences("Mississippi", "iss", 2);
		testCountOccurrences("banananana", "na", 4);
		testCountOccurrences("occurrence", "c", 3);
		testCountOccurrences("assessors", "s", 5);
	}
}