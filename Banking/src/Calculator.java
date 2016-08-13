public class Calculator 
{
	public static void main(String[] args)  throws Exception
	{
		int sum= addition(100 , 10);
		System.out.println("addition is"+" "+ sum);
		int mul=multiplication(100, 10);
		System.out.println("multiplication is"+" "+ mul);
		int sub=subtraction(100, 10);
		System.out.println("subtraction is"+" "+sub);
		int div=division(100, 10);
		System.out.println("division is"+" "+ div);
		int div1=division(100, 0);
		System.out.println("division is"+" "+ div1);
	}

	private static int division(int a, int b) {
		// TODO Auto-generated method stub
		int result=0;
		try
		{
			result = a/b;
		}
		catch (ArithmeticException ae)
		{
			System.out.println("dividing");
			//ae.printStackTrace(); // to print stack trace of exception
			System.out.println("Exception handled in " +"division()");
		}
		finally 
		{ 	
			System.out.println("Finally done.");
		}
		return result;
	}

	private static int subtraction(int a, int b) 
	{
		// TODO Auto-generated method stub
		return a-b;
	}
	
	private static int multiplication(int a, int  b)
	{
		// TODO Auto-generated method stub
		return a*b;
	}

	private static int addition( int a, int b) 
	{
		// TODO Auto-generated method stub
		return a+b;
	}
}