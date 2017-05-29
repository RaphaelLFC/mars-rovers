package br.com.zup.marsrovers.space;

import br.com.zup.marsrovers.space.Point;

public class Coordinates {

	public Point x, y;
	
	public Coordinates() {
		this.x = new Point(0);
		this.y = new Point(0);
	}

	public Coordinates(int x, int y){
		this.x = new Point(x);
		this.y = new Point(y);
	}

	public int getX(){
		return this.x.getLocation();
	}

	public int getY(){
		return this.y.getLocation();
	}

	public void setX(int x){
		this.x.setLocation(x);
	}

	public void setY(int y){
		this.y.setLocation(y);
	}

	@Override
	public String toString(){
		return this.x.getLocation() + " " + this.y.getLocation() + " ";
	}
}
