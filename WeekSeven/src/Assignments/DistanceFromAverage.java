package Assignments;
import java.util.Scanner;

// USER INPUT = ANY NUMBER OF DOUBLE VALUES UP TO 10, 99999 TO EXIT
// DISPLAY ERROR IF USER EXITS WITHOUT ENTERING NUMBERS
// DISPLAY EACH ENTERED VALUE AND ITS DISTANCE FROM AVERAGE

public class DistanceFromAverage {
	public static void main(String[] args) {
		
		final int MAX_NUMS = 10;
		double[] nums = new double[MAX_NUMS];
		int count = 0;
		double sum = 0;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter up to 10 numbers. Enter 99999 when finished.");
		double number = n.nextDouble();
		
		while (number != 99999 && count < MAX_NUMS) {
			nums[count] = number;
			sum += number;
			count++;
			number = n.nextDouble();
		}
		
		if (count == 0) {
			System.out.println("No numbers have been entered. Exiting application...");
		} else {
			double average = sum / count;
			System.out.println("Input values and their distance from the average: ");
			for (int i = 0; i < count; i++) {
				double distance = Math.abs(nums[i] - average);
				System.out.printf("Value: " + nums[i] + ", Distance from the average: %.2f%n", distance);
			}
		}
		
		n.close();
	}
}
