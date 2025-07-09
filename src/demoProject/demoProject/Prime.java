package demoProject;

public class Prime {

	public static void main(String[] args) {

		int p = 15;
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
}