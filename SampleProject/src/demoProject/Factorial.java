package demoProject;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(recFactorial(5));

	}

	private static int factorial(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++)
			fact = fact * i;

		return fact;
	}

	private static int recFactorial(int num) {

		if (num == 1 || num == 0)
			return 1;

		return num * recFactorial(num - 1);
	}

}
