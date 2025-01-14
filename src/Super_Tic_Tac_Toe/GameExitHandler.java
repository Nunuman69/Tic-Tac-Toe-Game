package Super_Tic_Tac_Toe;

import java.util.Scanner;

public class GameExitHandler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("\nPlease enter column to put your nunu : ");
        String x = sc.nextLine();
        while (!x.equals("close") ){
        	System.out.println("\nContinuing game");
        	System.out.print("\nPlease enter column to put your nunu : ");
        	x = sc.nextLine();
        }
        System.out.println("Game ended");
    }

}
