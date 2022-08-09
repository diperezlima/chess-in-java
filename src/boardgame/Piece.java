package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board; // no need to add to constructor since position starts as null
	}

	protected Board getBoard() { // protected since it's for internal - itself and Piece classes - use only (so,
									// not public)
		return board;
	}

	// no setBoard since the user can't just set where a piece is on the board
	public abstract boolean[][] possibleMoves(); // abstract method to set possible moves for each piece

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()]; // method that uses the abstract method
																			// returning to possible general moves
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves(); // matrix to run and verify if there are any possible move
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
