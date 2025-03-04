package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board borard, Color color) {
		super(borard);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
	
}
