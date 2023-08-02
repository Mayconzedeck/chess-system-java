package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Collor;

public class Rook extends ChessPiece {

	public Rook(Board board, Collor collor) {
		super(board, collor);
	}

	@Override
	public String toString() {
		return "R";
	}
}
