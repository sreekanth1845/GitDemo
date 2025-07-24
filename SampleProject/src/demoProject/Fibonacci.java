package demoProject;

public class Fibonacci {

	public static void main(String[] args) {

		fibonacci(5);
		

	}

	public static void fibonacci(int num) {
		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 1; i <= num; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
		
		System.out.println("Sum of fibonacci:" + c);
	}

}
