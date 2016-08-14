public class PracticeThreadSyncStatement 
{
	public static void main(String[] args) 
	{
		Callme target=new Callme();
		Caller ob1=new Caller(target, "Hello");
		Caller ob2=new Caller(target, "Synchronised");
		Caller ob3=new Caller(target, "World");
		try
		{
			ob1.t.join();
			ob1.t.join();
			ob1.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
}
class Callme
{
	void call(String msg)
	{
		System.out.print("[" +msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable
{
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme targ, String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(target)//By putting target method in synchronized statement we will get all threads synchronized
		{
			target.call(msg);
		}
	}
}
