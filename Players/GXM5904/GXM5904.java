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

	@Override
	public Set<PlayerMove> allPossibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<Coordinate> getNeighbors(Coordinate c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coordinate getPlayerLocation(int playerId) {
		// TODO Auto-generated method stub
		return null;
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
		return 0;
	}

	@Override
	public void init(Logger logger, int playerId, int numWalls,
			Map<Integer, Coordinate> playerHomes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lastMove(PlayerMove m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PlayerMove move() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void playerInvalidated(int playerId) {
		// TODO Auto-generated method stub
		
	}

}
