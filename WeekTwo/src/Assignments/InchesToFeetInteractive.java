package Assignments;
import java.util.Scanner;
// Write an interactive version of the InchesToFeet class that accepts the inches value from a user.
// Save the class as InchesToFeetInteractive.java.
public class InchesToFeetInteractive {
	public static void main(String[] args)
	{
		int inches;
		Scanner n = new Scanner(System.in);
		System.out.print("How many inches are there? ");
		inches = n.nextInt();
		
		final int feet = inches / 12;
		System.out.println("The result is " + inches + " inches and " + feet + " feet");
	}
}
