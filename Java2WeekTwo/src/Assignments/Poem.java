package Assignments;

public class Poem {
	
	// Data fields for all poems
	
	String name;
	int lines;
	
	// Constructor requiring name and lines
	
	Poem(String name, int lines){
		this.name = name;
		this.lines = lines;
	}

	// Getters and Setters
	
	public String getName() {
		return name;
	}

	public int getLines() {
		return lines;
	}
	
	void displayTitle(String name, String type) {
		System.out.println("A " + type + " has " + lines + " lines. Here is an example :");
		System.out.println("--- " + name + " ---");
	}
}