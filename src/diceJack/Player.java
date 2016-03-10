package diceJack;

import java.util.Scanner;

public class Player {

	Integer result = 0;
	Integer result2 = 0;
	Integer total = 0;
	Integer total2 = 0;
	Integer points;
	Integer points2;
	Integer isPlaying1 = 1;
	Integer isPlaying2 = 1;
	DiceRoll choice = new DiceRoll();
	DiceRoll choice2 = new DiceRoll();

	Scanner leer = new Scanner(System.in);
	public int player1() {
		if(isPlaying1 == 1){
		points = choice.funn(result);
		total = total + points;
		System.out.println("Player 1 , you've rolled a: " + points + " Your total: " + total);
		}if(points == 0){
			System.out.println("Player has decided to stay.");
			isPlaying1 = 0;
		}else{}
		return total;
	}
	public int player2() {
		if(isPlaying2 == 1){
		points2 = choice2.funn(result2);
		total2 += points2;
		System.out.println("Player 2, you've rolled a: " + points2 + " Your total: " + total2);
		}if(points2 == 0){
			System.out.println("Player 2 has decided to stay.");
			isPlaying2 = 0;
		}else{}
		return total2;
	}

}