public class Vampire{
	public static boolean isVampire(float hour, boolean awake) {
		if (hour >= 6.0 && hour <= 22.0) {
			return !awake;
		} else {
			return awake;
		}

	}
	public static boolean testIsVampire (float hour, boolean awake, boolean expected) {
		boolean result = isVampire (hour, awake);

		System.out.println("Hour:" + hour + " is awake:" + awake + " result:" + result);

		if (result == expected) {
				System.out.println(" Expected");
			return true;

		} else {
				System.out.println(" Unexpected");
			return false;

		}
	}
	public static void main (String[] args){
		float houra = 4.0f;
		float hourb = 8.0f;
		float hourc = 23.0f;
		float hourd = 0.0f;
		float houre = 16.0f;
		testIsVampire (houra, true, true);
		testIsVampire (hourb, false, true);
		testIsVampire (hourc, true, true);
		testIsVampire (hourd, true, true);
		testIsVampire (houre, false, true);

	}
}