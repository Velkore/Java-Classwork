package assignments;

public class Billing {

	public double computeBill(double price) {
		double totalDue = price + (0.08 * price);
		return totalDue;
	}
	
	public double computeBill(double price, int quantity) {
		double totalDue = (price * quantity) + ((price * quantity) * 0.08);
		return totalDue;
	}
	
	public double computeBill(double price, int quantity, double coupon) {
		double subtotal = price * quantity;
        subtotal -= coupon;
        double totalDue = subtotal + (subtotal * 0.08);
        return totalDue;
	}
	
	public static void main(String[] args) {
		Billing billing = new Billing();

        double total1 = billing.computeBill(20.0); // Price only
        double total2 = billing.computeBill(20.0, 3); // Price and quantity
        double total3 = billing.computeBill(20.0, 2, 5.0); // Price, quantity, and coupon value

        System.out.println("Total : $" + total1);
        System.out.println("Total for 3 copies : $" + total2);
        System.out.println("Total for 2 copies with $5 coupon : $" + total3);
	}
}
