package diceJack;

import java.util.Scanner;

public class GameplayMain {
	Scanner leer = new Scanner(System.in);

	Integer total = 0;
	Integer total2 = 0;
	Integer scorereach;
	String playeroption;
	DiceJackMain sum1 = new DiceJackMain();
	Player rollP1 = new Player();
	PlayerAI rollAI = new PlayerAI();

	public int startif() 

	
	{System.out.println("what do you want to play until?");
	scorereach = leer.nextInt();
		while ((scorereach > total) || (scorereach > total2)) 
		{
			rollP1.player1();
			rollP1.player2();

	{ 
			
		
		while ((scorereach > total) && (scorereach > total2)) 
		{
			rollP1.player1();
			rollAI.playerAI(scorereach);
		}
		System.out.println("we have a winner");
		}
	return total;}
	}

	public void end() {
		System.out.println("We have a winner");
	}

	public void menu() {
		System.out.println("Would you like to play against a human or comp opponent?");
		playeroption = leer.next();
		if (playeroption.equals("human")) {
			System.out.println("what do you want to play until?");
			scorereach = leer.nextInt();
				while (true) 
				{
					rollP1.player1();
					if((scorereach < rollP1.total) || (scorereach < rollP1.total2)){
						break;
					}
					rollP1.player2();
					if((scorereach < rollP1.total) || (scorereach < rollP1.total2)){
						break;
				}
				}
				end();
			
		} else if (playeroption.equals("comp")) {
			System.out.println("what do you want to play until?");
			scorereach = leer.nextInt();
			while (true) 
			{
				rollP1.player1();
				if((scorereach < rollP1.total) || (scorereach < rollP1.total2)){
					break;
				}
				rollAI.playerAI(scorereach);
				if((scorereach < rollP1.total) || (scorereach < rollP1.total2)){
					break;
				}
		}
		end();	
	}
}
		}
