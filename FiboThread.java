import java.util.Scanner;
class Fibonacci extends Thread {
	Scanner scan = new Scanner(System.in);
	private Thread t;
	private String nm;
	Fibonacci(String name) {
		nm = name;
		System.out.println("Thread created: " + nm);
	}
	public int fib(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return (fib(n-1) + fib(n-2));
	}
	public void run() {
		try {
			System.out.print("Enter a number: ");
			int n = scan.nextInt();
			if(n < 0) System.out.println("Invalid input!! Run the code again.");
			else for(int i = 0; i < n; i++) System.out.println("" + fib(i));
		} catch (Exception e) {}
	}
}
public class FiboThread {
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci("Fibonacci");
		fibo.run();
	}
}