package recurrsion;

public class Reverse {

	public static void main(String[] args) {

		int num = 321;
		reverse(num);
	}

	private static void reverse(int num) {

		if (num < 10) {
			System.out.println(num);
		} else {
			System.out.print(num % 10);
			reverse(num / 10);
		}
	}

}
