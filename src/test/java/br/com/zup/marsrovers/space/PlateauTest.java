package br.com.zup.marsrovers.space;

import br.com.zup.marsrovers.space.Coordinates;
import br.com.zup.marsrovers.space.Plateau;
import junit.framework.Assert;
import junit.framework.TestCase;

public class PlateauTest extends TestCase {

	public void testContainsCoordinates() {
		Plateau plat = new Plateau(4, 5);
		Assert.assertEquals(true, plat.containsCoordinates(new Coordinates(4, 3)));
		Assert.assertEquals(false, plat.containsCoordinates(new Coordinates(6, 6)));
	}
}
