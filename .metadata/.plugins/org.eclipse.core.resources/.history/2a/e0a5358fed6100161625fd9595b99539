public class ExceptionThrows1 
{
	public static void main(String[] args) 
	{
		try
		{
			ThrowsDemo.throwOne();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught " + e);
		}                                                                                                                                                                                                                                                                                                                                                              
	}
}
class ThrowsDemo
{
	static void throwOne () throws ArithmeticException
	{
		System.out.println("Inside throwOne");
		int a=5/0;
	}
}