package chess.pieces;

import boardgame.Board;
import boardgame.Position;
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
		Position p = new Position(0, 0);
		
		//acima
		p.setValues(position.getRow() - 1, position.getColumn());
		while(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//abaixo
		p.setValues(position.getRow() + 1, position.getColumn());
		while(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//esquerda
		p.setValues(position.getRow(), position.getColumn() - 1);
		while(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}
		if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//direita
		p.setValues(position.getRow(), position.getColumn() + 1);
		while(getBorard().positionExists(p) && !getBorard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
		if(getBorard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		return mat;
	}
	
}
