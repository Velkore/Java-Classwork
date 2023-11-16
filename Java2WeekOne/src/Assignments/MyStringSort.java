package Assignments;

import java.util.Scanner;
import java.util.Arrays;

public class MyStringSort {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] values = new int[10];
        int count = 0;

        System.out.println("Enter up to 10 integer values or type 'quit' to end:");

        while (count < 10) {
            String input = n.next();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                values[count] = value;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("An integer is required, or type 'quit' to end.");
            }
        }

        if (count > 0) {
            // Sort the array in ascending and descending order
            int[] ascendingOrder = Arrays.copyOf(values, count);
            Arrays.sort(ascendingOrder);
            int[] descendingOrder = Arrays.copyOf(values, count);
            Arrays.sort(descendingOrder);
            for (int i = 0; i < count / 2; i++) {
                int temp = descendingOrder[i];
                descendingOrder[i] = descendingOrder[count - 1 - i];
                descendingOrder[count - 1 - i] = temp;
            }

            // Display the values in ascending order
            System.out.println("Ascending Order:");
            for (int value : ascendingOrder) {
                System.out.print(value + " ");
            }
            System.out.println();

            // Display the values in descending order
            System.out.println("Descending Order:");
            for (int value : descendingOrder) {
                System.out.print(value + " ");
            }
            System.out.println();
        } else {
            System.out.println("No values entered.");
        }

        n.close();
    }
}
