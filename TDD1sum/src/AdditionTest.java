import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	Addition addition;

	@Before
	public void setUp() throws Exception {
		addition = new Addition();
	}

	@Test
	public void test() {
		assertEquals(8, addition.add(5, 3));
	}

}