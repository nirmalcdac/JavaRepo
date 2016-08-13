public class Question3 
{
	public static void javaHungry(Exception e)
	{
		System.out.println("Exception");
	}
	
	public static void javaHungry(ArithmeticException  ae)//remove 1 from this method name to see the effect
	{
		System.out.println("ArithmeticException");
	}
	
	public static void javaHungry(Object o)
	{
		System.out.println("Object");
	}
	
	public static void main (String [] str)
	{
		javaHungry(null);
	}
}
