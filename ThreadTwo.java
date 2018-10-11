class ThreadDemo extends Thread
{
	private Thread t;
	private String threadName;
	ThreadDemo(String name)
	{
		threadName=name;
		System.out.println("Creating"+threadName);
	}
	public void run()
	{
		System.out.println("Running"+threadName);
		try
		{
			for(int i=0;i>0;i--)
			{
				System.out.println("Thread"+threadName+","+i);
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread"+threadName+"Interrupted");
		}
		System.out.println("Thread"+threadName+"exiting");
	}
	public void start()
	{
		System.out.println("Starting"+threadName);
		if (t==null)
		{
			t=new Thread(this,threadName);
			t.start();
		}
	}
}
public class ThreadTwo
{
	public static void main(String [] args)
	{
		ThreadDemo t1=new ThreadDemo("Thread-1");
		t1.start();
		ThreadDemo t2=new ThreadDemo("Thread-2");
		t2.start();
	}
}