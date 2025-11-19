package demoProject;

public class Digit {

	public static void main(String[] args) {

		int num = 89898999;
		int d = 9;
		int rem;
		int count = 0;

		while (num > 0) {
			rem = num % 10;
			if (rem == d)
				count++;
			num = num / 10;
		}
		System.out.println(count);
	}
}