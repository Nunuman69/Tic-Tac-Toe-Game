package Super_Tic_Tac_Toe;

import java.util.Scanner;

public class TurnLocator {
	public static void main(String[] args) {
		// Initializing Scanner Object
		Scanner scanner = new Scanner(System.in);
		
	    //Initializing the turns
	    String[][] AvailableTurns = {
	        {"LTC", "MT", "RTC"},
	        {"ML", "M", "MR"},
	        {"LBC", "MB", "RBC"}
	    };
	    
        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
    
        // Searching for the string in the 2D array
        boolean found = false;
        for (int row = 0; row < AvailableTurns.length; row++) {
            for (int col = 0; col < AvailableTurns[row].length; col++) {
                if (AvailableTurns[row][col].equals(input)) {
                    System.out.println("Found at index: [" + row + "][" + col + "]");
                    found = true;
                    break; // Exit the loop once found
                }
            }
            if (found) {
                break; // Exit the outer loop if the string is found
            }
        }

        if (!found) {
            System.out.println("String not found in the array.");
        }  
	    
	}
}
