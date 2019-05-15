package rrt;

import java.util.ArrayList;

public interface TraversalInterface {
	
	public boolean isGoal(Node goal, final int id);
	public boolean isVisited(Node node);
	public void enqueue(Node node);
	public Node dequeue();
	public Node[] getNeighbors(Node node, Node[] neighbors);
	public Node[] getParents(Node node);
	public void recurBFS(final int goalID);
	public void runBFS(final int startID, final int goalID);
	public ArrayList<Node> getFrontierAtDepth(final int startID, final int depth);
	public void drawTraversal(final int goalID);
	public void clearQueue();
	public String tracePath(Node node);
	
	
}
