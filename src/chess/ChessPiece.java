package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {
	
	private Collor collor;

	public ChessPiece(Board board, Collor collor) {
		super(board);
		this.collor = collor;
	}

	public Collor getCollor() {
		return collor;
	}

}
