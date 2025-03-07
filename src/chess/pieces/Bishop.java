package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board borard, Color color) {
		super(borard, color);
	}

	@Override
	public String toString() {
		return "B";
	}


	@Override
	public boolean[][] possibleMovies() {
		boolean[][] mat = new boolean[getBorard().getRows()][getBorard().getColumns()];

		Position p = new Position(0, 0);

		//ne
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		while(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() - 1);
		}
		if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//nw
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		while(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() + 1);
		}
		if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//sw
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		while(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() - 1);
		}
		if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//se
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		while(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() + 1);
		}
		if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		

		return mat;
	}

}
