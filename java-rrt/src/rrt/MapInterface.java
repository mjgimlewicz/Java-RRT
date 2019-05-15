package rrt;

import ij.ImageJ;

public interface MapInterface {
	
	public Node[] getNodeList();
	public int getNodeListLength();
	public int generateNodeID(final int x, final int y);
	public ImageJ getOccupancyGrid();
	
}
