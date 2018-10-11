class Primes extends Thread 
{
	private Thread t;
	private String nm;
	Primes(String name) 
	{
		nm = name;
		System.out.println("Thread created: " + nm);
	}
	public void run() 
	{
		try
		 {
			boolean isPrime;
			System.out.println("Primes:");
			for(int n = 2; n <= 10; n++) {
				isPrime = true;
				for(int i = 2; i <= n/2; i++) if(n%i == 0) isPrime = false;
				if(isPrime) System.out.println("" + n);
				Thread.sleep(500);
			}
		} catch (Exception e) {}
	}
}
class Composites extends Thread 
{
	private Thread t;
	private String nm;
	Composites(String name) 
	{
		nm = name;
		System.out.println("Thread created: " + nm);
	}
	public void run() 
	{
		try
{
			boolean isPrime;
			System.out.println("Composites:");
			for(int n = 2; n <= 10; n++) {
				isPrime = true;
				for(int i = 2; i <= n/2; i++) if(n%i == 0) isPrime = false;
				if(!isPrime) System.out.println("" + n);
				Thread.sleep(500);
			}
		} catch (Exception e) {}
	}
}
public class PrimeThread 
{
	public static void main(String[] args) 
	{
		Composites comp = new Composites("Composites thread");
		comp.run();
		Primes prim = new Primes("Primes thread");
		prim.run();
	}
}