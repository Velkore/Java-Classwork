package Assignments;

// STORE 12 INTEGERS IN AN ARRAY
// DISPLAY ARRAY FROM 1ST TO LAST AND FROM LAST TO 1ST

public class TwelveInts {
	
	public static void main(String[] args) {
		int[] intsArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		System.out.println("Integer array from 1st to last: ");
		for (int i = 0; i < intsArray.length; i++) {
			System.out.print(intsArray[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Integer array from last to first: ");
		for (int i = intsArray.length - 1; i >= 0; i--) {
			System.out.print(intsArray[i] + " ");
		}
		
	}
}
