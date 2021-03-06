package rrt;

import java.util.ArrayList;

import ij.ImageJ;

public class Traversal implements TraversalInterface {

	/**
	 * 
	 */
	private Map map;
	
	/**
	 * 
	 */
	private ImageJ occupancyGrid;
	
	/**
	 * Stores boolean values for each node (indexed by ID)
	 * indicating if it has been visited
	 */
	private boolean[] visitedNodes;
	
	/**
	 * Stores the ID of each node's parent (indexed by ID)
	 */
	private int[] parents;
	
	public Traversal(Map map) {
		this.map      = map;
		visitedNodes  = new boolean[map.getNodeListLength()];
		parents       = new int[map.getNodeListLength()];
		occupancyGrid = map.getOccupancyGrid();
	}
	
	@Override
	public boolean isGoal(Node node, int id) {
		return node.getID() == id;
	}

	@Override
	public boolean isVisited(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enqueue(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node[] getNeighbors(Node node, Node[] neighbors) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node[] getParents(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	private void drawTraversal(int goalID) {
		// TODO Auto-generated method stub
		
	}

	private void clearQueue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recurBFS(int goalID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runBFS(int startID, int goalID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Node> getFrontierAtDepth(int startID, int depth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String tracePath(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

}
