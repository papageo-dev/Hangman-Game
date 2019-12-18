import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	private char randomWordChar[]; //Char array, with the random word
	private char wordToGuess[]; //Char array, with the word that should be guessed by player
	private int wordToGuessLength; //Random word's length
	private ArrayList<String> enteredLetters; //ArrayList with all player's entered letters
	private ArrayList<String> guessedLetters; //ArrayList with all player's guessed letters
	
	public Game(String randomWord) {
		
		randomWordChar = randomWord.toCharArray(); //Create an array, equals random word's length
		wordToGuess = randomWord.toCharArray(); //Create an array, equals random word's length
		wordToGuessLength = randomWord.length(); //Initialize random word's length
		enteredLetters = new ArrayList<String>(); //Create an ArrayList with all player's entered letters
		guessedLetters = new ArrayList<String>(); //Create an ArrayList with all player's guessed letters
	}
	
	//Print '-', equals word's to guess length
	public void printWordPavlas() {
		
		System.out.print("The random word is now: ");
		
		for (int i=0; i<wordToGuessLength; i++) {
			wordToGuess[i]='-'; //Add "-" to all positions of word's char array
			System.out.print("-");
		}
		System.out.println("\n");
	}
	
	//Ask player for letters
	public String askForLetter(Scanner in) {
		
		String userInput; //Player's input
		
		do {
	    	//Ask player for letter
	    	System.out.println("Please, enter a letter: ");
    		/*
    		 * Use toUpperCase() to convert letters to uppercase, because words are stored in uppercase.
    		 * Now, system doesn't matter if typed an uppercase or a lowercase letter
    		 */
	    	userInput = in.nextLine().toUpperCase();
		}while(!isValidInput(userInput));
		
		//Add input letter to the arrayList with already entered letters
		enteredLetters.add(userInput);
		
		//Print player's input letter
		System.out.println("Your guess: " + userInput);
		
		return userInput;
	}
	
	//Check if player's input is valid
	private boolean isValidInput(String userInput) {
		
		boolean isValid=false;
		
		//Check if player enters null or empty character
		if (userInput==null || userInput.trim().isEmpty()) {
			System.out.println("You entered null or empty character.");
		}
		//Check if player enters only one character
		else if (userInput.length()!=1) {
			System.out.println("You entered more than one character.");
		}
		/* 
		 * Convert String input to Char, with method:charAt()
		 * and check if it is a letter with method:isLetter()
		 */
		else if (!Character.isLetter(userInput.charAt(0))) {
			System.out.println("This isn't a letter. You entered a number or symbol.");
		}
		//Check if player enters an already guessed letter
		else if (isAlreadyGuessed(userInput)) {
		}
		//Check if player re-enters a letter
		else if (isAlreadyEntered(userInput)) {
		}
		else { 
			isValid=true; //If player's input is valid
		}
		return isValid;
	}
	
	//Check if current input letter is already guessed by player
	public boolean isAlreadyGuessed(String currentInputLetter) {
		
		boolean letterIsGuessed=false;
		
		//Search the current letter in the ArrayList: guessedLetters
		if (guessedLetters.contains(currentInputLetter)){
			System.out.println("You have already guessed this letter: "
		                      + "(" + currentInputLetter +"). " 
					          + "Try another one. ");
			letterIsGuessed=true;
		}
		return letterIsGuessed;
	}
	
	//Check if current input letter is already entered by player
	public boolean isAlreadyEntered(String currentInputLetter) {
			
		boolean letterIsEntered=false;
			
		//Search the current letter in the ArrayList: enteredLetters
		if (enteredLetters.contains(currentInputLetter)){
			System.out.println("You have already entered this letter: "
		                      + "(" + currentInputLetter +"). "
		                      +"Try again, with another letter. ");
			letterIsEntered=true;
		}
		return letterIsEntered;
	}
	
	//Check if word contains the user's input letter
	public void checkInputLetter(String userInput, Statistics gameStats) {
		
		boolean containsThisLetter=false; 
		char currentLetter = userInput.charAt(0); //Convert scanner's data to char
		int letterAppearances=0; //Letter's appearances counter
		
		for (int i=0; i<wordToGuessLength; i++) {
			if (randomWordChar[i]==currentLetter) { //If word contains the input letter
				updateWord(i, currentLetter); //Update the word to guess
				gameStats.calcCorrectGuesses(); //+1 correct guess
				guessedLetters.add(userInput); //Add the input letter to the ArrayList with already guessed letters
				/*Calculate current input letter appearances in the word
				and print a CORRECT message and number of appearances, if they are more than 1.*/
				letterAppearances++; //Add one more appearance for the current input letter
				calcLetterAppearances(letterAppearances, currentLetter);
				containsThisLetter=true;
			}
		}
		if (!containsThisLetter) { //If word NOT contains the input letter
			gameStats.minusGuesses(); //-1 total guess
			gameStats.calcWrongGuesses(); //+1 wrong guess
			System.out.println("There are no " + currentLetter + "'s in the word.");
		}
	}
	
	//Update word's letters
	private void updateWord(int i, char currentLetter) {
		
		wordToGuess[i]=currentLetter; //Add the letter to the word
		
	}
	
	//Print a correct message and number of letter's appearances in the word, if they are more than 1
	private void calcLetterAppearances(int letterAppearances, char currentLetter) {
		
		if (letterAppearances==1) { //If letter has only one appearance in the word
		    System.out.println("The guess is CORRECT! ");
		}
		else if (letterAppearances>1) { //If letter has more than one appearances in the word
			System.out.println("The secret word contains "  + letterAppearances
					           + " " + currentLetter + "'s.");
		}
	}
	
	//Print word's progress
	public void printWordProgress() {
		
		System.out.print("The random word is now: ");
		
		for (int i=0; i<wordToGuessLength; i++) {
			System.out.print(wordToGuess[i]);
		}	
		System.out.println("\n");
	}
	
	//Check if player has more guesses
	public boolean hasGuesses(Statistics gameStats, ConsoleGraphics hangGraphs, String randomWord) {
		
		boolean hasGuesses=true;
		
		if (gameStats.getGuesses()==0) { //If player is out of guesses
			//Print a game over message
	    	System.out.println("***GAME OVER***\nYou are out of guesses... Try again!\n");
	    	//Print hangman's graphic progress
	    	hangGraphs.printHangman(gameStats.getGuesses());
	    	//Print the full word
	    	printFullWord(randomWord);
	    	//Print game's statistics
	    	gameStats.printGameStats();
	    	hasGuesses=false;
	    }
		return hasGuesses;
	}
	
	//Check if player found the word
	public boolean wordFound(String randomWord) {
		
		boolean found=false;
		
		//Convert char array of wordToGuess, to String
		String wordToGuessString = String.copyValueOf(wordToGuess);
		
		//Compare random word with guessed word
		if(randomWord.equalsIgnoreCase(wordToGuessString)) {
			found=true;
		}
		return found;
	}
	
	//Print the full word
	private void printFullWord(String randomWord){
		System.out.println("The secret word was: " + randomWord + "\n");
	}
	
	//Print Congratulation message, the full word and game's statistics
	public void printFullWordAndStats(String randomWord, Statistics gameStats) {
		
		//Print a Congratulations message and the complete word
		System.out.println("***Congratulations!***\nYou guessed the word: " + randomWord + "\n");
		
    	//Print game's statistics
    	gameStats.printGameStats();
	}

}
