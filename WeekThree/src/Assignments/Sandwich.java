package Assignments;

public class Sandwich
{
	private String mainIngredient;
	private String breadType;
	private double price;

	// Constructor
	public Sandwich(String mainIngredient, String breadType, double price)
	{
		this.mainIngredient = mainIngredient;
		this.breadType = breadType;
		this.price = price;
	}

	public String getMainIngredient()
	{
		return mainIngredient;
	}

	public void setMainIngredient(String mainIngredient)
	{
		this.mainIngredient = mainIngredient;
	}

	public String getBreadType()
	{
		return breadType;
	}

	public void setBreadType(String breadType)
	{
		this.breadType = breadType;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
}

