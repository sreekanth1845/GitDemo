package demoProject;

public class StringReverse {

	public static void main(String[] args) {

		String input = "Srikanth Banda";
		String str = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			str += input.charAt(i);
		}
		System.out.println(str);

		StringReverse.rev(); // Calling the rev method
		StringReverse.palindrome();
	}

	public static StringBuilder rev() {
		String s = "Sree";
		StringBuilder res = new StringBuilder();
		res.append(s);
		res.reverse();
		System.out.println(res);
		return res;
	}

	public static String palindrome() {

		String input = "markram";
		String str = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			str = str + input.charAt(i);
		}
		System.out.println(str);

		return str;
	}

}