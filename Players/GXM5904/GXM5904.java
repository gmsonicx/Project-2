package Players.GXM5904;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

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
		return null;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return playerId;
	}

	@Override
	public Set<Coordinate> getNeighbors(Coordinate c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coordinate getPlayerLocation(int playerId) {
		// TODO Auto-generated method stub
		return playerHomes.get(playerId);
		
	}

	@Override
	public Map<Integer, Coordinate> getPlayerLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coordinate> getShortestPath(Coordinate start, Coordinate end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWallsRemaining(int playerID) {
		// TODO Auto-generated method stub
		return numWalls;
	}


	@Override
	public PlayerMove move() {
		// TODO Auto-generated method stub
		if (PlayerMisMove())
	}

	@Override
	public void playerInvalidated(int playerId) {
		// TODO Auto-generated method stub
		
	}



}
