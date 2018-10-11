class oddeven implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number are:"+i);
			}
			else
			{
				System.out.println("odd number are:"+i);
			}
		}
	}
	public static void main(String [] args)
	{
		oddeven n1=new oddeven();
		n1.run();
	}
}