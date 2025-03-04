package boardgame;

public class Piece {
	
	protected Position position;	
	private Board borard;

	public Piece(Board borard) {
		this.borard = borard;
		this.position = null;
	}
	
	protected Board getBorard() {
		return borard;
	}

	public Piece[][] possibleMovie(){
		return null;
	}
	
	public boolean possibleMove(Position position) {
		return false;
	}

	public boolean isThereAnyPossible() {
		return false;
	}
}
