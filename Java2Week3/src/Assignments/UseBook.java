package Assignments;

public class UseBook {
    // Create a SciFiction, a Fiction, and a NonFiction Book, and display their
    // fields.
    public static void main(String[] args) {
        SciFiction sciFiction = new SciFiction("The Hitchhiker's Guide to the Galaxy");
        Fiction fiction = new Fiction("The Lord of the Rings");
        NonFiction nonFiction = new NonFiction("Beneath a Scarlet Sky");

        System.out.println("SciFiction: " + sciFiction.getTitle() + ", $" + sciFiction.getPrice());
        System.out.println("Fiction: " + fiction.getTitle() + ", $" + fiction.getPrice());
        System.out.println("NonFiction: " + nonFiction.getTitle() + ", $" + nonFiction.getPrice());
    }
}
