package Interface;

public class PlayerMove extends Object{
	public int playerId;
	public boolean move;
	public Coordinate start;
	public Coordinate end;
	public PlayerMove(int playerId, boolean move, Coordinate start, Coordinate end){
		this.playerId = playerId;
		this.move = move;
		this.start = start;
		this.end = end;
	}
	
	
	public Coordinate getEnd(){
		return end;
	}
	public int getPlayerId(){
		return playerId;
	}
	public int getEndCol(){
		return end.getCol();
	}
	public int getEndRow(){
		return end.getRow();
	}
	public Coordinate getStart(){
		return start;
	}
	public int getStartCol(){
		return start.getCol();
	}
	public int getStartRow(){
		return start.getRow();
	}
	public int hashCode(){
		return end.hashCode();
	}
	public boolean isMove(){
		return move;
	}
	public String toString(){
		return "Start: " + start.toString() + " End: " + end.toString();
	}
}
