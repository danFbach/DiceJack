package diceJack;

import java.util.Scanner;

public class GameplayMain extends DiceRoll {
	Scanner leer = new Scanner(System.in);

	Integer result = 0;
	Integer choice1;
	Integer total = 0;
	Integer total2 = 0;
	Integer points;
	Integer points2;
	Integer current = 0;
	// CurrentScores score = new CurrentScores();
	DiceRoll choice = new DiceRoll();
	DiceRoll choice2 = new DiceRoll();
	// boolean taco;
	// taco = true;

	DiceJackMain sum1 = new DiceJackMain();

	public int gameplay1() {
		points = sum1.pointone();
		total = total + points;
		System.out.println("p1 You've rolled a: " + points + " Your total: " + total);
		return total;
	}
	public int gameplay2(){
		points2 = choice2.funn(result);
		total2 = total2 + points2;
		System.out.println("p2 You've rolled a: " + points2 + " Your total: "+ total);
		return total;
	}




public int pointone() {
	points = choice.funn(result);
	return total;
}
}