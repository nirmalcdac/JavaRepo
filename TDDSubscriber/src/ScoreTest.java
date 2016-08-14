import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoreTest {
	Score score = new Score();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
		score.setscore(2);
		assertEquals(100, Mobile.getscore());
		assertEquals(100, TV.getscore());
	}

}
