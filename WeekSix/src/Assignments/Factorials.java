package Assignments;

// DISPLAY FACTORIAL FOR EACH NUM FROM 1 TO 10

public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
            long factorial = calculateFactorial(i);
            System.out.println("Factorial of " + i + " is " + factorial);
        }
    }
	
	// NTS : Do no use int for extremely large values, integer overflow occurs at > 12 numbers
	// instead, use long since it can store more values than int
	
    public static long calculateFactorial(int n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
	}