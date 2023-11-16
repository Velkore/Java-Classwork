package Assignments;

public class Life extends Insurance {
    // Constructor with call to setCost
    public Life() {
        super("Life");
        setCost();
    }

    // setCost method
    public void setCost() {
        cost = 36;
    }

    // Display method
    public void display() {
        System.out.println("Insurance type: " + type + "\nMonthly cost: $" + cost);
    }
}