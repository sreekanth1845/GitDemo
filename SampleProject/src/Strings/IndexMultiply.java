package Strings;

public class IndexMultiply {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		int multiply = 1;

		for (int i = 0; i < nums.length; i++) {
			multiply = multiply * nums[i];
		}

		for (int j = 0; j < nums.length; j++) {
			
			nums[j] = multiply / nums[j];
			System.out.println(nums[j]);
		}
	}

}
