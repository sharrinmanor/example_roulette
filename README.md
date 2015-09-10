Refactoring by: Michael Daou and Sharrin Manor

##### What code would be needed to be added to the game in order to allow the user to make another type of bet?

After refactoring, new bet types could be introduced into the game as new classes extending the Bet superclass, and implementing their ```placeBet()``` and ```betIsMade()``` methods. In addition, the new Bet type must be added to the array in Game holding the different types of types. 

##### In what ways is the refactored code simpler?

The refactored code is simpler because it's clearer to see what the different types of bets are; instead of having an if-statements that redirect the input to the appropriate code, the input is fed directly into the method defined within a specific Bet subclass.

This also means that there is less code in the Game class making it more readable and modifiable. 

##### In what ways is the refactored code more complex?

There are more classes in the refactored code and each subclass of Bet has its own behavior. 

##### What trade-offs did we make when refactoring our old code?
We traded customizability for the compactness associated with keeping all code within one class and even one method having several if-statements.

##### Which code do we prefer, and why?
We prefer the refactored code because it's designed more intuitively and allows for more customizability especially with adding more Bet subclasses.

#####What methods would make sense as behaviors of a Bet hierarchy (i.e., make bets open to extension)? 

A Bet superclass and a subclass for each Bet type (red/black, high/low, odd/even) where each subclass uses the same methods of the superclass but implements them differently. 

#####What methods would help improve the code in the Game's methods (i.e., close it to modification)?

Making things private and having getter and setter methods would close the Game class to modification. We've also removed methods from Game and moved them to the Bet subclasses. If we had more time, we would have found a way to make the Bet array list a separate entity and not require its modification within Game to add new Bet types.

#####What methods can be completely implemented in the Bet super-class (i.e., are common across the hierarchy), and which completely in the Bet sub-classes (i.e., vary across the hierarchy)?

The methods that can be completely implemented in the Bet superclass are the description, the odds and the constructor. 

The methods that vary are the ones that determine if the user's bet was a winning bet.

#####How should the Game class create the correct Bet subclass?
We are creating our own subclasses, but the Game class instantiates them at the beginning and puts them in an array. Given more time, we would have created a method within Bet that creates new subclasses, and gotten rid of the array that must be manually changed, and make the new method modify that array to include new bet choices. 