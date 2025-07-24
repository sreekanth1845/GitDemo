package demoProject;

public class Swap {

	public static void main(String[] args) {

		swapWithoutVariable();
		swapwithVariable();

	}

	private static void swapwithVariable() {

		int a = 5;
		int b = 4;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

	}

	private static void swapWithoutVariable() {

		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
	}

}
