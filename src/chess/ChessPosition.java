package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) { //comparison to chars are accepted - so column is between 'a' and 'h'
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a'); // defines the rows/columns as 'letter''number'
	} //we can sum or subtract chars to get ints as result ('b' - 'a' = 1)
	// since there are 8 columns and array starts as 0, first position = 8 - 0, second 8 - 1...
	//for the same reasons applied to the rows
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	} //converts the position for columns first, rows second (a1, b2, c7, etc.)
	//casting needed because the initial arguments are int
	@Override
	public String toString() {
		return "" + column + row; //"" just for concatenate reasons
	}
	
	

}
