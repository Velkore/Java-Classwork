package Main;

public class First {
	
	private static void displayAddress1()
	{
		System.out.println("XYZ company1");
	}

	public static void main() {
		// TODO Auto-generated method stub
		System.out.println("This method is called main !");
	}
	
	public static void main(String[] args)
	{
		//System.out.println("Start");
		displayAddress1();
		System.out.println("First Java Application");
		displayAddress2();
	}
	
	public static void displayAddress2()
	{
		System.out.println("XYZ company2");
		main();
		// fully qualified identifier
		First.main(null);
	}

}
