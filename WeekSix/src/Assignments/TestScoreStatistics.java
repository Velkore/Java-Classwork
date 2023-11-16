package Assignments;
import java.util.Scanner;


public class TestScoreStatistics {
	
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int score = 0, sum = 0, count = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        System.out.println("Enter test scores. Enter 999 to calculate totals and average.");

        while (score < 999) {
            System.out.print("Enter a score: ");
            score = n.nextInt();

            if (score == 999) {
                break;
            }

            if (score >= 0 && score <= 100) {
            	
                sum += score;
                count++;

                if (score > highest) {
                    highest = score;
                }

                if (score < lowest) {
                    lowest = score;
                }
            } else {
                System.out.println("Scores must be between 0 and 100.");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Number of scores: " + count);
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
            System.out.println("Arithmetic average: " + average);
        } else {
            System.out.println("No valid scores were entered.");
        }

        n.close();
    }
}

