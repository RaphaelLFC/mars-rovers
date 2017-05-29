package br.com.zup.marsrovers.spaceTest;

import br.com.zup.marsrovers.space.Orientation;
import junit.framework.Assert;
import junit.framework.TestCase;

public class OrientationTest extends TestCase {

	public void testOrientation() {
		Orientation orien = new Orientation();
		Assert.assertEquals(Orientation.NORTH, orien.getOrientation());
	}

	public void testSetOrientation() {
		Orientation orien = new Orientation();
		orien.setOrientation(Orientation.SOUTH);
		Assert.assertEquals(Orientation.SOUTH, orien.getOrientation());
	}

	public void testGetOrientation() {
		Orientation orien = new Orientation();
		Assert.assertEquals(Orientation.NORTH, orien.getOrientation());
		orien.setOrientation(Orientation.SOUTH);
		Assert.assertEquals(Orientation.SOUTH, orien.getOrientation());
	}

	public void testTurnRight() {
		Orientation orien = new Orientation();
		orien.turnRight();
		Assert.assertEquals(Orientation.EAST, orien.getOrientation());
		orien.turnRight();
		Assert.assertEquals(Orientation.SOUTH, orien.getOrientation());
	}

	public void testTurnLeft() {
		Orientation orien = new Orientation();
		orien.turnLeft();
		Assert.assertEquals(Orientation.WEST, orien.getOrientation());
		orien.turnLeft();
		Assert.assertEquals(Orientation.SOUTH, orien.getOrientation());
	}

	public void testIsNorth() {
		Orientation orien = new Orientation();
		Assert.assertEquals(true, orien.isNorth());
	}

	public void testIsSouth() {
		Orientation orien = new Orientation();
		orien.setOrientation(Orientation.SOUTH);
		Assert.assertEquals(true, orien.isSouth());
	}

	public void testIsEast() {
		Orientation orien = new Orientation();
		orien.setOrientation(Orientation.EAST);
		Assert.assertEquals(true, orien.isEast());
	}

	public void testIsWest() {
		Orientation orien = new Orientation();
		orien.setOrientation(Orientation.WEST);
		Assert.assertEquals(true, orien.isWest());
	}

	public void testToString() {
		Orientation orien = new Orientation();
		Assert.assertEquals(Orientation.NORTH, orien.toString());
	}

}
