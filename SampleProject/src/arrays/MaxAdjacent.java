package arrays;

public class MaxAdjacent {

	public static void main(String[] args) {

		int[] arr = { 34, 23, 67, 7, 8, 9, 4, 8, 7, 56 }; //
		maxIndexArray(arr);

		int[] a = { 1, 4, 8, 15, 17 }; // 3, 4, 7, 2
		int diff = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] > diff)
				diff = a[i + 1] - a[i];
		}
		System.out.println(diff);
	}

	private static void maxIndexArray(int[] arr) {
		int diff = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] + arr[i] > diff)
				diff = arr[i + 1] + arr[i];

		}
		System.out.println(diff);
	}
}
