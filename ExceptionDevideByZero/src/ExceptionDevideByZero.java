import java.util.Random;

public class ExceptionDevideByZero 
{
	public static void main(String args [] ) throws Exception
	{
		int a=0, b=0, c=0;
		Random r= new Random();
		for(int i=0; i<32000; i++)
		{
			try
			{
				b=r.nextInt();
				c=r.nextInt();
				a=12345/(b/c);
			}
			catch(ArithmeticException n)
			{
				System.out.println("Division By Zero");
				//System.out.println("Exception: " +n);
				a=0;
			}
			System.out.println("a: "+ a);
		}
	}
}
