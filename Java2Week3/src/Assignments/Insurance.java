package Assignments;

public abstract class Insurance {
    String type;
    double cost;

    // Constructor
    public Insurance(String type) {
        this.type = type;
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    // Cost setter
    public abstract void setCost();

    // Display method
    public abstract void display();

}