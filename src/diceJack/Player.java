package diceJack;
import java.util.Scanner;


public class Player
{
	
	Integer result = 0;
	Integer result2 = 0;
	Integer total = 0;
	Integer total2 = 0;
	Integer points;
	Integer points2;
	DiceRoll choice = new DiceRoll();
	DiceRoll choice2 = new DiceRoll();

	Scanner leer = new Scanner(System.in);
	
	public int player1() 
	{
		points = choice.funn(result);
		total = total + points;
		System.out.println("Player 1, you've rolled a: " + points + " Your total: " + total);
		return total;
	}
	public int player2() 
	{
		points2 = choice2.funn(result2);
		total2 += points2;
		System.out.println("Player 2, you've rolled a: " + points2 + " Your total: " + total2);
		return total2;
	}
	
}
