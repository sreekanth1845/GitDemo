package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		System.out.println(removeDuplicateCharacters("ABABACABACABD"));
	}

	private static String removeDuplicateCharacters(String str) {

		if (str == null || str.isEmpty())
			return str;

		Set<Character> unique = new LinkedHashSet<>();

		for (char c : str.toCharArray()) {
			unique.add(c);
		}

		StringBuilder result = new StringBuilder();
		for (char c : unique) {
			result.append(c);
		}

		//System.out.println(result.toString());
		return result.toString();

	}
}