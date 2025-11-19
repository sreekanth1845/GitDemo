package Strings;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {

		duplicateCharacters("My name is Srikanth");
		firstNonRepeatedCharacter("mummy");

		countString("sree", 'e');

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

	private static void duplicateCharacters(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		// char[] arr = str.toCharArray();

		for (char ch : str.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			// System.out.println(entry.getKey() + "=" + entry.getValue()); //for all
			// characters

			if (entry.getValue() > 1) // for duplicate characters
				System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

	private static void firstNonRepeatedCharacter(String str) {
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
//        System.out.println("No character repeated");
	}

	private static void countString(String s1, char s2) {
		int count = 0;

		for (int i = 0; i <= s1.length() - 1; i++) {
			if (s1.charAt(i) == s2) {
				count++;
			}
		}
		System.out.println(count);
	}

}
