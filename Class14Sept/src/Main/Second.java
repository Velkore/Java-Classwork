package Main;

public class Second {
	public static void main(String[] args)
	{
		double hours = 25;
		double yourHoursWorked = 37.5;
		
		// call another method
		
		//calculateGross();
		calculateGross(10);
		calculateGross(hours);
		calculateGross(yourHoursWorked);
		
		//
		calculateGross(10, 2.5);
		
		//
		double s = 20;
		System.out.println(s);
	}
	
	public static void calculateGross(double hours)
	{
		
		// local variable declaration
		final double STD_RATE=13.75;
		double gross;
		
		//calculation - implementation - processing
		gross = hours*STD_RATE;
		
		// displaying output
		System.out.println(hours + " hours at $" + STD_RATE + " per hour is $" + gross);
	}
	
	public static void calculateGross(double hours, double rate)
	{
		double gross;
		gross = hours * rate;
		
		System.out.println(hours + " hours at $" + rate + " per hour is $" + gross);
	}
}
