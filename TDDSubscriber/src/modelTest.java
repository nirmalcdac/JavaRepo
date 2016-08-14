import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class modelTest {
	Model Model1;

	@Before
	public void setUp() throws Exception {
		Model1 = new Model(1);
	}

	@Test
	public void test() {
		assertEquals(1, Model1.getscore());
		Model1.setscore(2);
		assertEquals(1, Model1.getscore());

		// assertEquals(1,Model1.not());
	}

}
