package diceJack;

public class Player {
	
	String playerName;
	
	Integer currentScore;
	
	boolean isPlaying;
	
	Integer result = 0;
	Integer result2 = 0;
	Integer choice1;
	Integer whatever;
	Integer current = 0;
	Integer difference;
	GameplayMain total = new GameplayMain();
	DiceRoll choice = new DiceRoll();
	
	difference = total.gameplay1();
	
	
	public void humanPlayer(String PlayerName, int CurrentScore, boolean IsPlaying){
		
		playerName = PlayerName;
		currentScore = CurrentScore;
		isPlaying = IsPlaying;
		
		
		
	}
	public void aiPlayer(String PlayerName, int CurrentScore, boolean IsPlaying){
		
		playerName = PlayerName;
		currentScore = CurrentScore;
		isPlaying = IsPlaying;
		
		
		if(difference > 12){
			//roll 20 dice
		}else if(difference > 10){
			//roll 12 dice
		}else if(difference > 8){
			//roll 10 dice			
		}else if(difference > 6){
			//roll 8 dice
		}else if(difference > 4){
			//roll 6 dice
		}else{
			//roll 4 dice
		}
	}
}
