package diceJack;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class DiceRoll {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	public int funn(Integer pickNum){

			Integer resultNum;
			System.out.println("Pick Dice?");	
			pickNum = scan.nextInt();
			
			switch(pickNum){
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
				return pickNum;
					
	}

	
	}

}
