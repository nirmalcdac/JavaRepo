public class VS
{	
	String[] s1={"high","bad","high","none","$0to$15k"};
	String[] s2={"high","unknown","high","none","$15to$35k"};
	String[] s3={"moderate","unknown","low","none","$15to$35k"};
	String[] s4={"high","unknown","low","none","$0to$15k"};
	String[] s5={"low","unknown","low","none","over$35k"};
	
	String[] s6={"low","unknown","low","adequate","over$35k"};
	String[] s7={"high","bad","low","none","$0to$15k"};
	String[] s8={"moderate","bad","low","adequate","over$35k"};
	String[] s9={"low","good","low","none","over$35k"};
	
	String[] s10={"low","good","high","adequate","over$35k"};
	
	String[] s11={"high","good","high","none","$0to$15k"};
	String[] s12={"moderate","good","high","none","$15to$35k"};
	String[] s13={"low","good","high","none","over$35k"};
	String[] s14={"high","bad","high","none","$15to$35k"};
	
	String[] g1={"x1","x2" , "x3" ,"x4","x5"};
	String[] g2={"x1","x2" , "x3" ,"x4","x5"};
	String[] g3={"x1","x2" , "x3" ,"x4","x5"};
	String[] g4={"x1","x2" , "x3" ,"x4","x5"};
	String[] g5={"x1","x2" , "x3" ,"x4","x5"};
	
	String[] s={null,null,null,null,null};
	
	public VS() 
	{
		positive(s1);
		negative(s3);
		positive(s2);
		negative(s4);
		positive(s10);
		negative(s5);
		positive(s11);
		negative(s6);
		positive(s12);
		negative(s7);
		positive(s13);
		negative(s8);
		positive(s14);
		negative(s9);
	}
	private void testConverge()
	{
		if((g1[0].equals(s[0])) && (g2[1].equals(s[1])) && (g3[2].equals(s[2]))  && (g4[3].equals(s[3])) && (g5[4].equals(s[4])))
		{
			System.out.print("\n \n");
			System.out.print("G and S converge here\n");
			System.out.print("The requred parameters are (is)\t");
			for(int i=0;i<5;i++)
			{
				if(!s[i].matches("x."))
				{
					System.out.println("\""+s[i]+"\"");
				}
			}
			System.exit(1);
		}
	}
	private void printg() 
	{
		System.out.print("\n \n G: ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+g1[i]);
		}
		System.out.print("\n ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+g2[i]);
		}
		System.out.print("\n ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+g3[i]);
		}
		System.out.print("\n ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+g4[i]);
		}
		System.out.print("\n ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+g5[i]);
		}
		System.out.print("\n S : ");
		for(int i=0;i<5;i++)
		{
			System.out.print("\t"+s[i]);
		}
	}
	private void negative(String[] ss) 
	{
		System.out.print("\n");
		System.out.print("\n\n Negative Example:");
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
		if(!(s[4].equals(ss[4])))
		{
			g5[4]=s[4];
		}
		printg();
		testConverge();
	}
	private void positive(String[] ss) 
	{
		System.out.print("\n");
		System.out.print("\n\n Postive Example:");
		if(s[0]==null)
		{
			for(int i=0;i<5;i++)
			{
				s[i]=ss[i];
			}
		}
		else 
		{
			for(int i=0;i<5;i++)
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
		if(!(g5[4].equals(ss[4])))
		{
			g4[4]="x5";
		}
		printg();
		testConverge();
	}
	public static void main(String[] args) 
	{
		new VS();
	}
}