package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	@Test
	public void validTriangleShouldHavePositiveSide() {
		assertTrue(new Triangle(2,4,5).isValid());
		assertFalse(new Triangle(-2,4,5).isValid());
		assertFalse(new Triangle(-1,-1,-1).isValid());
	}
	@Test
	public void ValidTriangleShouldHaveSTGTOS() {
		assertTrue(new Triangle(1,1,1).isValid());
		assertFalse(new Triangle(1,1,3).isValid());
		assertFalse(new Triangle(3,1,1).isValid());
		assertFalse(new Triangle(1,3,1).isValid());
	}

	@Test
	public void isIsoscelesTriangle() {

	}
	
	@Test
	public void isEquilateralTriangle() {

	}
}
