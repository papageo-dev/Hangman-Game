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

	//Print an exit message
	public void printExitMessage() {
		System.out.println("***Goodbye!***");
	}

}
