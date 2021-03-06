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
		return (int) (Math.pow(2, (double) x) + Math.pow(3, (double) y));
	}
	
	private ImageJ image(ImageJ im) {
		return null;
	}
	
}
