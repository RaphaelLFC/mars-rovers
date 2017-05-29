package br.com.zup.marsrovers.space;

public class Orientation {
	public static final String NORTH = "N";
	public static final String SOUTH = "S";
	public static final String EAST = "E";
	public static final String WEST = "W";

	private String orientation;

	public Orientation() {
		this.orientation = Orientation.NORTH;
	}

	public void setOrientation(String dir){
		this.orientation = dir;
	}
	
	public String getOrientation(){
		return this.orientation;
	}

	public void turnRight(){
		if (isNorth()) {
			this.orientation = Orientation.EAST;
		} else if (isEast()) {
			this.orientation = Orientation.SOUTH;
		} else if (isSouth()) {
			this.orientation = Orientation.WEST;
		} else {
			this.orientation = Orientation.NORTH;
		}
	}

	public void turnLeft(){
		if (isNorth()) {
			this.orientation = Orientation.WEST;
		} else if (isWest()) {
			this.orientation = Orientation.SOUTH;
		} else if (isSouth()) {
			this.orientation = Orientation.EAST;
		} else {
			this.orientation = Orientation.NORTH;
		}
	}
	
	public boolean isNorth(){
		return Orientation.NORTH.equals(orientation);
	}

	public boolean isSouth(){
		return Orientation.SOUTH.equals(orientation);	
	}

	public boolean isEast(){
		return Orientation.EAST.equals(orientation);
	}

	public boolean isWest(){
		return Orientation.WEST.equals(orientation);
	}

	@Override
	public String toString(){
		return orientation;
	}
}
