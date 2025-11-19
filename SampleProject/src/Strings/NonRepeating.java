package Strings;

import java.util.HashMap;
import java.util.Map;

public class NonRepeating {

	public static void main(String[] args) {

		String str = "markram";
		firstNonRepeatingCharacter(str);
		nonRepeatingCharacter(str);
	}

	private static void nonRepeatingCharacter(String str) {
		Map<Character, Integer> charCount = new HashMap<>();
		for (char ch : str.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
		}

		for (char ch : str.toCharArray()) {
			if (charCount.get(ch) == 1) {
				System.out.println("First non repeating character:" + ch);
				break;
			}
		}
	}

	private static void firstNonRepeatingCharacter(String str) {

		for (char ch : str.toCharArray()) {
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("First non repeating character:" + ch);
				break;
			}
		}
	}
}