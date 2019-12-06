import java.util.Scanner;

public class Menu {
	
	//Printing the Main Menu, ask user's choice and return it
	public String menu(Scanner in) {
		
		String choice; //User's choice
		
		System.out.println("\n***********************************");
		System.out.println("             MAIN MENU             ");
		System.out.println("***********************************");
		System.out.println(" - Start a new Game (N)\r\n" + 
				           " - Statistics (S)\r\n" + 
				           " - Exit (E)");
		System.out.println("***********************************\n");
		System.out.println("Please enter your choice: ");
		
		choice = in.nextLine();
		return choice;
	}
	
	//Print a greeting message
	public void printGreetingMassage() {
		System.out.println("\n***********************************");
		System.out.println(" *** H A N G M A N - The Game! ***");
		System.out.println("***********************************\n");
	}
	
	//Print a wrong message and information
	public void IllegalIndex() {
		System.out.println("***Illegal Index! "
		           +"You should enter: 'N' for New Game, " 
                   +"'S' for Game's Statistics "
	               + "or 'E' to Exit Game. "
	               + "Please, try again!***\n");
	}

	//Print a start game message
	public void printStartGameMessage() {
		System.out.println("\n***Let's Play!***\n");	
	}
	
	//Check if player wants to exit game, print messages and call current functions
	public void askForExit(Scanner in) {
		
		char answer; //Player's answer
		
		do {
			System.out.println("Exit game?(Y/N)"); //Ask player
			answer=in.next().toUpperCase().charAt(0); //Get player's answer
			
			//Check player's answer
			if (answer=='Y') { //If player wants to exit
				printExitMessage(); //Print exit message
		   	    in.close(); //Close scanner(in)
		   	    System.exit(1); //Close game
			}
			else if (answer=='N'){ //If player don't wants to exit
				in.nextLine();
			}
			else { //If player any other character/number/symbol
				printWrongAnswerMessage();
			}
		} while(answer!='Y' && answer!='N');
	}

	//Print an exit message
	private void printExitMessage() {
		System.out.println("***Goodbye! See you soon!***");
	}
	
	//Print a wrong answer message
	private void printWrongAnswerMessage() {
		System.out.println("***Please, enter 'Y' if you want to exit game of 'N' if you want to play more.***\n");
	}

}
