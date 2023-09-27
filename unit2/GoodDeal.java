public class GoodDeal {
	public static boolean goodDeal(double originalPrice, double salePrice) {
		double percentage = (salePrice/originalPrice)*100;
		return percentage < 75;

	}
	public static boolean testGoodDeal (double originalPrice, double salePrice, boolean expected) {
		boolean result = goodDeal (originalPrice, salePrice);

		System.out.println("original price: " + originalPrice + " sale price: " + salePrice + " result: " + result);

		if (result == expected) {
				System.out.println("Expected");
			return true;

		} else {
				System.out.println("Unexpected");
			return false;

		}
	}
	public static void main (String[] args){
		testGoodDeal (75.0, 45.0, true);
		testGoodDeal (100.0, 50.0, true);
		testGoodDeal (95.0, 70.0, true);
		testGoodDeal (130.0, 110.0, false);
		testGoodDeal (65.0, 28.0, true);
		testGoodDeal (240.0, 215.0, false);

	}
}