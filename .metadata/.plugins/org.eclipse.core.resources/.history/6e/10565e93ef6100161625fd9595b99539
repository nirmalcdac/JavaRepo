import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Sparse 
{ 
	 private RowNode head; // points to the header node of the first linked list 
	 private boolean first; // determines if first node is created or not 
	 public Sparse() 
	 { 
		 head = null; 
		 first = true; 
	 } 
	 public void enterSparse() throws IOException 
	 { 
		 BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
		 System.out.println("\nEnter -999 after last data entry to exit\n"); 
		 boolean done = false; 
		 do 
		 { 
			 System.out.println(); 
			 System.out.print("Enter row number -> "); 
			 int row = Integer.parseInt(input.readLine()); 
			 done = row == -999; 
			 if (!done) 
			 { 
				 System.out.print("Enter col number -> "); 
				 int col = Integer.parseInt(input.readLine()); 
				 System.out.print("Enter sparse value -> "); 
				 int val = Integer.parseInt(input.readLine()); 
				 if (first) 
				 { 
					 firstNode(val,row,col);
					 first = false; 
				 } 
				 else 
				 { 
					 insertNode(val,row,col); 
				 } 
			 } 
		 } 
		 while (!done); 
	 } 
	 public void firstNode(int value, int row, int col) 
	 { 
		 ColNode temp = new ColNode(value,col,null); 
		 head = new RowNode(row,temp,null); 
	 } 
	 public void insertNode(int value, int row, int col) 
	 { 
		 ColNode c1 = null, c2 = null, c3 = null; // used to create new col nodes 
		 RowNode r1 = null, r2 = null, r3 = null; // used to create new row nodes 
		 // create new column node with new value 
		 c1 = new ColNode(value,col,null); 
		 if (row < head.getRowNumber()) 
		// create new first header node if row is less than current first row 
		{ 
			 r1 = new RowNode(row,c1,head); 
			 head = r1; 
		} 
		else 
		{ 
			r2 = head; 
			while (r2 != null && row > r2.getRowNumber()) 
			// traverse to find the proper row location 
			{ 
				r3 = r2; 
				r2 = r2.getNextRow(); 
			} 
			if (r2 != null && row == r2.getRowNumber()) 
			// new node is inserted in an existing row 
			{ 
				c2 = r2.getNextCol(); 
				if (col < c2.getColNumber())
				// new node fits between header node and the first col node 
				{ 
					r2.setNextCol(c1); 
					c1.setNextCol(c2); 
				}	 
				else 
				{ 
					while (c2 != null && col > c2.getColNumber()) 
					// find proper column insertion position 
					{ 
						c3 = c2; 
						c2 = c2.getNextCol(); 
					} 
					c3.setNextCol(c1); 
					c1.setNextCol(c2); 
				} 
			} 
			else 
			{ 
				r1 = new RowNode(row,c1,r2); 
				r3.setNextRow(r1); 
			} 
		} 
	 } 
	 public void displaySparse() 
	 { 
		 System.out.println(); 
		 RowNode r = head; 
		 ColNode c = null; 
		 while (r != null) 
		 { 
			 c = r.getNextCol(); 
			 while (c != null) 
			 { 
				 int row = r.getRowNumber(); 
				 int col = c.getColNumber(); 
				 int val = c.getValue(); 
				 System.out.println("[" + row + "," + col + "] \t= " + val); 
				 c = c.getNextCol(); 
			 } 
			 r = r.getNextRow(); 
		 } 
	 } 
}