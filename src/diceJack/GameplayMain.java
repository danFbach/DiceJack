package diceJack;

import java.util.Scanner;

public class GameplayMain
{
	Scanner leer = new Scanner(System.in);

	Integer total = 0;
	Integer total2 = 0;
	Integer scorereach;
	DiceJackMain sum1 = new DiceJackMain();
	Player rollP1 = new Player();
	

	


	public int startif() 
	{
		scorereach = rollP1.limit();
		while ((scorereach > total) && (scorereach > total2)) 
		{
			rollP1.player1();
			rollP1.playerAI();

		}
		System.out.println("we have a winner");
		return total;
	}
	
	
	public void end() 
	{
		System.out.println("We have a winner");
	}
	public void menu(){
		System.out.println("Would you like to play against a human or CPU opponent?");
		
		
		
	}
	
	
}

