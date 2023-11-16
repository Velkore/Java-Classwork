package Assignments;

public class NonFiction extends Book {
    // Constructor with call to setPrice
    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    // setPrice method
    public void setPrice() {
        super.price = 35.99;
    }
}
