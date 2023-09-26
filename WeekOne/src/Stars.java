public class Stars {
	
	public static void main(String args[]){
		int rows = 4;
		
		// Outer loop controlling movement from row to row
		for (int i = 1; i <= rows; i++) {
			// First inner loop determines how many spaces are needed to get the top row centered
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			// Second inner loop prints stars to each row
			for (int k = 1; k <= (i*2); k++) {
				System.out.print("*");
			}
			// Move to the next row
			System.out.println();
		}
	}

}

/*

Output :

	   **
	  ****
	 ******
	********

*/