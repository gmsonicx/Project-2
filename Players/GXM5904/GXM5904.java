package Players.GXM5904;
import java.util.*;

import Interface.Coordinate;
import Interface.PlayerModule;
import Interface.PlayerMove;

public class GXM5904 implements PlayerModule {

	public GXM5904() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	int playerId;
	int numWalls;
	Map<Integer, Coordinate> playerHomes;

	
	
	@Override
	public void init(Engine.Logger logs, int playerId, int numWalls,
			Map<Integer, Coordinate> playerHomes) {
		// TODO Auto-generated method stub
		if (playerId > 4){
			this.playerId = 4;
		}
		else if (playerId < 1){
			this.playerId = 1;
		}
		else{
			this.playerId = playerId;
		}
		this.numWalls = numWalls;
		this.playerHomes = playerHomes;
		
	}
	@Override
	public void lastMove(PlayerMove m) {
		// TODO Auto-generated method stub
		playerHomes.remove(m.getPlayerId(), m.getStart());
		playerHomes.put(m.getPlayerId(), m.getEnd());
		System.out.println("in lastMove... " + m.toString());
	}
	@Override
	public Set<PlayerMove> allPossibleMoves() {
		// TODO Auto-generated method stub
		Coordinate c = playerHomes.get(playerId);
		Set<PlayerMove> j = (Set<PlayerMove>) new HashSet<PlayerMove>();
		if (c.getRow() > 0 ){
			Coordinate eastCoor = new Coordinate(c.getRow()-1, c.getCol());
			PlayerMove eastMove = new PlayerMove(playerId, true, c, eastCoor);
			j.add(eastMove);
		}
		if (c.getRow() < 8){
			Coordinate westCoor = new Coordinate(c.getRow()+1, c.getCol());
			PlayerMove westMove = new PlayerMove(playerId, true, c, westCoor);
			j.add(westMove);
		}
		if (c.getCol() > 0){
			Coordinate southCoor = new Coordinate(c.getRow(), c.getCol()-1);
			PlayerMove southMove = new PlayerMove(playerId, true, c, southCoor);
			j.add(southMove);
		}
		if (c.getCol() < 8){
			Coordinate northCoor = new Coordinate(c.getRow(), c.getCol()+1);
			PlayerMove northMove = new PlayerMove(playerId, true, c, northCoor);
			j.add(northMove);
		}
		return j;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return playerId;
	}

	@Override
	public Set<Coordinate> getNeighbors(Coordinate c) {
		// TODO Auto-generated method stub
		Set<Coordinate> j = (Set<Coordinate>) new HashSet<Coordinate>();
		if (c.getRow() != 0 ){
			Coordinate eastCoor = new Coordinate(c.getRow()-1, c.getCol());
			j.add(eastCoor);
		}
		if (c.getRow() != 8){
			Coordinate westCoor = new Coordinate(c.getRow()+1, c.getCol());
			j.add(westCoor);
		}
		if (c.getCol() != 0){
			Coordinate southCoor = new Coordinate(c.getRow(), c.getCol()-1);
			j.add(southCoor);
		}
		if (c.getCol() != 8){
			Coordinate northCoor = new Coordinate(c.getRow(), c.getCol()+1);
			j.add(northCoor);
		}
		return j;
	}

	@Override
	public Coordinate getPlayerLocation(int playerId) {
		// TODO Auto-generated method stub
		return playerHomes.get(playerId);
		
	}

	@Override
	public Map<Integer, Coordinate> getPlayerLocations() {
		// TODO Auto-generated method stub
		return playerHomes;
	}

	@Override
	public List<Coordinate> getShortestPath(Coordinate start, Coordinate end) {
		// TODO Auto-generated method stub
		LinkedList<Coordinate> path = new LinkedList<Coordinate>();
		if (start.equals(end)){
			path.add(end);
		}
		else if (getNeighbors(start).contains(end)){
			path.add(start);
			path.add(end);
		}
		else if (!path.contains(start)){
			for (Coordinate a: getNeighbors(start)){
				if (a.equals(end)){
					path.add(start);
					path.add(a);
					path.add(end);
				}
				else{
					//getShortestPath(a, end);
					}
				}
			}
			
		return path;
	}

	@Override
	public int getWallsRemaining(int playerID) {
		// TODO Auto-generated method stub
		return numWalls;
	}


	@Override
	public PlayerMove move() {
		// TODO Auto-generated method stub
		playerHomes.get(playerId);
	}

	@Override
	public void playerInvalidated(int playerId) {
		// TODO Auto-generated method stub
		
	}



}
