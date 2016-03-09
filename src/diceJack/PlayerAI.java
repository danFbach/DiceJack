package diceJack;

public class PlayerAI 
{
	Integer totalAI = 0;
	Integer pointsAI;
	
	difference = scorereach - totalAI;
	if(difference > 12)
	{
		totalAI += pointsAI;   //roll 20 dice
		System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
		return totalAI;
	}else if(difference > 10)
	{
		totalAI += pointsAI;   //roll 12 dice
		System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
		return totalAI;
	}else if(difference > 8)
	{
		totalAI += pointsAI;   //roll 10 dice
		System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
		return totalAI;
	}else if(difference > 6)
	{
		totalAI += pointsAI;   //roll 8 dice
		System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
		return totalAI;
	}else if(difference > 4)
	{
		totalAI += pointsAI;   //roll 6 dice
		System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
		return totalAI;
	}else
	{
		totalAI += pointsAI;   //roll 4 dice
		System.out.println("AI-player rolled a: " + pointsAI + " AI-player total: " + totalAI);
		return totalAI;
	}
}
