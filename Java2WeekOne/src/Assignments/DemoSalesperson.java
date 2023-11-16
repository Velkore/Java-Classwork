package Assignments;

public class DemoSalesperson {
    public static void main(String[] args) {
        // Create an array of 10 Salesperson objects
        Salesperson[] salesPeople = new Salesperson[10];

        // Initialize each Salesperson object with ID 9999 and sales value 0
        for (int i = 0; i < 10; i++) {
            salesPeople[i] = new Salesperson(9999, 0.0);
        }

        // Display the 10 Salesperson objects
        for (int i = 0; i < 10; i++) {
        	int id = salesPeople[i].getId();
        	double annualSales = salesPeople[i].getAnnualSales();
            System.out.println("Salesperson - ID: " + id + ", Annual Sales: $" + annualSales);
        }
    }
}
