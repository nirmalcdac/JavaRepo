import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class PublisherTest 
{
	ScoreBoard sb1;
	TVController tv1;
	int newscore=0;
	int oldscore=10;
	int finalscore;
	@Before
	public void setUp() throws Exception 
	{
		sb1=new ScoreBoard();	
		tv1=new TVController();
	}
	@Test
	public void test() 
	{
		assertEquals(1,sb1.update());
		finalscore=oldscore+newscore;
		assertEquals(1,tv1.update(finalscore));
	}
}