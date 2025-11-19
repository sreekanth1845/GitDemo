package arrays;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 7, 6, 7, 1, 13, 15 };
		findDuplicate(arr);

		System.out.println(findFirstDuplicate(arr));
	}

	private static void findDuplicate(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println("Duplicate elements:" + arr[i]);
			}
		}
	}

	private static int findFirstDuplicate(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();
		for (int ele : arr) {
			if (set.contains(ele))
				return ele;

			set.add(ele);
		}
		return -1;
	}

}
