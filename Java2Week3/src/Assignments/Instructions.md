Always use Comments and programming style

Exercise 1: SciFiction.java, Fiction.java, NonFiction.java and UseBook.java

Book.java: Create an abstract class named Book. Include a String field for the book’s title, Integer field for pages, and a double field for the book’s price. Within the class, include a constructor that requires the book title, and add three get methods—one that returns the title, one that returns the pages, and one that returns the price. Include an abstract method named setPrice().

Create three child classes of Book: SciFiction.java, Fiction.java, and NonFiction.java.
Each must include a setPrice() method that sets the price for all SciFiction Books to 21.99, Fiction Books to $22.99 and for all NonFiction Books to $35.99.
Write a constructor for each subclass, and include a call to setPrice() within each constructors.

UseBook.java: Write an application demonstrating that you can create a SciFiction, a Fiction, and a NonFiction Book, and display their fields.
Save the files as Book.java, Fiction.java, NonFiction.java, and UseBook.java.

Exercise 2:
Write an application named UseInsurance that uses an abstract Insurance class and Health and Life subclasses to display different types of insurance policies and the cost per month. The Insurance class contains a String representing the type of insurance and a double that holds the monthly price. The Insurance class constructor requires a String argument indicating the type of insurance, but the Life and Health class constructors require no arguments. The Insurance class contains a get method for each field; it also contains two abstract methods named setCost() and display(). The Life class setCost() method sets the monthly fee to $36, and the Health class sets the monthly fee to $196. Write an application named UseInsurance that prompts the user for the type of insurance to be displayed, and then create the appropriate object. Save the files as Life.java, Health.java, Insurance.java, and UseInsurance.java.
