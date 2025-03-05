package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board borard, Color color) {
		super(borard, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMovies() {
		boolean[][] mat = new boolean[getBorard().getRows()][getBorard().getColumns()];
		return mat;
	}
	
}
