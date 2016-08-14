class RowNode {
	public RowNode(int initRowNumber, ColNode initNextCol, RowNode initNextRow) {
		rowNumber = initRowNumber;
		nextCol = initNextCol;
		nextRow = initNextRow;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public ColNode getNextCol() {
		return nextCol;
	}

	public RowNode getNextRow() {
		return nextRow;
	}

	public void setNextCol(ColNode theNewNextCol) {
		nextCol = theNewNextCol;
	}

	public void setNextRow(RowNode theNewNextRow) {
		nextRow = theNewNextRow;
	}

	private int rowNumber;
	private ColNode nextCol;
	private RowNode nextRow;
}