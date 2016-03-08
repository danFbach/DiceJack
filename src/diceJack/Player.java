package diceJack;

public class Player {
	
	String playerName;
	
	Integer currentScore;
	
	boolean isPlaying;
	
	Integer result = 0;
	Integer choice1;
	Integer whatever;
	Integer current = 0;
	CurrentScores score = new CurrentScores();
	DiceRoll choice = new DiceRoll();
	
	public void humanPlayer(String PlayerName, int CurrentScore, boolean IsPlaying){
		
		playerName = PlayerName;
		currentScore += choice.funn(result);
		isPlaying = IsPlaying;
		
		
		
	}
	public void aiPlayer(String PlayerName, int CurrentScore, boolean IsPlaying){
		
		playerName = PlayerName;
		currentScore = CurrentScore;
		isPlaying = IsPlaying;
		
	}
	

}
