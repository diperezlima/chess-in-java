package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		InicialSetup();
	}
	
	public ChessPiece[][] getPieces() { // array os piece corresponding to the match
	ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
	for (int i = 0; i < board.getRows(); i++) {
		for (int j = 0; j < board.getColumns(); j++) {
			mat[i][j] = (ChessPiece) board.piece(i, j);
		}
	}
	return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {//method to set a piece on the board
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}//place created piece on board considering chess positions
	
	private void InicialSetup() { //method to iniciate the match putting them on the board
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}//inicial setup updated to placeNewPiece method

}
