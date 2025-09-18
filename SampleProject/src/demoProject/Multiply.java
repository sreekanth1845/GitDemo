package demoProject;

public class Multiply {

	public static void main(String[] args) {

		int result = multiply(5, 10);
		System.out.println(result);

		System.out.println(multiplyWhile(10, 9));
	}

	private static int multiply(int a, int b) {
		int sum = 0;

		for (int i = 1; i <= b; i++) {
			sum = sum + a;
		}
		return sum;
	}

	public static int multiplyWhile(int i, int j) {
		int sum = 0;
		int k = 1;

		while (k <= j) {
			sum = sum + i;
			k++;
		}
		return sum;
	}
}
