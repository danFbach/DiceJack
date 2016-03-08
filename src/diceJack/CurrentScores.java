package diceJack;
import java.util.Scanner;

public class CurrentScores {
	
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	Integer choice1;
	DiceRoll choice = new DiceRoll();
	
	public void pick(){
	System.out.println("Pick Dice?");
	
	choice1 = scan.nextInt();
	choice.diceChoice(choice1);
	}
}
