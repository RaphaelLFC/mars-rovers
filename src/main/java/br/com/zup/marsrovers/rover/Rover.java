package br.com.zup.marsrovers.rover;

import br.com.zup.marsrovers.space.Coordinates;
import br.com.zup.marsrovers.space.Orientation;
import br.com.zup.marsrovers.space.Plateau;

public class Rover extends Orientation{
	private Coordinates coord;
	private Plateau plateau;
	
	public Rover() {
		coord = new Coordinates();
	}

	public String getLocation() {
		return coord.toString() + toString();
	}

	public void move() {
		if (isNorth()) {
			if (plateau.containsCoordinates(new Coordinates(coord.x.getLocation(), coord.y.getForward()))) {
				coord.y.setLocation(coord.y.getForward());
			}
		} else if (isSouth()) {
			if (plateau.containsCoordinates(new Coordinates(coord.x.getLocation(), coord.y.getBackward()))) {
				coord.y.setLocation(coord.y.getBackward());
			}
		} else if (isWest()) {
			if (plateau.containsCoordinates(new Coordinates(coord.x.getBackward(), coord.y.getLocation()))) {
				coord.x.setLocation(coord.x.getBackward());
			}
		} else {
			if (plateau.containsCoordinates(new Coordinates(coord.x.getForward(), coord.y.getForward()))) {
				coord.x.setLocation(coord.x.getForward());
			}
		}
	}

	public void process(String input1, String input2, String mov) {

		String[] partsInput1 = input1.split(" ");
		plateau = new Plateau(Integer.parseInt(partsInput1[0]), Integer.parseInt(partsInput1[1]));

		String[] parts = input2.split(" ");
		coord.x.setLocation(Integer.parseInt(parts[0]));
		coord.y.setLocation(Integer.parseInt(parts[1]));

		setOrientation(parts[2]);

		String[] partsMov = mov.split("");
		int i = 1;

		while (i <= mov.length()) {
			if ("R".equals(partsMov[i])) {
				turnRight();
			} else if ("L".equals(partsMov[i])) {
				turnLeft();
			} else {
				move();
			}
			i++;
		}
	}
}