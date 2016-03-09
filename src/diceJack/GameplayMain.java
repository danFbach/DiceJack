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

	public void end() {
		System.out.println("We have a winner");
	}

	public void bust() {
		if ((rollP1.total > scorereach)) {
			System.out.print("Player 1 has busted.. The P1 final score is: "+ rollP1.total + " .  " +"Player 2 final score:"+rollP1.total2);
			
		}
	}

	public void bustuser(){
		if ((rollP1.total > scorereach)) {
			System.out.print("Player 1 has busted.. The P1 final score is: "+ rollP1.total + " .  " +"AI Player  final score:"+rollAI.totalAI);
			
		}
	}	
	public void bust2() {
		if ((rollP1.total2 > scorereach)) {
			System.out.print("Player 2 has busted.. The P1 final score is: "+ rollP1.total + " .  " +"Player 2 final score:"+rollP1.total2);
		}

	}

	public void bustAI() {
		if ((rollAI.totalAI > scorereach)) {
			System.out.print("AI has busted.. The P1 final score is: "+ rollP1.total + " .  " +"AI Player  final score:"+rollAI.totalAI);
		}
	}

	public void menu() {
		System.out.println("Would you like to play against a human or comp opponent?");
		playeroption = leer.next();
		if (playeroption.equals("human")) {
			System.out.println("what do you want to play until?");
			scorereach = leer.nextInt();
			while (true) {

				rollP1.player1();
				if ((scorereach < rollP1.total) || (scorereach < rollP1.total2)) {
					bust();
					break;
				}
				rollP1.player2();
				if ((scorereach < rollP1.total) || (scorereach < rollP1.total2)) {
					bust2();
					break;
				}
			}
			System.out.println("");
			end();

		} else if (playeroption.equals("comp")) {
			System.out.println("what do you want to play until?");
			scorereach = leer.nextInt();
			while (true) {
				rollP1.player1();
				if ((scorereach < rollP1.total) || (scorereach < rollAI.totalAI)) {
					bustuser();
					break;
				}
				rollAI.playerAI(scorereach);
				if ((scorereach < rollP1.total) || (scorereach < rollAI.totalAI)) {
					bustAI();
					break;
				}
			}
			System.out.println("");
			end();
		}
	}
}
