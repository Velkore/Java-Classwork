package Assignments;

import java.util.Scanner;

// Write a program that accepts a number of minutes and converts it both to hours. For example, 6000 minutes equals 100 hours. Save the class as MinutesConversion.java.
public class MinutesConversion {
	public static void main(String[] args)
	{
		int minutes;
		Scanner n = new Scanner(System.in);
		System.out.print("How many minutes are there? ");
		minutes = n.nextInt();
		
		final int hours = minutes / 60;
		System.out.println("The result is " + minutes + " minutes and " + hours + " hours");
	}
}
