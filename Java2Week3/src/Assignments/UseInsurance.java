package Assignments;

import java.util.Scanner;

public class UseInsurance {
    Scanner n = new Scanner(System.in);

    // Prompt user for insurance choice
    public int promptUser() {
        System.out.println("What type of insurance do you want to display?");
        System.out.println("Enter 1 for Life Insurance");
        System.out.println("Enter 2 for Health Insurance");
        return n.nextInt();
    }

    // Display insurance according to user choice
    public void displayInsurance(int choice) {
        if (choice == 1) {
            Life life = new Life();
            life.display();
        } else if (choice == 2) {
            Health health = new Health();
            health.display();
        } else {
            System.out.println("Invalid input");
        }
    }

    // Display using getters
    public void displayInsurance(Insurance insurance) {
        System.out.println("Insurance type: " + insurance.getType() + "\nMonthly cost: $" + insurance.getCost());
    }
    
    // Main method
    public static void main(String[] args) {
        UseInsurance useInsurance = new UseInsurance();
        int choice = useInsurance.promptUser();
        useInsurance.displayInsurance(choice);
    }
}
