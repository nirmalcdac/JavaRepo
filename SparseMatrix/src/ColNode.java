class ColNode 
{
	public ColNode (int initValue, int initColNumber, ColNode initNextCol) 
	{ 
		value = initValue; 
		colNumber = initColNumber; 
		nextCol = initNextCol; 
	} 
	 	public int getValue () 
	 	{ 
	 		return value; 
	 	} 
	 	public int getColNumber () 
	 	{ 
	 		return colNumber; 
	 	} 
	 	public ColNode getNextCol () 
	 	{ 
	 		return nextCol;
	 	} 
	 	public void setValue (int theNewValue) 
	 	{ 
	 		value = theNewValue;
	 	} 
	 	public void setNextCol (ColNode theNewNextCol) 
	 	{ 
	 		nextCol = theNewNextCol;
	 	} 
	 	private int colNumber; 
	 	private ColNode nextCol; 
	 	private int value; 
}