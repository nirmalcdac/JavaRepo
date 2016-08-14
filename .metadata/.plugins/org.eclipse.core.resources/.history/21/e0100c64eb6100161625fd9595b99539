import java.util.Random;


public class XORNeuralNetwork {
	
	static float randomNumbers[]={-2.0f,-2.0f,-2.0f,-2.0f};
	public static void main(String []args)
	{
		float XORTable[][]=new float[4][2];
		XORTable[0]=new float[] {0.0f,0.0f};
		XORTable[1]=new float[] {0.0f,0.1f};
		XORTable[2]=new float[] {1.0f,0.0f};
		XORTable[3]=new float[] {1.0f,1.0f};
		float weightVector1[][]=new float[2][2];
		float weightVector2[][]=new float[2][1];
		float inputVector[][]=new float[1][2];
		int i,j;
		float temp;
		float intermediate[][]=new float[1][2];
		float expectedOutput;
		float output[][]=new float[1][1];
		boolean result[]={false,false,false,false};
		boolean flag=false;
		
		//initialize weight vector1
		setWeightVector(weightVector1,2,2);
		clearRandomArray(randomNumbers);
		//initialize weight vector2
		setWeightVector(weightVector2,2,1);
		clearRandomArray(randomNumbers);
		i=0;

		while(!flag)
		{
			while(i<4)
			{
				setInputVector(inputVector,XORTable[i]);
				multiply(inputVector,weightVector1,1,2,2,intermediate);
				for(j=0;j<2;j++)
				{
					temp=1+(float)Math.exp(intermediate[0][j]*-1);
					intermediate[0][j]=(1/temp);
				}
				
				multiply(intermediate,weightVector2,1,2,1,output);
				expectedOutput=XOR( inputVector[0][0],inputVector[0][1] );
				System.out.println(output[0][0]);
				switch((int)expectedOutput)
				{
					case 0:if(output[0][0]>=0.0f &&  output[0][0]<=0.1f)
								result[i]=true;
							break;
					case 1:if(output[0][0]>=0.9f &&  output[0][0]<=1.0f)
							result[i]=true;
				}
				
				if(!result[i])
				{
					calculateWeightVector(weightVector1,2,1,intermediate);
				}
				
				i++;
			}
			
			flag=result[0]&result[1]&result[2]&result[3];
			if(!flag && i==4)
			{
				i=0;
				for(int k=0;k<4;k++)
					result[k]=false;
			}
		}
		System.out.println("Final weight vector");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				System.out.print(weightVector1[i][j]+"	");
			System.out.println("");
		}
		
	}
	
	private static void calculateWeightVector(float[][] weightVector, int row,int col, float[][] input)
	{
		float r=0.1f;
		float output=0.0f;
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			{
				//if(row==1)
					//output=output[0][0];
				//else
					//output=output[i][j];
				//weightVector[i][j]=r*input[i][j]*;
						
			}
		
	}

	private static void clearRandomArray(float[] randomNumbers) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
			randomNumbers[i]=-0.2f;
	}

	private static float XOR(float a, float b) {
		// TODO Auto-generated method stub
		return (float)((int)a ^ (int)b);
	}

	private static void setWeightVector(float[][] weightVector, int row, int col) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<row;i++)
			for( int j=0;j<col;j++)
				weightVector[i][j]=getRandomNumber(++index);
	}

	private static void multiply(float[][] inputVector,float[][] weightVector1, int row1, int column1, int column2,float intermediate[][]) 
	{
		float sum;
		for(int i=0;i<row1;i++)
			for(int j=0;j<column2;j++)
			{
				sum=0.0f;
				for(int k=0;k<column1;k++)
					sum += inputVector[i][k]*weightVector1[k][j];
				
				intermediate[i][j] = sum;
			}
	}



	private static void setInputVector(float[][] inputVector, float[] XORTable) {
		// TODO Auto-generated method stub
		for(int i=0;i<1;i++)
			for(int j=0;j<2;j++)
			inputVector[i][j]=XORTable[j];
	}



	public static float getRandomNumber(int index)
	{
		float number;
		boolean flag=false;
		Random rand = new Random();
		do
		{
			number = (rand.nextInt(11))/(10.0f); 
			if(index % 2!=0)
				number *=-1;
			for(int i=0;i<4;i++)
				if(number==randomNumbers[i])
				{
					flag=false;
					break;
				}
				else
					flag=true;
		}while(!flag);
		randomNumbers[index-1]=number;
		return number;
	}
}
