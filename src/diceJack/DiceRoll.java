package diceJack;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceRoll
{
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	public int funn(Integer pickNum)
	{
			System.out.println("\nChoose a Dice to roll!\n"+"4 - 6 - 8 - 10 - 12 - 20\n"+"Or, choose 0 in order to skip this turn.");	
			pickNum = scan.nextInt();
			
			switch(pickNum)
			{
			case (4):
				System.out.println("The " + pickNum + " Dice has been rolled.");
				pickNum = ThreadLocalRandom.current().nextInt(1, 5);
				return pickNum;
			case (6):
				System.out.println("The " + pickNum + " Dice has been rolled.");
				pickNum = ThreadLocalRandom.current().nextInt(1, 7);
				return pickNum;
			case (8):
				System.out.println("The " + pickNum + " Dice has been rolled.");
				pickNum = ThreadLocalRandom.current().nextInt(1, 9);
				return pickNum;
			case (10):
				System.out.println("The " + pickNum + " Dice has been rolled.");
				pickNum = ThreadLocalRandom.current().nextInt(1, 11);
				return pickNum;
			case (12):
				System.out.println("The " + pickNum + " Dice has been rolled.");
				pickNum = ThreadLocalRandom.current().nextInt(1, 13);
				return pickNum;
			case (20):
				System.out.println("The " + pickNum + " Dice has been rolled.");
				pickNum = ThreadLocalRandom.current().nextInt(1, 21);
				return pickNum;
			case (0):
				System.out.println("\nYou have decided to sit this turn out.");
				return pickNum;
			default:
				System.out.println("\n" + pickNum +" is not a valid dice selection. Your turn has been skipped.");
				pickNum = 0;
				return pickNum;
		}
	}
}
