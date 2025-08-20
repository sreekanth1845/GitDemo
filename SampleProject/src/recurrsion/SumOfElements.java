package recurrsion;

public class SumOfElements {

	public static void main(String[] args) {

		int[] a = { 2, 3, 5 };
		int i = 0;

		System.out.println(SumOfArray(a, i));
		SumOfArray(a);
	}

	private static int SumOfArray(int[] a, int i) {
		if (i >= a.length)
			return 0;

		return a[i] + SumOfArray(a, i + 1);

	}

	private static void SumOfArray(int[] a) {
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
