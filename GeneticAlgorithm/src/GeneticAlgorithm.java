
public class GeneticAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] ai = {{1,0,1},
						{0,0,1},
						{0,1,0},
						{1,1,0}
		};
		
		int i,j;
		
		int fi[] = findfi(ai);
			
		int sum = suumation(fi);
		//System.out.println(" " + sum);
		//System.out.println("avg " + (float)sum/4);
		
		float pi[] = findpi(fi,sum);
		float pisum=0,apisum=0;
		
		System.out.println(" " +"fi     " +"pi     " +"n.pi   ");
		for(i=0;i<4;i++)
		{
			System.out.println(" " +fi[i]+ " " +pi[i]+ " " +4*pi[i]);
			pisum=pisum+pi[i];
			apisum=apisum+4*pi[i];
		}
		System.out.println(" " + sum + "    " + pisum + "      " +apisum);
		System.out.println(" " + (float)sum/4 + "   " + (float)pisum/4 + "     " + (float)apisum/4);
		
		
	}

	private static float[] findpi(int[] fi, int sum) {
		// TODO Auto-generated method stub
		float temp[] = new float[4];
		for(int i=0;i<4;i++)
		{
			temp[i]=(float)fi[i]/sum;
		}
		return temp;
	}

	private static int suumation(int[] fi) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<fi.length;i++)
		{
			sum=sum+fi[i];
		}
		return sum;
	}
	
	private static int[] findfi(int[][] ai) {
		// TODO Auto-generated method stub
		int i,j;
		int temp[] = new int[4];
		for(i=0;i<4;i++)
		{
			int sum=0;
			for(j=0;j<3;j++)
			{
				if( j==0)
				{
					sum=sum+4*ai[i][j];
				}
				else if(j==1)
				{
					sum = sum +2*ai[i][j]; 
				}
				else
				{
					sum = sum +1*ai[i][j];
				}
			}
			temp[i]=sum;
		}
		return temp;
	}



}
