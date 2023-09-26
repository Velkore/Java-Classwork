package Assignments;

// This application displays some math facts
public class DebugThree2 {
	public static void main(String args[])
	{
		int a = 2, b = 5, c = 10;
	    add(a, b);
	    add(b, c);
	    subtract(c, a);            
	}
	public static int add(int a, int b)
	{
		int sum = a + b;
	    System.out.println("The sum of " + a +
	       " and " + b + " is " + sum);
	    return sum;
	}
	public static int subtract(int a, int b)
	{
		int diff = a - b;
	    System.out.println("The difference between " +
	       a + " and " + b + " is " + diff);
	    return diff;
	}
}
