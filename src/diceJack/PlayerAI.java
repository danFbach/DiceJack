package diceJack;

import java.util.concurrent.ThreadLocalRandom;

public class PlayerAI 
{
	Integer totalAI = 0;
	Integer pointsAI;
	Integer difference;
	
	
	public Integer playerAI(Integer scorereach){
		
	difference = scorereach - totalAI;
	if(difference > 12)
	{
		pointsAI = ThreadLocalRandom.current().nextInt(1, 21);
		totalAI += pointsAI;   //roll 20 dice
		System.out.println("\nAI-player rolled a: " + pointsAI +" with the 20-dice. \nAI-player total: " + totalAI);
		return totalAI;
	}else if(difference > 10)
	{
		pointsAI = ThreadLocalRandom.current().nextInt(1, 13);
		totalAI += pointsAI;   //roll 12 dice
		System.out.println("\nAI-player rolled a: " + pointsAI + " with the 12-dice. \nAI-player total: " + totalAI);
		return totalAI;
	}else if(difference > 8)
	{
		pointsAI = ThreadLocalRandom.current().nextInt(1, 11);
		totalAI += pointsAI;   //roll 10 dice
		System.out.println("\nAI-player rolled a: " + pointsAI + " with the 10-dice. \nAI-player total: " + totalAI);
		return totalAI;
	}else if(difference > 6)
	{
		pointsAI = ThreadLocalRandom.current().nextInt(1, 9);
		totalAI += pointsAI;   //roll 8 dice
		System.out.println("\nAI-player rolled a: " + pointsAI + " with the 8-dice. \nAI-player total: " + totalAI);
		return totalAI;
	}else if(difference > 4)
	{
		pointsAI = ThreadLocalRandom.current().nextInt(1, 7);
		totalAI += pointsAI;   //roll 6 dice
		System.out.println("\nAI-player rolled a: " + pointsAI + " with the 6-dice. \nAI-player total: " + totalAI);
		return totalAI;
	}else
	{
		pointsAI = ThreadLocalRandom.current().nextInt(1, 5);
		totalAI += pointsAI;   //roll 4 dice
		System.out.println("\nAI-player rolled a: " + pointsAI + " with the 4-dice. \nAI-player total: " + totalAI);
		return totalAI;
		}
	}
}