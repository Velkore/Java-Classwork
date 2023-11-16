package Assignments;

// Adjusted the Salesperson class to implement the 'Comparable' interface to use the 'compareTo' method that allows sorting the array by ID in MySalesPersonDatabase 
public class Salesperson implements Comparable<Salesperson> {
    private int id;
    private double annualSales;

    public Salesperson(int id, double annualSales) {
        this.id = id;
        this.annualSales = annualSales;
    }
    
    // ID getter
    public int getId() {
        return id;
    }

    // Annual sales getter / setter
    public double getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }

    @Override
    public int compareTo(Salesperson other) {
        return Integer.compare(this.id, other.id);
    }
}

