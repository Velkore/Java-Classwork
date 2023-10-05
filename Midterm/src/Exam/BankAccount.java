package Exam;

/* Write a Java class called BankAccount that represents a bank account. The BankAccount class should have the following characteristics:

- Two instance variables: accountNumber (a unique integer for each account) and balance (a floating-point number representing the account's balance). 

- A static variable totalAccounts that keeps track of the total number of bank accounts created 

- Two instance methods:

deposit(double amount) - This method should increase the balance by the specified amount.

withdraw(double amount) - This method should decrease the balance by the specified amount if there are sufficient funds.

- A static method getTotalAccounts() that returns the total number of bank accounts created. */

public class BankAccount
{
	private int accountNumber;
	private float balance;
	static int totalAccounts;
	
	public static void main(String[] args)
	{
		
	}
	
	public float deposit(float a)
	{
		float newBalance = a + balance;
		return newBalance;
	}
	
	public float withdraw(float a)
	{
		float newBalance = balance - a;
		return newBalance;
	}
	
	public static int getTotalAccounts()
	{
		return totalAccounts;
	}
}
