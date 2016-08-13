
public class Person
{
	public static void main(String args []) throws Exception
	{
		Person p = new Person();
		Elevator el=new Elevator();
		int status=el.getelstatus();
		System.out.println("Elevator is on floar no " + status);
		el.callelevator();
		el.opendoor();
		p.enter();
		el.doorclose();
		el.Setchoice(5);
		el.moveelevator();
		el.opendoor();
		el.doorclose();
	}
	private void enter()
	{
		System.out.println("Person Entered");
	}
}