package diceJack;


public class DiceJackMain {

	public static void main(String[] args) {
				
		Integer result = 0;
		Integer choice1;
		Integer total =0;
		Integer points;
		Integer current = 0;
		//CurrentScores score = new CurrentScores();
		DiceRoll choice = new DiceRoll();
		boolean taco;
		taco = true;
		

		
		while(taco = true){
			
			points = choice.funn(result);
			total += points;
			
			System.out.println("You've rolled a: " + points + " Your total: " + total);  //1st

		}
	}

}