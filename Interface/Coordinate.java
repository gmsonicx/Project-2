package Interface;

public class Coordinate extends Object{
	
	public static int BOARD_DIM;
	public int row;
	public int col;
	
	public Coordinate(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public Coordinate(Coordinate coordinate){
		
	}
	
	@Override
	public boolean equals(Object obj){
		if (((Coordinate) obj).getCol() == col && ((Coordinate) obj).getRow() == row){
			return true;
			}
		return false;
	}
	
	public int getCol(){
		return col;
	}
	
	public int getRow(){
		return row;
	}
	
	public int hashCode(){
		return 31*row + col;
	}
	
	public String toString(){
		return row + ", " + col;
	}
}
