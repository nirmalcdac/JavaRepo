public class Question6 
{
	public static void main (String [] str)
	{
		int s = 0;//to make line 10 working change tyoe of s to int short s = 0;
		int x = 07;
		int y = 8; // put this and see the effect int y = 08;
		int z = 123456;
		
		s =+ z;// put this and see the effect s += z; even this will not work s =+ z;
		System.out.println("" + x + y + s);
	}
}
