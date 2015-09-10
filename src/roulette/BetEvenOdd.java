package roulette;

import util.ConsoleReader;

public class BetEvenOdd extends Bet{

	public BetEvenOdd(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub



	}

	public void placeBet(){

		chosenBet = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		
	}

	protected boolean betIsMade(Wheel myWheel){

		return (myWheel.getNumber() % 2 == 0 && chosenBet.equals("even")) ||
				(myWheel.getNumber() % 2 == 1 && chosenBet.equals("odd"));

	}


}
