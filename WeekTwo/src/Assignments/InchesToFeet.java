package Assignments;

// Write a class that declares a variable named inches, which holds a length in inches,
// and assign a value. Display the value in feet and inches; for example, 86 inches becomes 7 feet and 2 inches. Be sure to use a named constant where appropriate.
// Save the class as InchesToFeet.java.
public class InchesToFeet {
	public static void main(String[] args)
	{
		int inches = 86;
		final int feet = inches / 12;
		System.out.println("The result is " + inches + " inches and " + feet + " feet");
	}
}
