package Strings;

import java.util.HashMap;

public class LongestSubString {

	public static void main(String[] args) {

		LongestSubstringWithHashMap();

		String str = "GREEKSFORGREEKS";

		int n = 0;
		int result = 0;

		// Creating Hash map to store the last position of occurrence
		HashMap<Character, Integer> last = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (last.containsKey(str.charAt(i))) {
				n = Math.max(n, last.get(str.charAt(i)) + 1);
			}
			result = Math.max(result, i - n + 1);

			last.put(str.charAt(i), i);
		}
		System.out.println(str+" :"+result);
	}

	public static void LongestSubstringWithHashMap() {
		
		String s = "Markram and Markram";
		// HashMap to store the last occurrence index of each character.
		// Key: character, Value: index of its last occurrence.
		HashMap<Character, Integer> charIndexMap = new HashMap<>();

		int maxLength = 0; // Stores the maximum length found so far.
		int left = 0; // Left pointer of the sliding window.

		// Iterate through the string with the right pointer.
		for (int right = 0; right < s.length(); right++) {
			char currentChar = s.charAt(right);

			// If the current character is already in the map and its last occurrence
			// is within the current sliding window (i.e., its index is >= left).
			if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
				// Move the left pointer to the right of the last occurrence of the repeating
				// character.
				left = charIndexMap.get(currentChar) + 1;
			}

			// Update the last occurrence index of the current character.
			charIndexMap.put(currentChar, right);

			// Calculate the current substring length and update maxLength if it's greater.
			maxLength = Math.max(maxLength, right - left + 1);
		}
		System.out.println(s+": "+maxLength);
	}
}