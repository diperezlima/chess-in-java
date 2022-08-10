package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {//abstract method implemented - all false at the moment
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		//upwards
		p.setValues(position.getRow() - 1, position.getColumn()); //row -1 to move upwards on the array
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //limit possible positions on the array and check method thereIsAPiece on position p
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1); //makes the check for all empty positions upwards
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//leftwards
		p.setValues(position.getRow(), position.getColumn() - 1); //column -1 to move leftwards on the array
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //limit possible positions on the array and check method thereIsAPiece on position p
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);; //makes the check for all empty positions leftwards
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//righwards
		p.setValues(position.getRow(), position.getColumn() + 1); //column -1 to move leftwards on the array
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //limit possible positions on the array and check method thereIsAPiece on position p
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);; //makes the check for all empty positions leftwards
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//downwards
		p.setValues(position.getRow() + 1, position.getColumn()); //row -1 to move upwards on the array
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //limit possible positions on the array and check method thereIsAPiece on position p
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1); //makes the check for all empty positions upwards
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}

}
