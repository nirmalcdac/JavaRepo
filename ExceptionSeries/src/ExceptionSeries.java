public class ExceptionSeries {
	public static void main(String[] args) {
		try {
			int a = 0;
			@SuppressWarnings("unused")
			int b = 42 / a;
		} catch (ArithmeticException e)// this is sub class if this catch will
										// come second it will be unreachable
		{
			System.out.println("Sub classes should come before super class");
		} catch (Exception e)// this is super class so this should come after
								// all sub classes
		{
			System.out.println("(super class should come after all sub classes) generic Exception class");
		}
	}
}
