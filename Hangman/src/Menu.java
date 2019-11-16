import java.util.Scanner;

public class Menu {
	
	//Printing the Main Menu, ask user's choice and return it
	public String menu(Scanner in) {
		
		String choice; //User's choice
		
		System.out.println("MAIN MENU");
		System.out.println(" - Start a new Game (N)\r\n" + 
				           " - Statistics (S)\r\n" + 
				           " - Exit (E)\r\n");
		System.out.println("Please enter your choice: ");
		
		choice = in.nextLine();
		return choice;
	}
	
	//Print a wrong message and information
	public void IllegalIndex() {
		System.out.println("Illegal Index! "
		           +"You should enter: 'N' for New Game, " 
                   +"'S' for Game's Statistics "
	               + "or 'E' to Exit Game. "
	               + "Please, try again!\n");
	}

}
