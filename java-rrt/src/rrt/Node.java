package rrt;

public class Node {
	
	/**
	 * The north neighboring pixel in an image
	 */
	private Node north;
	
	/**
	 * The south neighboring pixel in an image
	 */
	private Node south;
	
	/**
	 * The east neighboring pixel in an image
	 */
	private Node east;
	
	/**
	 * The west neighboring pixel in an image
	 */
	private Node west;
	
	/**
	 * The unique ID of the current pixel
	 */
	private int id;
	
	/**
	 * Creates a new Node given a unique ID
	 * @param id
	 */
	public Node(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the north neighbor (if any) of the current node
	 * @return the north neighboring node (if any) of the current node
	 */
	public Node getNorth() {
		return north;
	}
	
	/**
	 * Gets the south neighbor (if any) of the current node
	 * @return the south neighboring node (if any) of the current node
	 */
	public Node getSouth() {
		return south;
	}
	
	/**
	 * Gets the east neighbor (if any) of the current node
	 * @return the east neighboring node (if any) of the current node
	 */
	public Node getEast() {
		return east;
	}
	
	/**
	 * Gets the west neighbor (if any) of the current node
	 * @return the west neighboring node (if any) of the current node
	 */
	public Node getWest() {
		return west;
	}
	
	/**
	 * Sets the north neighbor of the current node
	 * @param node
	 */
	public void setNorth(Node node) {
		north = node;
	}
	
	/**
	 * Sets the south neighbor of the current node
	 * @param node
	 */
	public void setSouth(Node node) {
		south = node;
	}
	
	/**
	 * Sets the east neighbor of the current node
	 * @param node
	 */
	public void setEast(Node node) {
		east = node;
	}
	
	/**
	 * Sets the west neighbor of the current node
	 * @param node
	 */
	public void setWest(Node node) {
		west = node;
	}
	
	/**
	 * Gets the unique ID of the current node
	 * @return the unique ID of the current node
	 */
	public int getID() {
		return id;
	}
	
}
