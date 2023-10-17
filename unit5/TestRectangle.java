public class TestRectangle{
	public static void main (String [] args){
		Rectangle rect = new Rectangle(4.0,5.0);
		System.out.println(rect.accessBase());
		System.out.println(rect.accessHeight());
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		System.out.println(rect.diagonal());
	}
}