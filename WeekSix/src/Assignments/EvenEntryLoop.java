package Assignments;
import java.util.Scanner;

// USER INPUT = EVEN NUMBER OR SENTINEL (999) VALUE
// DISPLAY "GOOD JOB!" AND ASK FOR ANOTHER INPUT WHEN USER ENTERS EVEN NUM
// DISPLAY ERROR WHEN USER ENTERS ODD NUM AND ASK FOR ANOTHER INPUT
// TERMINATE PROGRAM WHEN USER ENTERS SENTINEL VALUE

public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
        
        int userInput;
        final int SENTINEL = 999;
        
        System.out.println("Enter an even number or 999 to stop.");
        
        do {
            System.out.print("Enter a number: ");
            userInput = n.nextInt();
            
            if (userInput == SENTINEL) {
                System.out.println("Program terminated.");
            } else if (userInput % 2 == 0) {
                System.out.println("Good job!");
            } else {
                System.out.println("Error: Please enter an even number.");
            }
        } while (userInput != SENTINEL);
        
        n.close();
	}

}
