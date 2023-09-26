package Assignments;

public class TestSandwich
{
	public static void main(String[] args) {
		// Instantiate a new sandwich object
		Sandwich mySandwich = new Sandwich("", "", 0.00);

		// Update the values using the set methods
		mySandwich.setMainIngredient("Bologna");
		mySandwich.setBreadType("White");
		mySandwich.setPrice(5.99);

		System.out.println("Main Ingredient: " + mySandwich.getMainIngredient());
		System.out.println("Bread Type: " + mySandwich.getBreadType());
		System.out.println("Price: $" + mySandwich.getPrice());
	}
}

