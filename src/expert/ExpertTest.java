package expert;

import static org.junit.Assert.*;


public class ExpertTest {

	@org.junit.Test
	public void testAdd() {
		assertEquals(3, ExpertMain.add(1, 2));
	}
	
	@org.junit.Test
	public void testMinus() {
		assertEquals(3, ExpertMain.minus(1, 2));
	}
}
