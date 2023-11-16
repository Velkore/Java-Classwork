package Assignments;

public class Health extends Insurance {
    // Constructor with call to setCost
    public Health() {
        super("Health");
        setCost();
    }

    // setCost method
    public void setCost() {
        cost = 196;
    }

    // Display method
    public void display() {
        System.out.println("Insurance type: " + type + "\nMonthly cost: $" + cost);
    }
}