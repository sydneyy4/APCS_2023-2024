public class MagicEightBall{
	//do we declare them here because they are final?
	//(asking because they are usually declared in the constructor)
	private final String a = "Most likely.";
	private final String b = "Signs point to yes.";
	private final String c = "Very doubtful.";
	private final String d = "My reply is No.";

	//no need for constructor
	public String ask(String question){
		String result = "";
		int f = (int)(Math.random()*4)+1;
		if (f == 1){
			return a;
		} else if (f == 2){
			return b;
		} else if (f == 3){
			return c;
		} else if (f == 4){
			return d;
		}	
	return result;
	}
}