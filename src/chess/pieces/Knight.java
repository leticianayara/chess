package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	
	public Knight(Board borard, Color color) {
		super(borard, color);
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBorard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMovies() {
		boolean[][] mat = new boolean[getBorard().getRows()][getBorard().getColumns()];

		Position p = new Position(0, 0);

		p.setValues(position.getRow() - 1, position.getColumn() - 2);
		if (getBorard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() - 2, position.getColumn() - 1);
		if (getBorard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() -2 , position.getColumn() + 1);
		if (getBorard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() - 1, position.getColumn() + 2);
		if (getBorard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() + 1, position.getColumn() + 2);
		if (getBorard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() + 2 , position.getColumn() + 1);
		if (getBorard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// sw
		p.setValues(position.getRow() + 2, position.getColumn() - 1);
		if (getBorard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// se
		p.setValues(position.getRow() + 1, position.getColumn() - 2);
		if (getBorard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}
	@Override
	public String toString() {
		return "N";
	}

	
}
