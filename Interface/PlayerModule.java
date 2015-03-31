package Interface;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public interface PlayerModule {
	public Set<PlayerMove> allPossibleMoves();
	default void dumpGampState() {
	}
	public int getID();
	public Set<Coordinate> getNeighbors(Coordinate c);
	public Coordinate getPlayerLocation(int playerId);
	public Map<Integer,Coordinate> getPlayerLocations();
	public List<Coordinate> getShortestPath(Coordinate start, Coordinate end);
	public int getWallsRemaining(int playerID);
	public void init(Logger logger, int playerId, int numWalls, Map<Integer,Coordinate> playerHomes);
	public void lastMove(PlayerMove m);
	public PlayerMove move();
	public void playerInvalidated(int playerId);
}
