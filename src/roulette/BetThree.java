package roulette;

import util.ConsoleReader;

public class BetThree extends Bet {

	public BetThree(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub


	}

	public void placeBet(){

		chosenBet = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
				1, Wheel.NUM_SPOTS - 3);

	}

	protected boolean betIsMade(Wheel myWheel){
		int start = Integer.parseInt(chosenBet);
		return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}


}
