import java.util.Scanner;
class Summation implements Runnable {
	Scanner scan = new Scanner(System.in);
	private Thread t;
	private String nm;
	Summation(String name) {
		nm = name;
		System.out.println("Thread created: " + nm);
	}
	public void run() {
		try {
			int n = 0;
			int s = 0;
			while(true) {
				System.out.print("Enter a positive integer (0 or less to exit): ");
				n = scan.nextInt();
				if(n > 0) s += n;
				else break;
			}
			System.out.println("Sum: " + s);
		} catch (Exception e) {}
	}
}
public class SumThread {
	public static void main(String[] args) {
		Summation summ = new Summation("Summation");
		summ.run();
	}
}