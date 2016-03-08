package diceJack;
import java.util.Scanner;

public class CurrentScores {
	
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	Integer result = 0;
	DiceRoll choice = new DiceRoll();
	Player playerName = new Player();
	Integer whatever;
	Integer player1;
	Integer roll;
	Integer total;
	
	
	public int scoreKeep(Integer player1){
		player1 = choice.funn(result);
		total += roll;
		return player1;
		
	}
	
}
