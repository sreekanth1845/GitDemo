package demoProject;

public class Fibonacci {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 10;
		int a = 0;
		int b = 1;

		for (int i = num1; i <= num2; i++) {
			System.out.print(a + ",");
			int c = a + b;
			a = b;
			b = c;
		}

	}

}
