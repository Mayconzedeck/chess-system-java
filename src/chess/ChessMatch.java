package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	public ChessPiece[][] getpieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows();i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placepiece(piece, new ChessPosition(column, row).toPOsition());
		
	}
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Collor.WHITE));
		placeNewPiece('e', 8, new King(board, Collor.BLACK ));
		placeNewPiece('e', 1,new King(board, Collor.WHITE));
	}
}
