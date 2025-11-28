package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Merge {

	public static void main(String[] args) {

		int[] arr1 = { 20, 10, 30, 40, 10, 20, 80 };
		int[] arr2 = { 30, 10, 20, 40, 50, 60, 80 };

		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : arr1)
			set.add(a);
		for (int b : arr2)
			set.add(b);

		System.out.println(set);

		Integer[] mergeArray = set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(mergeArray));
	}

}
