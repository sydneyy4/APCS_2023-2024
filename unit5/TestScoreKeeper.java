public class TestScoreKeeper{
	public static void main (String [] args){
		ScoreKeeper sc = new ScoreKeeper();
		System.out.println(sc.accessScore());
		sc.scoreNormal();
		System.out.println(sc.accessScore());
		sc.scoreBonus();
		System.out.println(sc.accessScore());
	} 
}