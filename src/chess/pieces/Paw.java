package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Paw extends ChessPiece {

	public Paw(Board borard, Color color) {
		super(borard, color);
	}

	@Override
	public boolean[][] possibleMovies() {

		boolean[][] mat = new boolean[getBorard().getRows()][getBorard().getColumns()];
		
		Position p = new Position(0, 0);
		
		if(getColor() == Color.WHITE) {
			p.setValues(position.getRow()-1, position.getColumn());
			if(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow()-2, position.getColumn());
			Position p2 = new Position(position.getRow() - 1, position.getColumn());
			if(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p) && 
					getBorard().positionExists(p2) && !getBorard().thereIsAPiece(p2) && 
					getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow()-1, position.getColumn() - 1);
			if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow()-1, position.getColumn() + 1);
			if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		} else {
			p.setValues(position.getRow()+1, position.getColumn());
			if(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow()+2, position.getColumn());
			Position p2 = new Position(position.getRow() + 1, position.getColumn());
			if(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p) && 
					getBorard().positionExists(p2) && !getBorard().thereIsAPiece(p2) && 
					getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow()+1, position.getColumn() - 1);
			if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow()+1, position.getColumn() + 1);
			if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		
		return mat;
	}

	@Override
	public String toString() {
		return "P";
	}

	
}
