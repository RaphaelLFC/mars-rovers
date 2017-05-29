package br.com.zup.marsrovers.rover;

import br.com.zup.marsrovers.rover.Rover;
import br.com.zup.marsrovers.space.Coordinates;
import br.com.zup.marsrovers.space.Orientation;
import junit.framework.Assert;
import junit.framework.TestCase;

public class RoverTest extends TestCase {

	public void testGetLocation() {
		Rover rover = new Rover();
		rover.process("5 5", "1 2 N", "LMLMLMLMM");
		Assert.assertEquals("1 3 N", rover.getLocation());
	}

	public void testMove() {
		Rover rover = new Rover();
		rover.process("5 5", "1 2 N", "LMLMLMLMM");
		rover.setOrientation(Orientation.SOUTH);
		rover.move();
		rover.move();
		Assert.assertEquals("1 1 S", rover.getLocation());
	}

	public void testProcess() {
		Rover rover = new Rover();
		rover.process("5 5", "1 2 N", "LMLMLMLMM");
		Assert.assertEquals("1 3 N", rover.getLocation());

		rover.process("5 5", "3 3 E", "MMRMMRMRRM");
		Assert.assertEquals("5 1 E", rover.getLocation());
	}
}
