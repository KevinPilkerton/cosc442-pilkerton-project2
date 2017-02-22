package edu.towson.cis.cosc442.project2.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest {
	/** Declaring necessary test objects for {@link Point} */
	Point p1;
	
	/**
	 * Initializes the necessary test objects for the test cases to use.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		p1 = new Point(2.0, 5.0);
	}

	/**
	 * Test for the getX() method of the {@link Point} class.
	 */
	@Test
	public void testGetX() {
		assertEquals(2.0, p1.getX(), 0.0);
	}
	
	/**
	 * Test for the getX() method of the {@link Point} class.
	 */
	@Test
	public void testGetY() {
		assertEquals(5.0, p1.getY(), 0.0);
	}

	/**
	 * Cleans up test objects after a test case is executed.
	 */
	@After
	public void tearDown() throws Exception {
		p1 = null;
	}
}
