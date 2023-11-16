package Assignments;

public abstract class Book {
    String title;
    int pages;
    double price;

    // Constructor
    public Book(String title) {
        this.title = title;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    // Price setter
    public abstract void setPrice();
}
