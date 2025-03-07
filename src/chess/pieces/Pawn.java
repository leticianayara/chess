package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
	
	private ChessMatch chessMatch;

	public Pawn(Board borard, Color color, ChessMatch chessMatch) {
		super(borard, color);
		this.chessMatch = chessMatch;
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
			
			//specialmove en passant white
			if(position.getRow() == 3) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if(getBorard().positionExists(left) && isThereOpponentPiece(left) && getBorard().piece(left) == chessMatch.getEnPassantVunerable()) {
					mat[left.getRow() - 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if(getBorard().positionExists(right) && isThereOpponentPiece(right) && getBorard().piece(right) == chessMatch.getEnPassantVunerable()) {
					mat[right.getRow() - 1][right.getColumn()] = true;
				}
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
			
			//specialmove en passant black
			if(position.getRow() == 4) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if(getBorard().positionExists(left) && isThereOpponentPiece(left) && getBorard().piece(left) == chessMatch.getEnPassantVunerable()) {
					mat[left.getRow() + 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if(getBorard().positionExists(right) && isThereOpponentPiece(right) && getBorard().piece(right) == chessMatch.getEnPassantVunerable()) {
					mat[right.getRow() + 1][right.getColumn()] = true;
				}
			}
		}
		
		return mat;
	}

	@Override
	public String toString() {
		return "P";
	}

	
}
