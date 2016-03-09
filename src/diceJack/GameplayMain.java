package diceJack;

import java.util.Scanner;

public class GameplayMain{
	Scanner leer = new Scanner(System.in);

	Integer result = 0;
	Integer result2 = 0;
	Integer choice1;
	Integer total = 0;
	Integer total2 = 0;
	Integer points;
	Integer points2;
	Integer current = 0;
	Integer scorereach = null;
	DiceRoll choice = new DiceRoll();
	DiceRoll choice2 = new DiceRoll();
	DiceJackMain sum1 = new DiceJackMain();
	Player rollP1 = new Player();
	

	
	public int limit() { 
		System.out.println("what do you want to play until?");
		scorereach = leer.nextInt();
		return scorereach;

	}

	public int startif() {
		limit();
		while ((scorereach > total) && (scorereach > total2)) {
			rollP1.player1();
			rollP1.player2();

		}
		System.out.println("we have a winner");
		return total;
	}
	
	
	public void end() {
		System.out.println("We have a winner");
	}
}
