class Elevator implements Cloneable 
{
	Door door;
	Control control;
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