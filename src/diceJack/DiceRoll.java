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
			System.out.println(pickNum);
				return pickNum;
			case (6):
				pickNum = ThreadLocalRandom.current().nextInt(1, 7);
			System.out.println(pickNum);
				return pickNum;
			case (8):
				pickNum = ThreadLocalRandom.current().nextInt(1, 9);
			System.out.println(pickNum);
				return pickNum;
			case (10):
				pickNum = ThreadLocalRandom.current().nextInt(1, 11);
			System.out.println(pickNum);
				return pickNum;
			case (12):
				pickNum = ThreadLocalRandom.current().nextInt(1, 13);
			System.out.println(pickNum);
				return pickNum;
			case (20):
				pickNum = ThreadLocalRandom.current().nextInt(1, 21);
			System.out.println(pickNum);
				return pickNum;
			default:
				return pickNum;
					
	}

	
	}

}
