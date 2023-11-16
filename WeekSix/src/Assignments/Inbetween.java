package Assignments;
import java.util.Scanner;

// INPUT = 2 SEPERATE INTEGERS FROM USER
// OUTPUT = EVERY INTEGER BETWEEN INPUT VALUES

public class Inbetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = n.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = n.nextInt();

        int start, end;

        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        if (start < end - 1) {
            System.out.println("Integers between " + start + " and " + end + " are:");
            for (int i = start + 1; i < end; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("There are no integers between the entered values.");
        }

        n.close();
	}
}
