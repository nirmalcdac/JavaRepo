
public class AStar {
	static String[] OBSTACLES=new String[] {"0,1-1,1","1,2-1,3","1,4-2,4","2,1-2,2","2,1-3,1","2,3-3,3","3,2-3,3","3,0-4,0"};
	final static int UP=1;
	final static int DOWN=2;
	final static int RIGHT=3;
	final static int LEFT=4;
	final static int STARTROW=3;
	final static int STARTCOL=4;
	final static int GOALROW=2;
	final static int GOALCOL=0;
	final static int UNVISITED=0;
	final static int VISITED=1;
	public static void main(String[] args)
	{
		int cost=-1,i=0,j;
		int queue[][]=new int[100][4];
		int currentRow=STARTROW;
		int currentCol=STARTCOL;
		int newRow[]={-1};
		int newCol[]={-1};
		int count=0;
		boolean flag=false;
		System.out.println("Starting Position(row,column) : "+STARTROW+" , "+STARTCOL);
		
		do
		{
			cost=findPathAndCost(currentRow,currentCol,newRow,newCol,UP);
			if(newRow[0] !=-1 && newCol[0] !=-1 && cost!=-1)
			{
				queue[i][0]=newRow[0];
				queue[i][1]=newCol[0];
				queue[i][2]=cost;
				queue[i][3]=UNVISITED;
				i++;
			}
			cost=findPathAndCost(currentRow,currentCol,newRow,newCol,DOWN);
			if(newRow[0] !=-1 && newCol[0] !=-1 && cost!=-1)
			{
				queue[i][0]=newRow[0];
				queue[i][1]=newCol[0];
				queue[i][2]=cost;
				queue[i][3]=UNVISITED;
				i++;
			}
			cost=findPathAndCost(currentRow,currentCol,newRow,newCol,RIGHT);
			if(newRow[0] !=-1 && newCol[0] !=-1 && cost!=-1)
			{
				queue[i][0]=newRow[0];
				queue[i][1]=newCol[0];
				queue[i][2]=cost;
				queue[i][3]=UNVISITED;
				i++;
			}
			cost=findPathAndCost(currentRow,currentCol,newRow,newCol,LEFT);
			if(newRow[0] !=-1 && newCol[0] !=-1 && cost!=-1)
			{
				queue[i][0]=newRow[0];
				queue[i][1]=newCol[0];
				queue[i][2]=cost;
				queue[i][3]=UNVISITED;
				i++;
			}
			sort(queue,i);
			for(j=0;j<i;j++)
				if(queue[j][3]==UNVISITED && flag==false)
				{
					currentRow=queue[j][0];
					currentCol=queue[j][1];
					cost=queue[j][2];
					queue[j][3]=VISITED;
					flag=true;
				}
			flag=false;
			count++;
			System.out.println("Move "+count+" : "+currentRow+ ", "+currentCol+" Cost= "+cost);
		}while(cost!=0);
		System.out.println("Goal State : "+GOALROW+","+GOALCOL);
	}
	
	private static void sort(int[][] queue,int length) {
		int i,j,k;
		int temp[]=new int[4];
		
		 for (i = 0 ; i < ( length - 1 ); i++)
		    for (j = 0 ; j < length - i - 1; j++)
		      if ( (queue[j][3]==UNVISITED) && (queue[j+1][3]==UNVISITED) && (queue[j][2] > queue[j+1][2])) /* For decreasing order use < */
		      {
		        for(k=0;k<4;k++)
		        	temp[k]=queue[j][k];
		        for(k=0;k<4;k++)
		        	queue[j][k]=queue[j+1][k];
		        for(k=0;k<4;k++)
		        	queue[j+1][k]=temp[k];
		      }
	}
	public static int findPathAndCost(int currentRow,int currentCol,int newRow[],int newCol[],int direction)
	{
		int cost=-1;
		boolean obstacle;
		
		switch(direction)
		{
			case UP:
				newRow[0] = (currentRow-1)>= 0 ?  currentRow-1 : -1;
			    newCol[0]=currentCol;
				obstacle=obstacleExists(currentRow,currentCol,newRow[0],newCol[0]);
				//System.out.println("0 = "+obstacle);
				if(!obstacle)
					cost=(newRow[0] > -1) ? calculateCost(currentRow,currentCol,newRow[0],newCol[0]) : 1000;
		
				break;
			case DOWN: 
			//DOWN
			newRow[0] = (currentRow+1)>=4 ?  currentRow+1 : -1;
		    newCol[0]=currentCol;
		    obstacle=obstacleExists(currentRow,currentCol,newRow[0],newCol[0]);
		   // System.out.println("1 = "+obstacle);
		    if(!obstacle)
		    	cost= (newRow[0] > -1) ? calculateCost(currentRow,currentCol,newRow[0],newCol[0]) : 1000;
		    break;
		    
			case RIGHT:
			    //RIGHT
			    newCol[0] = (currentCol+1) <=4  ?  currentCol+1 : -1;
		  		newRow[0]=currentRow;
		  	    obstacle=obstacleExists(currentRow,currentCol,newRow[0],newCol[0]);
		  	    //System.out.println("2 = "+obstacle);
		  	    if(!obstacle)
		  	    	cost=(newCol[0] > -1) ? calculateCost(currentRow,currentCol,newRow[0],newCol[0]) : 1000;
		    	break;
  	    	
			case LEFT:
		  		//LEFT
		  		newCol[0] = (currentCol-1)>=0 ?  currentCol-1 : -1;
				newRow[0]=currentRow;
				obstacle=obstacleExists(currentRow,currentCol,newRow[0],newCol[0]);
				//System.out.println("3 = "+obstacle);
				if(!obstacle)
					cost=(newCol[0] > -1) ? calculateCost(currentRow,currentCol,newRow[0],newCol[0]) : 1000;
		}	
		
		
		return cost;
	}

	public static boolean obstacleExists(int currentRow, int currentCol,
			int newRow, int newCol) {
		boolean obstacle=false;
		String position1=currentRow+","+currentCol+"-"+newRow+","+newCol;
		String position2=newRow+","+newCol+"-"+currentRow+","+currentCol;
		
		for(int i=0;i<OBSTACLES.length;i++)
			if(OBSTACLES[i].equals(position1) || OBSTACLES[i].equals(position2))
				obstacle=true;
		return obstacle;
	}

	private static int calculateCost(int currentRow, int currentCol,
			int newRow, int newCol) {
		int cost=0;
		if(Math.abs(newRow-GOALROW)==1  && newCol==GOALCOL)
			cost=0;
		else
			if(Math.abs(newCol-GOALCOL)==1  && newRow==GOALROW)
				cost=0;
		else
			cost=Math.abs(GOALROW- newRow) + Math.abs(GOALCOL - newCol);
		
		return cost;
	}

}
