package Assignments;

public class Haiku extends Poem{
	
	// Constant integer variable for number of lines in this poem object.
	
	final static int lines = 3;
	
	// Parameterized constructor for the Haiku subclass
	
	Haiku(String name) {
		super(name, lines);
	}
	
	// Display haiku method
	
	void displayHaiku() {
		System.out.println("Baking hot mountain\r\n"
				+ "A dead, gold lion waddles\r\n"
				+ "into the noodles");
	}
}