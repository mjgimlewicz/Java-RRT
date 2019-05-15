package rrt;
import ij.ImageJ;

public class Map {
	
	private int tileSize;
	
	private int nodeListLength;
	
	private Node[] nodeList;
	
	private ImageJ occupancyGrid;
	
	public Node[] getNodeList() {
		return nodeList;
	}
	
	public int getNodeListLength() {
		return nodeListLength;
	}
	
	public ImageJ getOccupancyGrid() {
		return occupancyGrid;
	}
	
	private int generateNodeID(final int x, final int y) {
		return -1;
	}
	
	private ImageJ image(ImageJ im) {
		return null;
	}
	
}
