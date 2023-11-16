package Assignments;
import java.util.Scanner;

public class DemoTurtles {

	public static void main(String[] args) {
		
		// Scanner setup for user input
		
		Scanner n = new Scanner(System.in);
		
		// Create a new turtle object
		// Turtle rabbit = new Turtle();
		
		// Create a new RaceTurtle object
		RaceTurtle rabbit = new RaceTurtle();
		
		// Get user input for their turtle and allocate values to our Turtle object
		
		System.out.println("Enter turtle name >> ");
		rabbit.setName(n.next());
		System.out.println("Enter turtle color >> ");
		rabbit.setColor(n.next());
		System.out.println("Enter turtle weight >> ");
		rabbit.setWeight(n.nextInt());
		System.out.println("Enter turtle birth year >> ");
		rabbit.setBirthYear(n.nextInt());
		
		// Get user input for turtle race info and allocate values to RaceTurtle object
		
		System.out.println("Enter number of turtles races >> ");
		rabbit.setRaces(n.nextInt());
		System.out.println("Enter number of turtles wins >> ");
		rabbit.setWins(n.nextInt());
		
		// Invoking methods from Turtle and RaceTurtle to display turtle information
		
		rabbit.displayTurtle(rabbit.getName(), rabbit.getColor(), rabbit.getWeight(), rabbit.getBirthYear());
		rabbit.displayRaces(rabbit.getRaces(), rabbit.getWins());
		
	}

}
