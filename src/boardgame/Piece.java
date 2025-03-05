package boardgame;

public abstract class Piece {
	
	protected Position position;	
	private Board borard;

	public Piece(Board borard) {
		this.borard = borard;
		this.position = null;
	}
	
	protected Board getBorard() {
		return borard;
	}

	public abstract boolean[][] possibleMovies();
	
	public boolean possibleMove(Position position) {
		return possibleMovies()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossible() {
		boolean [][] mat = possibleMovies();
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat.length;j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
