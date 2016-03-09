package diceJack;

import java.util.Scanner;

public class GameplayMain extends DiceRoll {
	Scanner leer = new Scanner(System.in);

	Integer result = 0;
	Integer result2 = 0;
	Integer choice1;
	Integer total = 0;
	Integer total2 = 0;
	Integer points;
	Integer points2;
	Integer current = 0;
	// CurrentScores score = new CurrentScores();
	DiceRoll choice = new DiceRoll();
	DiceRoll choice2 = new DiceRoll();
	Integer scorereach = null;
	// boolean taco;
	// taco = true;

	DiceJackMain sum1 = new DiceJackMain();

	public int gameplay1() {
		points = choice.funn(result);
		total = total + points;
		System.out.println("p1 You've rolled a: " + points + " Your total: " + total);
		return total;
	}

	public int gameplay2() {
		points2 = choice2.funn(result2);
		total2 = total2 + points2;
		System.out.println("p2 You've rolled a: " + points2 + " Your total: " + total2);
		return total2;
	}

	public int limit() {
		System.out.println("what do you want to play until?");
		scorereach = leer.nextInt();
		return scorereach;

	}

	public int startif() {
		limit();
		while ((scorereach > total) && (scorereach > total2)) {
			gameplay1();
			gameplay2();

		}
		System.out.println("we have a winner");
		return total;
	}
	
	
	public void end() {
		System.out.println("We have a winner");
	}
}
