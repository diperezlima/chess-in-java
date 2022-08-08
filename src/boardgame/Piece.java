package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board; // no need to add to constructor since position starts as null
	}

	protected Board getBoard() { //protected since it's for internal - itself and Piece classes - use only (so, not public)
		return board;
	}
	//no setBoard since the user can't just set where a piece is on the board
	
	
	
	
	

}
