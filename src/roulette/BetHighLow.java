package roulette;

import util.ConsoleReader;

public class BetHighLow extends Bet{

	public BetHighLow(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
		
		
	}
	
	 public void placeBet(){
		 
		 chosenBet = ConsoleReader.promptOneOf("Please bet","High", "Low");
	    	
	    }
	 
	@Override
	 protected boolean betIsMade(Wheel myWheel){
		return (myWheel.getNumber() <=18 && chosenBet.equals("Low")) ||
				(myWheel.getNumber() > 19 && chosenBet.equals("High"));
		 
		 
	 }
}
