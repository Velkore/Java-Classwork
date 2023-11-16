package Assignments;

public class Turtle {
	
	// Data fields for name, color, weight, and birth year.
	
	private String name;
	private String color;
	private int weight;
	private int birthYear;
	
	// Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	// Display method for turtle
	
	public void displayTurtle(String str1, String str2, int n1, int n2) {
		System.out.println("Turtle Information :\n     Name : " + str1 + "\n     Color : " + str2 + "\n     Weight : " + n1 + "\n     Birth Year : " + n2);
	}
	
}
