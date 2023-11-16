package Assignments;

public class ArrayMethodDemo {
	public static void main(String[] args) {
        int[] numsArray = {15, 7, 32, 44, 9, 21, 18, 4, 72, 8};

        allIntegers(numsArray);
        reverseIntegers(numsArray);
        sumOfIntegers(numsArray);
        lessThanLimit(numsArray, 20);
        aboveAverage(numsArray);
    }

    public static void allIntegers(int[] arr) {
        System.out.print("All integers: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void reverseIntegers(int[] arr) {
        System.out.print("Integers in Reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sumOfIntegers(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        System.out.println("Sum of Integers: " + sum);
    }

    public static void lessThanLimit(int[] arr, int limit) {
        System.out.print("Values Less Than " + limit + ": ");
        for (int number : arr) {
            if (number < limit) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void aboveAverage(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        double average = (double) sum / arr.length;

        System.out.print("Values Above Average: ");
        for (int number : arr) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        
        System.out.println();
    }
}
