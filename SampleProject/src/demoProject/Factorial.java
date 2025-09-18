package demoProject;

public class Factorial {

	public static void main(String[] args) {

		factorial(5);
		System.out.println(recFactorial(6));

	}

	private static void factorial(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++)
			fact = fact * i;

		System.out.println(fact);
	}

	private static int recFactorial(int num) {

		if (num == 1 || num == 0)
			return 1;

		return num * recFactorial(num - 1);
	}

}
