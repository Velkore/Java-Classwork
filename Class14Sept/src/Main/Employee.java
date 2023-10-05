package Main;

public class Employee {
	
	// fields - variables - attributes
	private int empNum;
	private String empLastName;
	private String empFirstName;
	private double empSalary;
	
	// methods
	public int getEmpNum()
	{
		return empNum;
	}
	
	public void setEmpNum(int emp)
	{
		empNum = emp;
	}
	
	public String getEmpLastName()
	{
		return empLastName;
	}
	
	public void SetEmpLastName(String name)
	{
		empLastName = name;
	}
	
	public String getEmpFirstName()
	{
		return empFirstName;
	}
	
	public void setEmpFirstName(String name)
	{
		empFirstName = name;
	}
	
	public double getEmpSalary()
	{
		return empSalary;
	}
	
	public void setEmpSalary(double sal)
	{
		empSalary = sal;
	}
	
}
