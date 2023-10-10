// This class discounts prices by 10%
package assignments;

public class DebugFour4
{
   public static void main(String[] args)
   {
		final double DISCOUNT_RATE = 0.10;
		int price = 100;
		double price2 = 100.00;
		tenPercentOff(price, DISCOUNT_RATE);
		tenPercentOff(price2, DISCOUNT_RATE);
   }
   
   public static void tenPercentOff(int p, final double DISCOUNT_RATE)
   {
		double newPrice = p - (p * DISCOUNT_RATE);
		System.out.println("Ten percent off : " + (p * DISCOUNT_RATE));
		System.out.println("New price is : " + newPrice);
   }
   
   public static void tenPercentOff(double p, final double DISCOUNT_RATE)
   {
		double newPrice = p - (p * DISCOUNT_RATE);
		System.out.println("Ten percent off : " + (p * DISCOUNT_RATE));
		System.out.println("New price is : " + newPrice);
   }
}
