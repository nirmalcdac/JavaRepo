public class BankAccount
{
	private static BankAccount instance;
	private BankAccount(){} 
	public synchronized BankAccount getInstance()
	{
		if (instance == null)
		{
			instance = new BankAccount();
		}
		return instance;
	}
	public static void main(String arg[])
	{
		System.out.println("The output of two instance:");
		BankAccount ATM=new BankAccount();		
		System.out.println("First  ATM:"+ATM.getInstance());
		ATM=new BankAccount();
		System.out.println("Second ATM:"+ATM.getInstance());
		
		System.out.println("The output of two instance:");
		BankAccount ATM1=new BankAccount();		
		System.out.println("First  ATM:"+ATM1.getInstance());
		ATM1=new BankAccount();
		System.out.println("Second ATM:"+ATM1.getInstance());
	  }
}
