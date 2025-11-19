package arrays;

public class FirstAndLast {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 7, 8, 3, 6, 3 };
		findFirstAndLastOccurancesOfAnArray(arr);
	}

	private static void findFirstAndLastOccurancesOfAnArray(int[] arr) {
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);

	}

}
