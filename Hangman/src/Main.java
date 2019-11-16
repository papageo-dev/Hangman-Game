import java.util.Random;
import java.util.Scanner;

public class Main {

	//Main method
	public static void main(String[] args) {
		
		//Create a new Scanner object
		Scanner in = new Scanner(System.in);
		//Create a new SummaryStatistics object
		SummaryStatistics sumStats = new SummaryStatistics();
		//User's Main Menu choice(N/S/E)
		String userChoice;
		
		do {
			//Show the Main Menu and wait for user's choice
			Menu mainMenu = new Menu();
			userChoice = mainMenu.menu(in);
			
		    switch(userChoice.toUpperCase()) { //System doesn't matter if typed an uppercase or a lowercase letter
		        //Start a new game, with a random word to guess
		        case "N":
		        	//Create a new Dictionary object
		    		Dictionary words = new Dictionary();
		    		
		    		//Generating a random integer number(0-100)
		    		Random randomN = new Random();
		    		int n = randomN.nextInt(100)+1;
		    		
		        	//Get a random word from class "Dictionary", with method "getWord"
		    		String randomWord = words.getWord(n);
		    		
	    			//Create a new Game object
		    		Game nGame = new Game(randomWord);

		    		//Create a new Statistics object
		    		Statistics gameStats = new Statistics();
		    		
		    		//Start a new game, print a greeting message
		    		System.out.println("Let's Play!\n");
		    		
		    		//Print '-', equals random word's length
		    		nGame.printWordPavlas();
		    		
		    		boolean notGuessed = true;
		    		boolean hasGuesses = true;
		    		//While player has not guessed the word & has got guesses
		    		while (notGuessed && hasGuesses) {
		    			
		    			//Print the number of guesses left, at the start
			    		System.out.println("You have " + gameStats.getGuesses() + " guesses left.");
		    			//Ask player for letters
			    		String inputLetter = nGame.askForLetter(in);
		    			//Check if random word contains the current input letter and update game statistics
		    		    nGame.checkInputLetter(inputLetter, gameStats);
		    			//Print word's progress
		    		    nGame.printWordProgress();
		    		    //Check if player has more guesses
		    		    if (!nGame.hasGuesses(gameStats)) {
		    		    	//Add one more game
		    		    	sumStats.calcSumGames();
		    		    	//Add one more lose
		    		    	sumStats.calcSumLoses();
		    		    	hasGuesses=false;
		    		    }
		    		    //Check if player found the word
		    		    if (nGame.wordFound(randomWord)) {
		    		    	//Print a congratulation message, the full word, and the game statistics
		    		    	nGame.printFullWordAndStats(randomWord, gameStats);
		    		    	//Add one more game
		    		    	sumStats.calcSumGames();
		    		    	//Add one more win
		    		    	sumStats.calcSumWins();
		    		    	notGuessed=false;
		    		    }
		    		}
     		    break;
     		    
     		    //Print summary statistics of all games(Games played, Wins, Loses)
	    	    case "S":
	    	    	sumStats.printSumStats();
    		    break;
    		    
    		    //Exit game
    	       	case "E":
    	       	    System.out.println("Goodbye!"); //Exit message
    	       	    in.close(); //Close scanner(in)
    	       	    System.exit(1); //Close game
    	       	break;
    	       	
    	       	//When userChoice!=N/S/E
    	        default:
    	        	//Print a wrong message and information
    	            mainMenu.IllegalIndex(); 
	       	    break;
	    	 }
   		}while (userChoice!="E");
	}
}
