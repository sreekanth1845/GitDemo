package Strings;

import java.util.Arrays;

public class Anograms {

	public static void main(String[] args) {

		String str1 = "Listen";
		String str2 = "Silent";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Strings are not anograms");
		}

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		Boolean result = Arrays.equals(s1, s2);

		if (result)
			System.out.println("Strings are anograms");

		else
			System.out.println("Strings are not anograms");

	}

}
