import static java.lang.System.out;
public class Pair 
{
	public static void main(String[] args) {

		Pair1 p1 = new Pair1("maybhas", "jay");
		p1.display();
		Pair1 p2 = new Pair1("maybhas", "jay");
		p2.display();
		out.println(p1.equals(p2));
	}
}
class Pair1 {
	
	private String str1, str2;
	public Pair1(String str1, String str2)
	{
		this.str1=str1;
		this.str2=str2;
	}
	
	public void display()
	{
		out.println(this.str1 + " " + this.str2);
	}
	
	public boolean equals(Pair1 p2)
	{
		boolean flag=false;
		if(this.str1==p2.getStr1())
		{
			if(this.str2==p2.getStr2())
				flag=true;
		}
		else
			flag=false;
		return flag;
	}

	public String getStr1() {
		return str1;
	}

	public String getStr2() {
		return str2;
	}
}
