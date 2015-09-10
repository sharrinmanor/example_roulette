package roulette;

import util.ConsoleReader;


/**
 * Plays a game of roulette.
 * 
 * @author Robert C. Duvall
 */
public class Game {
	// name of the game
	private static final String DEFAULT_NAME = "Roulette";
	// bets player can make
	private Bet[] myPossibleBets = { 
			new BetRedBlack("Red or Black", 1),
			new BetEvenOdd("Odd or Even", 1),
			new BetThree("Three in a Row", 11),
			new BetHighLow("High/Low", 1)
	};
	private Wheel myWheel;
	private Bet myBetType;

	/**
	 * Construct the game.
	 */
	public Game () {
		myWheel = new Wheel();
	}

	/**
	 * @return name of the game
	 */
	public String getName () {
		return DEFAULT_NAME;
	}

	/**
	 * Play a round of roulette.
	 *
	 * Prompt player to make a bet, then spin the roulette wheel, and then verify 
	 * that the bet is won or lost.
	 *
	 * @param player one that wants to play a round of the game
	 */
	public void play (Gambler player) {
		int amount = ConsoleReader.promptRange("How much do you want to bet",
				0, player.getBankroll());
		int whichBet = promptForBet();

		myBetType = myPossibleBets[whichBet];
		myBetType.placeBet();
		System.out.println();

		System.out.print("Spinning ...");
		myWheel.spin();
		System.out.println(String.format("Dropped into %s %d", myWheel.getColor(), myWheel.getNumber()));

		if (myBetType.betIsMade(myWheel)) {
			System.out.println("*** Congratulations :) You win ***");
			amount *= myBetType.getOdds();
		}
		else {
			System.out.println("*** Sorry :( You lose ***");
			amount *= -1;
		}
		player.updateBankroll(amount);
	}

	/**
	 * Prompt the user to make a bet from a menu of choices.
	 */
	private int promptForBet () {
		System.out.println("You can make one of the following types of bets:");
		for (int k = 0; k < myPossibleBets.length; k++) {
			System.out.println(String.format("%d) %s", (k + 1), myPossibleBets[k].getDescription()));
		}
		return ConsoleReader.promptRange("Please make a choice", 1, myPossibleBets.length) - 1;
	}




}
