class A extends  Thread
{
	public void run()
	{
		System.out.println("Thread Started");
		for(int i=1;i<=4;i++)
		{
			System.out.println("From thread A:i="+i);
		}
		System.out.println("Exit from :A");
	}
}
class B extends  Thread
{
	public void run()
	{
		System.out.println("Thread Started");
		for(int i=1;i<=4;i++)
		{
			System.out.println("from thread B:i="+i);
		}
		System.out.println("Exit from :B");
	}
}
class C extends  Thread
{
	public void run()
	{
		System.out.println("Thread Started");
		for(int i=1;i<=4;i++)
		{
			System.out.println("from thread C:i="+i);
		}
		System.out.println("Exit from :C");
	}
}
class ThreadPriority
{
	public static void main(String [] args)
	{
		A objA=new A();
		B objB=new B();
		C objC=new C();
		objC.setPriority(Thread.MAX_PRIORITY);
		objB.setPriority(objA.getPriority()+1);
		objA.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread A started");
		objA.run();
		System.out.println("Thread B started");
		objB.run();
		System.out.println("Thread C Started");
		objC.run();
	}
}