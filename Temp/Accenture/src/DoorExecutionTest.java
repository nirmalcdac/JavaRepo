/**
 * @author NIRMAL
 *
 */
import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

public class DoorExecutionTest 
{
	@Test
	public void test()
	{
		int n = 100;
		boolean[] doors = new boolean[n];
		assertEquals(doors,DoorExecution.executePass(doors,n));
	}

}
