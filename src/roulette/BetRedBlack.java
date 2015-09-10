package roulette;

import util.ConsoleReader;

public class BetRedBlack extends Bet{

	public BetRedBlack(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
		
		
	}
	
	 public void placeBet(){
		 
		 chosenBet = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	    	
	    }
	 
	@Override
	 protected boolean betIsMade(Wheel myWheel){
		 return myWheel.getColor().equals(chosenBet);
	
		 
		 
	 }
}
