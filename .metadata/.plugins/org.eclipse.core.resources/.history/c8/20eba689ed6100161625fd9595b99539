public class ExceptionThrows 
{
	public static void main(String[] args) 
	{
		try
		{
			ThrowsDemo.throwOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught " + e);
		}
	}
}
class ThrowsDemo
{
	static void throwOne () throws IllegalAccessException
	{
		System.out.println("Inside throwOne");
		throw new IllegalAccessException("Demo");
	}
}