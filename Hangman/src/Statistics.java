
public class Statistics {
	
	private int guesses; //Total number of guesses
	private int correctGuesses; //Total number of correct guesses
	private int wrongGuesses; //Total number of wrong guesses
	
	public Statistics() {
		guesses=8; //Initialize total guesses at 8
		correctGuesses=0; //Initialize correct guesses at 0
		wrongGuesses=0; //Initialize wrong guesses at 0
	}
	
	//Return player's guesses
	public int getGuesses() {
		return guesses;
	}
	
	//Minus and return the number of player's guesses
	public int minusGuesses() {
		return guesses-=1;
	}
	
	//Return player's correct guesses
	public int getCorrectGuesses() {
		return correctGuesses;
	}
	
	//Calculate and return the number of player's correct guesses
	public int calcCorrectGuesses() {
		return correctGuesses+=1;
	}
	
	//Return player's wrong guesses
	public int getWrongGuesses() {
		return wrongGuesses;
	}
	
	//Calculate and return the number of player's wrong guesses
	public int calcWrongGuesses() {
		return wrongGuesses+=1;
	}
	
	//Print game's statistics
	public void printGameStats() {
		System.out.println("You made " + getCorrectGuesses() + " correct guesses and "
	                       + getWrongGuesses() + " wrong guesses.\n");
	}
	
}
