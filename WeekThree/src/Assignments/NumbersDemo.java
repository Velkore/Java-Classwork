package Assignments;

public class NumbersDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a = 5;
		int b = 23;
		displayTwiceTheNumber(a, b);
		displayNumberPlusFive(a, b);
	}
	public static void displayTwiceTheNumber(int a, int b)
	{
		int aTimesTwo = a * 2;
		int bTimesTwo = b * 2;
		System.out.println("The product of " + a + " times two is " + aTimesTwo + " and the product of " + b + " times two is " + bTimesTwo);
	}
	public static void displayNumberPlusFive(int a, int b)
	{
		int aPlusFive = a + 5;
		int bPlusFive = b + 5;
		System.out.println("The sum of " + a + " plus five equals " + aPlusFive + ", and the sum of " + b + " plus five equals " + bPlusFive);
	}
	

}
