package rrt;

public class Node {
	
	private Node north;
	
	private Node south;
	
	private Node east;
	
	private Node west;
	
	private int id;
	
	public Node(int id) {
		this.id = id;
	}
	
	public Node getNorth() {
		return north;
	}
	
	public Node getSouth() {
		return south;
	}
	
	public Node getEast() {
		return east;
	}
	
	public Node getWest() {
		return west;
	}
	
	public void setNorth(Node node) {
		north = node;
	}
	
	public void setSouth(Node node) {
		south = node;
	}
	
	public void setEast(Node node) {
		east = node;
	}
	
	public void setWest(Node node) {
		west = node;
	}
	
	public int getID() {
		return id;
	}
	
}
