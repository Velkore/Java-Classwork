package Assignments;

import java.util.Scanner;
import java.util.Arrays;

public class MySalesPersonDatabase {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        // Create an array to contain our database of salespeople with a maximum size of 15
        Salesperson[] salesDb = new Salesperson[15];
        int count = 0;

        // Continuous loop asking for user input until the user enters Q to quit
        while (true) {
            System.out.println("Choose an option: ");
            System.out.println(" 'R' to add a record");
            System.out.println(" 'D' to delete a record");
            System.out.println(" 'C' to change a record");
            System.out.println(" 'Q' to quit");

            // Easy way to allow lower or upper case entries, where we just convert to upper case internally anyways
            String option = n.next().toUpperCase();

            if (option.equals("R")) {
            	// Checks if database is already full before asking for input, displaying an error if it is
                if (count < 15) {
                    System.out.println("Enter an ID number for the new Salesperson:");
                    int newId = n.nextInt();
                    System.out.println("Enter the annual sales value:");
                    double newSales = n.nextDouble();
                    
                    // Creates a new Salesperson object based off user input and stores it in the database array at the index equal to current count 
                    salesDb[count] = new Salesperson(newId, newSales);
                    count++;
                    System.out.println("Record added successfully.");
                } else {
                    System.out.println("Error: Database is full.");
                }
            } else if (option.equals("D")) {
            	// Checks if the database is empty before continuing to delete, displaying an error if it is
                if (count > 0) {
                    System.out.println("Enter the ID number to delete:");
                    int deleteId = n.nextInt();
                    int index = -1;
                    // Search the database for an object with an ID equal to user input for deletion
                    for (int i = 0; i < count; i++) {
                        if (salesDb[i] != null && salesDb[i].getId() == deleteId) {
                            index = i;
                            break;
                        }
                    }
                    // Displays error if user input ID does not exist in database
                    if (index == -1) {
                        System.out.println("Error: ID not found in the database.");
                    } else {
                    	// Deletes entry from database and decrements count
                        for (int i = index; i < count - 1; i++) {
                            salesDb[i] = salesDb[i + 1];
                        }
                        count--;
                        System.out.println("Record deleted successfully.");
                    }
                } else {
                    System.out.println("Error: Database is empty.");
                }
            } else if (option.equals("C")) {
            	// Checks if the database is empty before continuing to delete, displaying an error if it is
                if (count > 0) {
                    System.out.println("Enter the ID number to change:");
                    int changeId = n.nextInt();
                    int index = -1;
                    // Searches the database for an ID equal to user input 
                    for (int i = 0; i < count; i++) {
                        if (salesDb[i] != null && salesDb[i].getId() == changeId) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Error: ID not found in the database.");
                    } else {
                    	// When matching record is found, asks for user input to update new values
                        System.out.println("Enter the new annual sales value:");
                        double newSales = n.nextDouble();
                        salesDb[index].setAnnualSales(newSales);
                        System.out.println("Record updated successfully.");
                    }
                } else {
                    System.out.println("Error: Database is empty.");
                }
            } else if (option.equals("Q")) {
                // Sorts and displays the database in ascending order by Salesperson ID
                Arrays.sort(salesDb, 0, count);
                System.out.println("Database in ascending order by Salesperson ID:");
                for (int i = 0; i < count; i++) {
                	int id = salesDb[i].getId();
                	double annualSales = salesDb[i].getAnnualSales();
                    System.out.println("Salesperson " + (i+1) + " - ID: " + id + ", Annual Sales: $" + annualSales);
                }
                break;
            }
        }

        n.close();
    }
}