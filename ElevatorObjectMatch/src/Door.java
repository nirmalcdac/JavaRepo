
public class Door implements Cloneable  
{
   int doorid=1;
	public Object clone() 
	{
		Object obj = null;
		try 
		{ 
			obj = super.clone();
		} 
		catch (CloneNotSupportedException e) 
		{ 
			System.out.println(e);
		}
		return obj;
	}
}
