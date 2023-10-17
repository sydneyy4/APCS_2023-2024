public class ScoreKeeper{
	private int score;
	//default constructor
	public ScoreKeeper(){
		this.score = 0;
	}
	//constructor
	public ScoreKeeper(int score){
		this.score = score;
	}
	public int accessScore(){
		return this.score;
	}
	public void scoreNormal(){
		this.score += 100;
	}
	public void scoreBonus(){
		this.score += 1000;
	}
}