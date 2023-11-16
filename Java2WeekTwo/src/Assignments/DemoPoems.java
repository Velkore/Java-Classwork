package Assignments;
import java.util.Scanner;

public class DemoPoems {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		int choice;
		String type;
		
		// Instantiate objects for new poems, passing in poem titles to the constructor.
		
		Couplet couplet = new Couplet("Fish Wheel");
		Limerick limerick = new Limerick("Old Lass");
		Haiku haiku = new Haiku("Lion Noodles");
		
		// Take user input for what kind of poem they want to read
		
		System.out.println("Enter 1 to see a couplet, 2 to see a limerick, or 3 to see a haiku. Enter any other integer to cancel.");
		choice = n.nextInt();
		
		// Depending on users choice, display the appropriate object or terminate program
		
		if (choice < 1 || choice > 3) {
			System.out.println("Goodbye");
		} else if (choice == 1) {
			type = "couplet";
			couplet.displayTitle(couplet.getName(), type);
			couplet.displayCouplet();
		} else if (choice == 2) {
			type = "limerick";
			limerick.displayTitle(limerick.getName(), type);
			limerick.displayLimerick();
		} else {
			type = "haiku";
			haiku.displayTitle(haiku.getName(), type);
			haiku.displayHaiku();
		}
	}

}
