public class FavoriteNumber{
	public static String favoriteNumber(String name, int n){
		return ("Hello, my name is " + name + " and my favorite number is " + n);
	}
	public static void main (String [] args){
		//why declare String name again??
		String name = "Sydney";
		int n = 16;
		System.out.println(favoriteNumber(name,n));
	}
}