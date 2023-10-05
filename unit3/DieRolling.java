public class DieRolling{
	public static int dieRolling(){
		return (int) (Math.random() * 6) + 1;	
	}
	public static void main (String[] args){
		System.out.println(dieRolling());
	}
}