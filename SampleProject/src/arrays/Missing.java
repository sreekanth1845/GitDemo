package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Missing {

	public static void main(String[] args) {

		// int[] number = { 9, 6, 4, 5, 7, 2};
		int[] arr = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		// int[] arr = { 9, 9, 9, 2, 3, 5, 7, 1, 1 };
		missingElements(arr);
	}

	private static void missingElements(int[] num) {
		Arrays.sort(num);
		HashSet<Integer> set = new HashSet<>();

		for (int i = num[0]; i < num[num.length - 1]; i++) {
			set.add(i);
		}

		for (int j = 0; j < num.length; j++) {
			set.remove(num[j]);
		}

		System.out.println(set);

		for (int k : set) {
			System.out.println(k);
		}
	}
}