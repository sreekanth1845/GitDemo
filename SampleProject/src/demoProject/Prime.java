package demoProject;

public class Prime {

	public static void main(String[] args) {

		primeNumber(11);
		
		int p = 59;
		int count = 0;

		if (p <= 1) {
			System.out.println("This number is not a Prime");
		}

		for (int i = 1; i < p; i++) {
			if (p % i == 0) {
				count++;
			}
		}

		if (count > 1) {
			System.out.println("This number is not a Prime");
		} else
			System.out.println("This number is a Prime");
	}

	private static void primeNumber(int n) {

		boolean flag = false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("it is not prime");
		else
			System.out.println("it is prime");
	}
}