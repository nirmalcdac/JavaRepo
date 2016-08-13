public class Facade 
{
	public void detail()
	{
		Ac a = new Ac();
		Tv t = new Tv();
		Radio r = new Radio();
		a.detail();
		t.detail();
		r.detail();
	}	
}