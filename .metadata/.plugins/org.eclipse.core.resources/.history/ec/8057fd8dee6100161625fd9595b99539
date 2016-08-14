//http://javahungry.blogspot.com/p/blog-page_10.html

class Question9 extends Thread
{
	private int counter;
	@Override
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<10000;i++)
			{
				counter++;
			}

			this.notifyAll();
			System.out.println("Completed Coding");
		}
	}
	public static void main (String [] str) throws InterruptedException
	{
		Question9 question = new Question9();
		question.start();
		Thread.sleep(10000);
		System.out.println("Waiting to get end");
		synchronized(question)
		{
			question.wait();
		}
		
		System.out.println(question.counter);
	}
}
