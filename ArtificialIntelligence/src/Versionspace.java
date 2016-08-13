
public class Versionspace 
{	
	String[] s1={"Blonde","Average","light","No"};
	String[] s2={"Blonde","Tall","Average","Yes"};
	String[] s3={"Blonde","Short","Average","No"};
	String[] s4={"Brown","Tall","Heavy","No"};
	String[] g1={"x1","x2" , "x3" ,"x4"};
	String[] g2={"x1","x2" , "x3" ,"x4"};
	String[] g3={"x1","x2" , "x3" ,"x4"};
	String[] g4={"x1","x2" , "x3" ,"x4"};
	String[] s={null,null,null,null};	
	public Versionspace() 
	{
		positive(s1);
		negative(s2);
		positive(s3);
		negative(s4);	
	}
	private void testConverge()
	{
		if((g1[0].equals(s[0])) && (g2[1].equals(s[1])) && (g3[2].equals(s[2]))  && (g4[3].equals(s[3])))
		{
			System.out.print("\n \n G and S converge, The requred parameters are \n ");
			for(int i=0;i<4;i++)
			{
				if(!s[i].matches("x."))
				{
					System.out.println(s[i]);
				}
			}
		}
	}
	private void printg()
	{
		System.out.print("\n \n G: ");
		for(int i=0;i<4;i++)
		{
			System.out.print("\t"+g1[i]);
		}
		System.out.print("\n ");
		for(int i=0;i<4;i++)
		{
			System.out.print("\t"+g2[i]);
		}
		System.out.print("\n ");
		for(int i=0;i<4;i++)
		{
			System.out.print("\t"+g3[i]);
		}
		System.out.print("\n ");
		for(int i=0;i<4;i++)
		{
			System.out.print("\t"+g4[i]);
		}
		System.out.print("\n S : ");
		for(int i=0;i<4;i++)
		{
			System.out.print("\t"+s[i]);
		}
	}
	private void negative(String[] ss) 
	{
		System.out.print("\n \n Negative Example:  ");
		if(!(s[0].equals(ss[0])))
		{
			g1[0]=s[0];
		}
		if(!(s[1].equals(ss[1])))
		{
			g2[1]=s[1];
		}
		if(!(s[2].equals(ss[2])))
		{
			g3[2]=s[2];
		}
		if(!(s[3].equals(ss[3])))
		{
			g4[3]=s[3];
		}
		printg();
		testConverge();
	}
	private void positive(String[] ss) 
	{
		System.out.print("\n\n Postive Example:");
		if(s[0]==null)
		{
			for(int i=0;i<4;i++)
			{
				s[i]=ss[i];
			}
		}
		else 
		{
			for(int i=0;i<4;i++)
			{
				if(!(ss[i].equals(s[i])))
				{
					int k=i+1;
					s[i]="x"+k;
				}
			}
		}
		if(!(g1[0].equals(ss[0])))
		{
			g1[0]="x1";
		}
		if(!(g2[1].equals(ss[1])))
		{
			g2[1]="x2";
		}
		if(!(g3[2].equals(ss[2])))
		{
			g3[2]="x3";
		}
		if(!(g4[3].equals(ss[3])))
		{
			g4[3]="x4";
		}
		printg();
		testConverge();
	}
	public static void main(String[] args) 
	{
		Versionspace v=new Versionspace();
	}
}