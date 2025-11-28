package arrays;

import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };

		System.out.println(secondLargest(arr));
		
		int[] num = { 12, 35, 1, 10, 34, 1 };
		Arrays.sort(num);
		System.out.println(num[num.length-2]);
	}

	private static int secondLargest(int[] arr) {

		Arrays.sort(arr);

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != arr[arr.length - 1]) {
				return arr[i];
			}
		}

		return -1;

	}
}
