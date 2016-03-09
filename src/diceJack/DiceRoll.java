package diceJack;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceRoll {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	public int funn(Integer pickNum){

			System.out.println("\nChoose a Dice to roll!\n"+"4 - 6 - 8 - 10 - 12 - 20\n"+"Or, choose 0 in order to skip this turn.");	
			pickNum = scan.nextInt();
			
			switch(pickNum){
			case (0):
				System.out.println("\nYou have decided to sit this turn out.");;
			case (4):
				pickNum = ThreadLocalRandom.current().nextInt(1, 5);
				return pickNum;
			case (6):
				pickNum = ThreadLocalRandom.current().nextInt(1, 7);
				return pickNum;
			case (8):
				pickNum = ThreadLocalRandom.current().nextInt(1, 9);
				return pickNum;
			case (10):
				pickNum = ThreadLocalRandom.current().nextInt(1, 11);
				return pickNum;
			case (12):
				pickNum = ThreadLocalRandom.current().nextInt(1, 13);
				return pickNum;
			case (20):
				pickNum = ThreadLocalRandom.current().nextInt(1, 21);
				return pickNum;
			default:
				System.out.println("\nInvalid Dice Selection. Your turn has been skipped.");
				pickNum = 0;
				return pickNum;
		}
	}
}
