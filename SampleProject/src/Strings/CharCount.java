package Strings;

import java.util.HashMap;

public class CharCount {

	public static void main(String[] args) {

		String str = "My name is Srikanth";
		int count = 0;

		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (charCount.containsKey(str.charAt(i))) {

				count = charCount.get(str.charAt(i));
				charCount.put(str.charAt(i), ++count);
			} else
				charCount.put(str.charAt(i), 1);
		}
		System.out.println(charCount);

	}

}
