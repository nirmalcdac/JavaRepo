class TestPriority implements Runnable
{
	long click=0;
	Thread t;
	private volatile boolean running = true;
	public TestPriority (int p)
	{
		t=new Thread(this);
		t.setPriority(p);
	}
	public void run()
	{
		while (running)
		{
			click++;
		}
	}
	public void stop()
	{
		running=false;
	}
	public void start()
	{
		t.start();
	}
}
class PracticeThreadPriority
{
	public static void main(String [] args)
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		TestPriority high=new TestPriority(Thread.NORM_PRIORITY + 2);
		TestPriority low=new TestPriority(Thread.NORM_PRIORITY - 2);
		low.start();
		high.start();
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread interrupted");
		}
		low.stop();
		high.stop();
		try
		{
			high.t.join();
			low.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception caught");
		}
		System.out.println("Low Priority Thread " +low.click);
		System.out.println("High Priority Thread " +high.click);
	}
}