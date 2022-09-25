import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;

// A Dictionary with more than 1000000 words
public class Dictionary {
	
	public String getWord() {
		
		// Initialize the returned String variable
		String secretWord = " ";
		
		// Connect to API and use "GET" method
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://random-words-api.vercel.app/word"))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response;
		
		// Parse and handle API's JSON response and return the secret word as String
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			JSONArray jsonArray = new JSONArray(response.body());
	        for (int i =0; i<jsonArray.length(); i++) {
	            if (jsonArray.get(i) instanceof JSONObject) {
	                JSONObject jsonObj = (JSONObject)jsonArray.get(i);
	                String word = (String)jsonObj.get("word");
	                secretWord = word.toUpperCase();
	            }
	        }
	        // If can't connect or exception, return a random secret word from a local dictionary with 100 words
		} catch (IOException | InterruptedException e) {

			//e.printStackTrace();
			
    		//Generating a random integer number(0-100)
    		Random randomN = new Random();
    		int n = randomN.nextInt(100)+1;
    		//Get a random word from the offline dictionary
			secretWord = getWordOffline(n);
		}
		return secretWord.toUpperCase();
		
	}
	
	//"getWord" method returns a word, by "index" number(0-100)
	public String getWordOffline(int index) {
		switch (index) {
		        case 0: return "UNIVERSITY";
		        case 1: return "COMPUTER";
	         	case 2: return "LAPTOP";
		        case 3: return "HEADPHONES";
	        	case 4: return "FUZZY";
		        case 5: return "DOG";
		        case 6: return "KEYHOLE";
		        case 7: return "TELEPHONE";
	        	case 8: return "PRINTER";
	        	case 9: return "BUILDING";
	        	case 10: return "APPLE";
	        	case 11: return "ANIMAL";
	        	case 12: return "BOY";
	        	case 13: return "ART";
	        	case 14: return "CAT";
	        	case 15: return "ELEPHANT";
	        	case 16: return "EGG";
	        	case 17: return "EARTHQUAKE";
	        	case 18: return "TELEVISION";
	        	case 19: return "BASKETBALL";
	        	case 20: return "FOOTBALL";
	        	case 21: return "BIKE";
	        	case 22: return "VECHICLE";
	        	case 23: return "DUCK";
	        	case 24: return "HOUSE";
	        	case 25: return "TABLE";
	        	case 26: return "CHAIR";
	        	case 27: return "ARMCHAIR";
	        	case 28: return "SOFA";
	        	case 29: return "WINDOW";
	        	case 30: return "PILLOW";
	        	case 31: return "AIRPLANE";
	        	case 32: return "HELICOPTER";
	        	case 33: return "PILOT";
	        	case 34: return "CAR";
	        	case 35: return "TRUCK";
	        	case 36: return "ROAD";
	        	case 37: return "BRIDGE";
	        	case 38: return "FRIDGE";
	        	case 39: return "BATHROOM";
	        	case 40: return "BEDROOM";
	        	case 41: return "KITCHEN";
	        	case 42: return "DOOR";
	        	case 43: return "ELEVATOR";
	        	case 44: return "BALCONY";
	        	case 45: return "BALL";
	        	case 46: return "CAKE";
	        	case 47: return "BIRTHDAY";
	        	case 48: return "MORNING";
	        	case 49: return "EVENING";
	        	case 50: return "HANGMAN";
	        	case 51: return "NIGHT";
	        	case 52: return "MOON";
	        	case 53: return "LOVE";
	        	case 54: return "KISS";
	        	case 55: return "PROGRAMMING";
	        	case 56: return "CODE";
	        	case 57: return "SAFETY";
	        	case 58: return "VIRUS";
	        	case 59: return "HARDWARE";
	        	case 60: return "SOFTWARE";
	        	case 61: return "NOON";
	        	case 62: return "HOSPITAL";
	        	case 63: return "BANK";
	        	case 64: return "COFFEE";
	        	case 65: return "FOOD";
	        	case 66: return "DRINK";
	        	case 67: return "MAN";
	        	case 68: return "WOMAN";
	        	case 69: return "CHILD";
	        	case 70: return "RADIO";
	        	case 71: return "HEADPHONES";
	        	case 72: return "MACHINE";
	        	case 73: return "GUN";
	        	case 74: return "HUMAN";
	        	case 75: return "RELATIONSHIP";
	        	case 76: return "PARTY";
	        	case 77: return "CHRISTMAS";
	        	case 78: return "HALLOWEEN";
	        	case 79: return "EASTER";
	        	case 80: return "SUMMER";
	        	case 81: return "WINTER";
	        	case 82: return "AUTUMN";
	        	case 83: return "SPRING";
	        	case 84: return "JANUARY";
	        	case 85: return "FEBRUARY";
	        	case 86: return "MARCH";
	        	case 87: return "APRIL";
	        	case 88: return "MAY";
	        	case 89: return "JUNE";
	        	case 90: return "JULY";
	        	case 91: return "AUGUST";
	        	case 92: return "SEPTEMBER";
	        	case 93: return "OCTOBER";
	        	case 94: return "NOVEMBER";
	        	case 95: return "DECEMBER";
	        	case 96: return "HOLYDAYS";
	        	case 97: return "SCHOOL";
	        	case 98: return "WHISKEY";
	        	case 99: return "VODKA";
	        	case 100: return "BEER";
         		default: return "Illegal index";
		}
	};
}
