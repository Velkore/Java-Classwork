package Assignments;

public class RaceTurtle extends Turtle{
	
	// Data fields for number of races and number of wins
	
	int races;
	int wins;
	
	// Getters and Setters
	
	public int getRaces() {
		return races;
	}
	public void setRaces(int numRaces) {
		this.races = numRaces;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int numWins) {
		this.wins = numWins;
	}
	
	// Display method for number of races and wins
	
	public void displayRaces(int n1, int n2) {
		System.out.println("\nRacing stats :\n     Races : " + n1 + "\n     Wins : " + n2);
	}
}
