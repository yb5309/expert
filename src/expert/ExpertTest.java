package expert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ExpertTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test1() {
		assertEquals(3, ExpertMain.add(1, 2));
		assertEquals(-1, ExpertMain.minus(1, 2));
	}

	@Test
	void test2() {
		assertEquals(3, ExpertMain.add(1, 2));
		assertEquals(3, ExpertMain.minus(1, 2));
	}
}
