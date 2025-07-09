package demoProject;

public class Reverse {

	public static void main(String[] args) {

		int num = 123;
		int temp = num;
		int rev = 0;
		
		while (temp !=0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
		
		System.out.println(rev);

	}

}
