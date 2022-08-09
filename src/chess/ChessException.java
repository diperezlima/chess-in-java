package chess;

import boardgame.BoardException;

public class ChessException extends BoardException { //helps throwing exception, since ChessException will be a type of BoardException
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}

}
