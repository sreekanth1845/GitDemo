package demoProject;

public class Reverse {

	public static void main(String[] args) {

		int num = 123;
		reverseOfNumber(num);
		reverseUsingRecurrsion(num);

	}

	private static void reverseOfNumber(int num) {

		int rev = 0;

		while (num != 0) {
			int temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}

		System.out.println(rev);
	}

	private static void reverseUsingRecurrsion(int num) {

		if (num < 10)
			System.out.print(num);
		else {
			System.out.print(num % 10);
			reverseUsingRecurrsion(num / 10);
		}
	}
}
