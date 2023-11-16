package Assignments;

public class SciFiction extends Book {
    // Constructor with call to setPrice
    public SciFiction(String title) {
        super(title);
        setPrice();
    }

    // setPrice method
    public void setPrice() {
        super.price = 21.99;
    }
}