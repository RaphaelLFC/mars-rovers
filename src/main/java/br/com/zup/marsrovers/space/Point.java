package br.com.zup.marsrovers.space;

public class Point {

	private static final int ONE = 1;

	private int location;
  
	public Point(int location) {
		this.location = location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public int getLocation() {
		return this.location;
	}

	public int getForward() {
		return this.location + ONE;
	}

	public int getBackward() {
		return this.location - ONE;
	}
}
