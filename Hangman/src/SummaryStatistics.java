
public class SummaryStatistics {
	
	private int sumGames; //Total number of played games
	private int sumWins; //Total number of wins
	private int sumLoses; //Total number of loses
	
	public SummaryStatistics() {
		sumGames=0; //Initialize summary of games at 0
		sumWins=0; //Initialize summary of wins at 0
		sumLoses=0; //Initialize summary of loses at 0
	}
	
	//Calculate and return the summary number of played games
	public int calcSumGames() {
		return sumGames+=1;
	}
	
	//Return the summary number of played games 
	public int getSumGames() {
		return sumGames;
	}
	
	//Calculate and return the summary number of wins
	public int calcSumWins() {
		return sumWins+=1;
	}
	
	//Return the summary number of wins
	public int getSumWins() {
		return sumWins;
	}
	
	//Calculate and return the summary number of loses
	public int calcSumLoses() {
		return sumLoses+=1;
	}
		
	//Return the summary number of loses
	public int getSumLoses() {
		return sumLoses;
	}
	
	//Print summary Statistics for all played games
	public void printSumStats() {
		System.out.println("You have played so far " + getSumGames() + " games. " 
	                     + "You won " + getSumWins() + " times and lost " + getSumLoses() + " times. \n");
	}

}
