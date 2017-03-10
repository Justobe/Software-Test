package softwareTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	private Triangle triangle = new Triangle();

	@Test
	public void testCheckTriangle() {
		assertEquals(false, triangle.checkTriangle(1, 2, 3));
		assertEquals(true, triangle.checkTriangle(2, 2, 3));
	}

	@Test
	public void testCheckEquilateral() {
		assertEquals(false, triangle.checkEquilateral(2, 2, 3));
		assertEquals(true, triangle.checkEquilateral(2, 2, 2));
	}

	@Test
	public void testCheckIsosceles() {
		assertEquals(true, triangle.checkIsosceles(2, 2, 3));
		assertEquals(true, triangle.checkIsosceles(3, 3, 3));
		assertEquals(false, triangle.checkIsosceles(4, 7, 9));
		assertEquals(false, triangle.checkIsosceles(1, 2, 3));
		
	}

	@Test
	public void testCheckScalene() {
		assertEquals(true, triangle.checkScalene(2, 3, 4));
		assertEquals(false, triangle.checkScalene(3, 3, 3));
		assertEquals(false, triangle.checkScalene(1, 2, 3));
		assertEquals(false, triangle.checkScalene(4, 9, 9));
	}

}
