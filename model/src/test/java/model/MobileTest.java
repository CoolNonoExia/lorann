package model;

import static org.junit.Assert.*;

import java.awt.Image;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.pawns.Mobile;

public class MobileTest {
	private Mobile mobile;
	private Position position;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		position = new Position(20, 25, 52, 57);
		mobile = new Mobile(Direction.RIGHT, position, 3, new Image[3]);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDirection() {
		Direction expected = Direction.RIGHT;
		assertEquals(expected, mobile.getDirection());
	}

	@Test
	public void testGetPosition() {
		Position expected = position;
		assertEquals(expected, mobile.getPosition());
	}

	@Test
	public void testGetSpeed() {
		int expected = 3;
		assertEquals(expected, mobile.getSpeed());
	}
	
	@Test
	public void testGetImage() {
		Image[] expected = new Image[3];
		assertEquals(expected, mobile.getImage());
	}

}
