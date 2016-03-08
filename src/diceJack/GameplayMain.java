package diceJack;
import java.util.Scanner;


public class GameplayMain {
	Scanner leer = new Scanner(System.in);
	int aimscore;

	public void Selectlimit() {
		System.out.println("What do you want to play until?");
		aimscore = leer.nextInt();
		System.out.println("We will play until" + aimscore + "points");
	}
	public void 
}}