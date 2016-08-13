public class ObjectMethods
{
	public static void main(String[] args)
	{	
		Elevator Eobj = new Elevator();
		Elevator Eobj1 = (Elevator) Eobj.clone();
		Elevator Eobj2 = (Elevator) Eobj.clone();
		System.out.println("hash code for Eobj: " + Eobj.hashCode());
		System.out.println("hash code for Eobj1: " + Eobj1.hashCode());
		System.out.println("hash code for Eobj2: " + Eobj2.hashCode()+"\n");
		System.out.println("Eobj == Eobj1: " + (Eobj == Eobj1));
		System.out.println("Eobj1 == Eobj2: " + (Eobj1 == Eobj2)+"\n");
		System.out.println("Eobj1.equals(Eobj2): " + Eobj1.equals(Eobj2));
		System.out.println("Eobj.equals(Eobj1): " + Eobj.equals(Eobj1)+"\n");
		Elevator[] array1 = {new Elevator(), new Elevator(), new Elevator()};
		Elevator[] array2 = array1.clone();
		System.out.println("array1 == array2: " + (array1 == array2));
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println("array1[" + i + "] == array2[" + i + "] : " +(array1[i] == array2[i]));
		}
		System.out.println();
	}
}