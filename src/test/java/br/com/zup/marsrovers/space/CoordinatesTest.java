package br.com.zup.marsrovers.space;

import br.com.zup.marsrovers.space.Coordinates;
import junit.framework.Assert;
import junit.framework.TestCase;

public class CoordinatesTest extends TestCase {

	public void testCoordinates() {
		Coordinates coord1 = new Coordinates();
		Assert.assertEquals(0, coord1.getX());
		Assert.assertEquals(0, coord1.getY());
	}

	public void testCoordinatesIntInt() {
		Coordinates coord = new Coordinates(5, 5);
		Assert.assertEquals(5, coord.getX());
		Assert.assertEquals(5, coord.getY());
	}

	public void testGetX() {
		Coordinates coord = new Coordinates(1, 2);
		Assert.assertEquals(1, coord.getX());
	}

	public void testGetY() {
		Coordinates coord = new Coordinates(1, 2);
		Assert.assertEquals(2, coord.getY());
	}

	public void testSetX() {
		Coordinates coord = new Coordinates(1, 2);
		coord.setX(3);
		Assert.assertEquals(3, coord.getX());
	}

	public void testSetY() {
		Coordinates coord = new Coordinates(1, 2);
		coord.setY(4);
		Assert.assertEquals(4, coord.getY());
	}

	public void testToString() {
		Coordinates coord = new Coordinates(1, 2);
		Assert.assertEquals("1 2 ", coord.toString());
		coord.setX(3);
		coord.setY(4);
		Assert.assertEquals("3 4 ", coord.toString());
	}

}
