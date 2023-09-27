

// this is a test

public class ParrotTalking {

	public static void testParrotTrouble (boolean talking, int hour, boolean expected){
		boolean result = parrotTrouble(talking, hour);

		System.out.println("talking: " + talking + " hour: " + hour 
			+ " result: " + result);

		if (result == expected){
			System.out.println(" Expected");
		}
		else {
			System.out.print(" Unexpected");
		}

	}

	public static boolean parrotTrouble(boolean talking, int hour) {
    	return (talking && (hour < 7 || hour > 20));
	}

	public static void main (String[] args) {
		testParrotTrouble(true, 6, true);
		testParrotTrouble(true, 23, true);
		testParrotTrouble(true, 7, false);
		testParrotTrouble(false,20, false);
		testParrotTrouble(false,14, false);
	}
	
}