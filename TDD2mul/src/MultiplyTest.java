import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MultiplyTest {
	Multiply multiply;

	@Before
	public void setUp() throws Exception {
		multiply = new Multiply();
	}

	@Test
	public void test() {
		assertEquals(9, multiply.mul(3, 3));
		assertEquals(6, multiply.add(3, 3));
	}
}
