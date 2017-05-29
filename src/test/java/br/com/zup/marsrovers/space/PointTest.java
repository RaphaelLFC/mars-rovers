package br.com.zup.marsrovers.rover;

import br.com.zup.marsrovers.space.Point;
import junit.framework.Assert;
import junit.framework.TestCase;

public class PointTest extends TestCase {

	public void testPoint() {
		Point p1 = new Point(1);
		Assert.assertEquals(1, p1.getLocation());
	}

	public void testSetLocation() {
		Point p1 = new Point(1);
		p1.setLocation(4);
		Assert.assertEquals(4, p1.getLocation());
	}

	public void testGetLocation() {
		Point p1 = new Point(1);
		Assert.assertEquals(1, p1.getLocation());
	}

	public void testGetForward() {
		Point p1 = new Point(1);
		Assert.assertEquals(2, p1.getForward());
	}

	public void testGetBackward() {
		Point p1 = new Point(1);
		Assert.assertEquals(0, p1.getBackward());
	}

}
