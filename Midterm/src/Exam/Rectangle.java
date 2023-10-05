package Exam;

// Write a class named Rectangle that calculate the area of a rectangle,
// prompt the user to enter the length and width of the rectangle. Display the result;
// The formula ( Area = Width * length)
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		int length;
		int width;
		int area;
		
		System.out.println("Enter length of the rectangle");
		length = n.nextInt();
		
		System.out.println("Enter width of the rectangle");
		width = n.nextInt();
		
		area = length * width;
		System.out.println("The area of this rectangle is " + area + ".");
	}
}