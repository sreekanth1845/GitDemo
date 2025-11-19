package arrays;

public class SumOfElements {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		sumArray(a);
	}

	public static void sumArray(int[] a) {
		int sum = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
