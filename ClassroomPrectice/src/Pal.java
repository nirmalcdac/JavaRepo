import static java.lang.System.out;
public class Pal
{
	public static void main(String[] args) 
	{
		String b="redivider";
		StringBuilder a = new StringBuilder(b);
		a.reverse();		
		if (b.equals(a.toString()))
		{
			out.println("palindrome");
		}
		else
		{
			out.println("palindrome.");
		}
	}
}