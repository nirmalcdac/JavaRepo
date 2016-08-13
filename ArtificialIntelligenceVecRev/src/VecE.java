public class VecE 
{
	public static void main(String[] args)
	{
		String example1[]={"overcast","hot","high","weak"};
		String example2[]={"sunny","hot","high","weak"};
		String example3[]={"rainy","mild","high","weak"};
		String example4[]={"sunny","hot","high","strong"};
		String example5[]={"rain","cool","normal","weak"};
		String example6[]={"rain","cool","normal","strong"};
		
		System.out.print("Value of Example1:  ");
		print_array(example1);
		System.out.println();
		System.out.print("Value of Example2:  ");
		print_array(example2);
		System.out.println();
		System.out.print("Value of Example3:  ");
		print_array(example3);
		System.out.println();
		System.out.print("Value of Example4:  ");
		print_array(example4);
		System.out.println();
		System.out.print("Value of Example5:  ");
		print_array(example5);
		System.out.println();
		System.out.print("Value of Example6:  ");
		print_array(example6);
		System.out.println();
		
		
		System.out.println("Value of S initially:  NULL");
		String S[]=null;
		String G[][] = new String[4][4];
		System.out.println("Value of G initially:  ");
		print_array2(G);
		
		S=example1;
		System.out.print("Value of S:  ");
		print_array(S);
		System.out.println();
		negative(G,S,example2);
		System.out.println("Value of G:  ");
		print_array2(G);
		System.out.print("Value of S:  ");
		print_array(S);
		positive(G,S,example3);		
		System.out.print("Value of S:  ");
		print_array(S);
		System.out.println("Value of G:  ");
		print_array2(G);
		negative(G,S,example4);
		System.out.println("Value of G:  ");
		print_array2(G);
		System.out.print("Value of S:  ");
		print_array(S);	
		positive(G,S,example5);		
		System.out.print("Value of S:  ");
		print_array(S);
		System.out.println("Value of G:  ");
		print_array2(G);
		negative(G,S,example6);
		System.out.println("Value of G:  ");
		print_array2(G);
		System.out.print("Value of S:  ");
		print_array(S);	
				
	}

	private static void positive(String[][] G, String[] S, String[] example) 
	{
		// TODO Auto-generated method stub
		for(int a=0;a<4;a++)
		{
			
				if(S[a]==example[a])
				{
						//S[a]=S[a];	
				}
				else
				{
					S[a]="x"+(a+1);
				}
			
		}
		for(int a=0;a<4;a++)
		{
			for(int b=0;b<4;b++)
			{
				if(G[a][b]==example[b])
				{
					//G[a][b]="x"+(b+1);	
				}
				else
				{
					G[a][b]="x"+(b+1);
				}
			}
		}
		System.out.println();
	}

	private static void negative(String[][] G, String[] S, String[] example2) {
		// TODO Auto-generated method stub
		for(int a=0;a<4;a++)
		{
			for(int b=0;b<4;b++)
			{
				if(S[a]!=example2[a])
				{
						G[a][a]=S[a];	
				}
				else
				{
					G[a][b]="x"+(b+1);
				}
			}
		}
		System.out.println();
		
	}

	private static void print_array2(String[][] g) 
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(g[i][j]==null)
				{
					
					g[i][j]="x"+(j+1);
					System.out.print(" "+g[i][j]+" ");
				}
				else
				{
					System.out.print(" "+g[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

	private static void print_array(String[] example) 
	{
		for(int i=0;i<4;i++)
		{
			System.out.print(example[i]+" ");
		}
		System.out.println();
	}
}