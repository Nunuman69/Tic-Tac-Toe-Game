package Super_Tic_Tac_Toe;
import java.util.Scanner;
import java.util.Random;
public class Tic_Tac {	
	public static void main(String[] args) {
		
		//Making a scanner object
		Scanner sc = new Scanner(System.in);
		
		//Initializing the board
		char [][] gameboard = new char[3][3];
		
		// Initializing the board with '0'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameboard[i][j] = '0';
            }
        }
       
        System.out.println("Press enter to start the game");
        String start = sc.nextLine();
        
        Class.display(gameboard);

        boolean player1Turn = true; // Player 1 starts
        String input;

        do {
            char playerSymbol = player1Turn ? 'X' : 'O';
            System.out.print("\nPlayer " + (player1Turn ? "1 (X)" : "2 (O)") + ", enter your turn: ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("close")) {
                break;
            }
            
            if (Class.errorhandler(input, gameboard) == true) {
            	  Class.errorhandler(input, gameboard);
                  Class.place(input, gameboard, playerSymbol);
                  Class.WinChecker(gameboard);
                  Class.display(gameboard);
                  player1Turn = !player1Turn; // Toggle player turn
            }
          
        } while (!input.equalsIgnoreCase("close") && !Class.WinChecker(gameboard));// Checks if game should be ended

        System.out.println("Game ended");
    }
	}
