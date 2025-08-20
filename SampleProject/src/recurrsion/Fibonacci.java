package recurrsion;

public class Fibonacci {

	public static void main(String[] args) {

		int num = 7;

		for (int i = 0; i < num; i++) {
			System.out.println(fibonacci(i));
		}
	}

	private static int fibonacci(int num) {

		if (num <= 1)
			return num;

		return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
