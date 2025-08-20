package arrays;

import java.util.Arrays;

public class MinMaxArray {

	public static void main(String[] args) {

		int[] num = { 20, 10, 25, 2, 30 };

		int min = num[0];
		int max = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			} else if (num[i] > max) {
				max = num[i];
			}
		}

		System.out.println(min);
		System.out.println(max);
		
		//Sorting array numbers in ascending order
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}

}