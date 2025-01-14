package Super_Tic_Tac_Toe;
import java.util.Scanner;
import java.util.Random;
public class Test {
	    public static void main(String[] args) {
	        int[][] array = new int[3][3];
	        int number = 1; // Start filling the array from this number

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                array[i][j] = number++;
	            }
	        }

	        // Optionally print the array to verify it's correctly initialized
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.printf("%4d ", array[i][j]);
	            }
	            System.out.println();
	        }
	    }

}