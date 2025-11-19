package arrays;

public class SortingArray {

	public static void main(String[] args) {

		sortArray();
	}

	private static void sortArray() {

		int temp;

		int[] a = { 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Ascending order");
		for (int k = 0; k < a.length; k++)
			System.out.println(a[k]); // ascending order

		System.out.println("Descending order");
		for (int n = a.length - 1; n >= 0; n--)
			System.out.println(a[n]); // descending order
	}

}
