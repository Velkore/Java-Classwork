package Debug;

public class DebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public DebugCustomer(int id, String name, double creditLimit)
    {
       idNumber = id;
       this.name = name;
       this.creditLimit = creditLimit;
    }
    public void display()
    {
       System.out.printf("Customer # " + idNumber +
          " Name: " +  name, "\nCredit limit $" + creditLimit);
    }
}
