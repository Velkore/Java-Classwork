package Assignments;

public class Couplet extends Poem{
	
	// Constant integer variable for number of lines in this poem object.

	final static int lines = 2;
	
	// Parameterized constructor for the Couplet subclass
	
	Couplet(String name) {
		super(name, lines);
	}
	
	// Display couplet method
	
	void displayCouplet() {
		System.out.println("The fish likes to chase a seal,\r\n"
				+ "Especially one that's in the wheel.");
	}
}
