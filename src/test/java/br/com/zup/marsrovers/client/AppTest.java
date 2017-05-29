package br.com.zup.marsrovers.client;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import br.com.zup.marsrovers.rover.Rover;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    public void testMain() {
		Rover rover = new Rover();
		rover.process("5 5", "1 2 N", "LMLMLMLMM");
		Assert.assertEquals("1 3 N", rover.getLocation());
		
		rover.process("5 5", "3 3 E", "MMRMMRMRRM");
		Assert.assertEquals("5 1 E", rover.getLocation());
	}
}
