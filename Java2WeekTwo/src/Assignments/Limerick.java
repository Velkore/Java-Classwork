package Assignments;

public class Limerick extends Poem{
	
	// Constant integer variable for number of lines in this poem object.
	
	final static int lines = 5;
	
	// Parameterized constructor for the Limerick subclass
	
	Limerick(String name) {
		super(name, lines);
	}
	
	// Display limerick method
	
	void displayLimerick() {
		System.out.println("There once was a old lass called jane.\r\n"
				+ "She said, \"See the lovely crain!\"\r\n"
				+ "It was rather crazy,\r\n"
				+ "But not very hazey,\r\n"
				+ "She couldn't say no to the inane.");
	}
}