package test.java;

import static org.junit.Assert.*;

import main.java.ExpertMain;


public class TestExpertMain {

	@org.junit.Test
	public void testAdd() {
		assertEquals(3, ExpertMain.add(1, 2));
	}
	
	@org.junit.Test
	public void testMinus() {
		assertEquals(-1, ExpertMain.minus(1, 2));
	}
}
