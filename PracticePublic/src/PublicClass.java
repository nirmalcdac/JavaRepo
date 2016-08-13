public class PublicClass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		systeming();
	}
	public static void systeming() 
	{
		System.out.println("Systeming");
		systeming1();
	}
	public static void systeming1()
	{
		System.out.println("this is public method called system");
		Hello H1=new Hello();
		H1.systeming2();
	}
}
class Hello
{
	public void systeming2()
	{
		System.out.println("this is public method called system");
	}
}