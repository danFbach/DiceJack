package diceJack;
import java.util.Scanner;


public class Player
{
	
	String playerName;
	Integer currentScore;
	boolean isPlaying;
	Integer result = 0;
	Integer result2 = 0;
	Integer choice1;
	Integer whatever;
	Integer current = 0;
	Integer difference;
	Integer gameLimit;
	Integer total = 0;
	Integer total2 = 0;
	Integer totalAI = 0;
	Integer points;
	Integer points2;
	Integer pointsAI;
	Integer scorereach;
	DiceRoll choice = new DiceRoll();
	DiceRoll choice2 = new DiceRoll();

	Scanner leer = new Scanner(System.in);
	
	
	public int limit() 
	{ 
		System.out.println("what do you want to play until?");
		scorereach = leer.nextInt();
		return limit();
	}
	
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
	 
	public int playerAI()
	{
		difference = scorereach - totalAI;
		if(difference > 12)
		{
			pointsAI = choice2.funn(20);
			totalAI += pointsAI;   //roll 20 dice
			System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
			return totalAI;
		}else if(difference > 10)
		{
			pointsAI = choice2.funn(12);
			totalAI += pointsAI;   //roll 12 dice
			System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
			return totalAI;
		}else if(difference > 8)
		{
			pointsAI = choice2.funn(10);
			totalAI += pointsAI;   //roll 10 dice
			System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
			return totalAI;
		}else if(difference > 6)
		{
			pointsAI = choice2.funn(8);
			totalAI += pointsAI;   //roll 8 dice
			System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
			return totalAI;
		}else if(difference > 4)
		{
			pointsAI = choice2.funn(6);
			totalAI += pointsAI;   //roll 6 dice
			System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
			return totalAI;
		}else
		{
			pointsAI = choice2.funn(4);
			totalAI += pointsAI;   //roll 4 dice
			System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
			return totalAI;
		}
	}
}






//	public void humanPlayer(String PlayerName, int CurrentScore, boolean IsPlaying){
//		
//		playerName = PlayerName;
//		currentScore = CurrentScore;
//		isPlaying = IsPlaying;
//		
//		
//		
//	}