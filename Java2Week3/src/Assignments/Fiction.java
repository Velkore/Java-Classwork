package Assignments;

public class Fiction extends Book {
    // Constructor with call to setPrice
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    // setPrice method
    public void setPrice() {
        super.price = 22.99;
    }
}
