public class ExceptionThrow 
{
	public static void main(String args []) 
	{
		try
		{
			ThrowDemo.demoprocess();			
		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught " + e);
		}
	}
}
class ThrowDemo
{
	static void demoprocess()
	{
		try
		{
			//throw new NullPointerException("Demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("caught inside Demoprocess");
			throw e;
		}
	}
}