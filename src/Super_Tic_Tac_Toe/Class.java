package Super_Tic_Tac_Toe;
public class Class {
	//Methods for the class
	
		//Placing the turns in array.Checks for invalid input.
		static char [][] place(String input,char[][]array, char player) {
		
	       int[] indices = Class.TurnLocator(input);
	       
	       if (Class.errorhandler(input, array) == true) {
		        //Placing turn in board
		       array[indices[0]][indices[1]] = player;
		       return array;
	       }
	       //If false, then return array without placing the input
		   return array;
		       
	   }
		
	    //Locate index position from input.Checks array and locates position
	    static int [] TurnLocator(String position) {
	    	//Initializing the turns
	        String[][] AvailableTurns = {
	            {"LTC", "MT", "RTC"},
	            {"ML", "M", "MR"},
	            {"LBC", "MB", "RBC"}
	        };

	        // Searching for the string in the 2D array
	        for (int row = 0; row < AvailableTurns.length; row++) {
	            for (int col = 0; col < AvailableTurns[row].length; col++) {
	                if (AvailableTurns[row][col].equals(position)) {
	                	return new int[]{row, col}; // Return row and column indices as an array
	                }
	            }
	        }

	     // If not found, return an invalid index
	        return new int[]{-1, -1};
	    }
	    
	    //Display the current Game board
		static void display (char[][] array)
		{
			System.out.println("\nThe Current gameboard is: ");
			// Printing the board
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
		}
		//Checks which player won
		static boolean WinChecker(char [][] array) {
			boolean X = true;
			boolean O = true;
			
			//Checking for 'X'
			//Check for vertical wins
			if (array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X') {
			    System.out.println("\nPlayer 1 wins!!");
			    return X;
			} else if (array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X') {
			    System.out.println("\nPlayer 1 wins!!");
			    return X;
			} else if (array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X') {
			    System.out.println("\nPlayer 1 wins!!");
			    return X;
			}

			// Check for horizontal wins
			else if (array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X') {
			    System.out.println("\nPlayer 1 wins!!");
			    return X;
			} else if (array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X') {
			    System.out.println("\nPlayer 1 wins!!");
			    return X;
			} else if (array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X') {
			    System.out.println("\nPlayer 1 wins!!");
			    return X;
			}

			// Check for cross wins
			else if (array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X') {
			    System.out.println("\nPlayer 1 wins!!");
			    return X;
			} else if (array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X') {
			    System.out.println("\nPlayer 1 wins!!");
			    return X;
			}
		    
		    //Checking for 'O'
			//Check for vertical wins
			else if (array[0][0] == 'O' && array[1][0] == 'O' && array[2][0] == 'O') {
			    System.out.println("\nPlayer 2 wins!!");
			    return O;
			} else if (array[0][1] == 'O' && array[1][1] == 'O' && array[2][1] == 'O') {
			    System.out.println("\nPlayer 2 wins!!");
			    return O;
			} else if (array[0][2] == 'O' && array[1][2] == 'O' && array[2][2] == 'O') {
			    System.out.println("\nPlayer 2 wins!!");
			    return O;
			}

			// Check for horizontal wins
			else if (array[0][0] == 'O' && array[0][1] == 'O' && array[0][2] == 'O') {
			    System.out.println("\nPlayer 2 wins!!");
			    return O;
			} else if (array[1][0] == 'O' && array[1][1] == 'O' && array[1][2] == 'O') {
			    System.out.println("\nPlayer 2 wins!!");
			    return O;
			} else if (array[2][0] == 'O' && array[2][1] == 'O' && array[2][2] == 'O') {
			    System.out.println("\nPlayer 2 wins!!");
			    return O;
			}

			// Check for cross wins
			else if (array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O') {
			    System.out.println("\nPlayer 2 wins!!");
			    return O;
			} else if (array[0][2] == 'O' && array[1][1] == 'O' && array[2][0] == 'O') {
			    System.out.println("\nPlayer 2 wins!!");
			    return O;
			}

			// No wins
			else {
			    System.out.println("\nNo winner yet");
			    return !X && !O;
			}
		}
			
		static boolean errorhandler(String input,char[][]array) {
			
		       int[] indices = Class.TurnLocator(input);
		       
			    // Check for invalid indices
			       if (indices[0] == -1 || indices[1] == -1) {
			           System.out.println("\nInvalid move: " + input);
			           return false;
			       }
			       // Comment for understanding the return statement
			        //System.out.println("String found at index: [" + indices[0] + "][" + indices[1] + "]");
			       if (array[indices[0]][indices[1]] == 'X' || array[indices[0]][indices[1]] == 'O' ) {
			    	   System.out.println("\nInvalid move.Spot taken");
			    	   return false; 
			       }
			     //If no errors are found
				return true;
		}
			
}