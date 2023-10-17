public class TestMagicEightBall{
	public static void main (String [] args){
		
		//how are we creating an object w/o constructor

		//constructor is being made automatically ("default constructor")
			//doesn't actually do anything

		MagicEightBall mag = new MagicEightBall();

		System.out.println(mag.ask("Will I have a good day?"));
	}
}