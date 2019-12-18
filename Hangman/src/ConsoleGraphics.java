
public class ConsoleGraphics {
	
	//Print the graphic progress of hangman, depending on the player's guesses left
	public void printHangman(int guesses) {
		
		switch(guesses) {
		    case 8:
		    System.out.println("   |   ");
			System.out.println("   |   ");
			System.out.println("   |   ");
			System.out.println("   |   ");
			System.out.println("   |   ");
			System.out.println("   |   ");
			System.out.println("   |   ");
			System.out.println("___|___");
			break;
		
		    case 7:
		    System.out.println("   ____________");
			System.out.println("   |           ");
			System.out.println("   |           ");
			System.out.println("   |           ");
			System.out.println("   |           ");
			System.out.println("   |           ");
			System.out.println("   |           ");
			System.out.println("   |           ");
			System.out.println("___|___        ");
		    break;
		
		    case 6:
		    System.out.println("   ____________ ");
			System.out.println("   |           |");
			System.out.println("   |            ");
			System.out.println("   |            ");
			System.out.println("   |            ");
			System.out.println("   |            ");
			System.out.println("   |            ");
			System.out.println("   |            ");
			System.out.println("___|___         ");
		    break;
		
		    case 5:
		    System.out.println("   ____________    ");
			System.out.println("   |          _|_  ");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |               ");
			System.out.println("   |               ");
			System.out.println("   |               ");
			System.out.println("___|___            ");
		    break;
		
		    case 4:
			System.out.println("   ____________    ");
			System.out.println("   |          _|_  ");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |   ");
			System.out.println("   |           |   ");
			System.out.println("   |               ");
			System.out.println("___|___            ");
		    break;
		
		    case 3:
			System.out.println("   ____________    ");
			System.out.println("   |          _|_  ");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|   ");
			System.out.println("   |         / |   ");
			System.out.println("   |               ");
			System.out.println("___|___            ");
		    break;
		
		    case 2:
			System.out.println("   ____________    ");
			System.out.println("   |          _|_  ");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_  ");
			System.out.println("   |         / | \\");
			System.out.println("   |               ");
			System.out.println("___|___            ");
		    break;
		
	    	case 1:
	    	System.out.println("   ____________    ");
			System.out.println("   |          _|_  ");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_  ");
			System.out.println("   |         / | \\");
			System.out.println("   |          /    ");
			System.out.println("___|___      /     ");
	    	break;
		
	    	case 0:
	    	System.out.println("   ____________    ");
			System.out.println("   |          _|_  ");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_  ");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
	    	break;
		
	    	default:
	    	System.out.println("---ERROR---");
	    	break;
		}
	}

}
