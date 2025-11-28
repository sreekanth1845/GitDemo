package demoProject;

public class PalindromeString {

	public static void main(String[] args) {

		String input = "markram";
		String str = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			str = str + input.charAt(i);
		}

		if (str.equalsIgnoreCase(input)) {
			System.out.println(str + " is a palindrome string");
		}
	}

}
