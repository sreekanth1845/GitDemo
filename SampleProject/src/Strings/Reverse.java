package Strings;

public class Reverse {

	public static String str = "Hello World";

	public static void main(String[] args) {

		reverseString();
		reverseEachCharacter();
		reverseEachWord();
	}

	public static void reverseString() {
		String revString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println("reverseString:" + revString);
	}

	public static void reverseEachCharacter() {

		String[] words = str.split("\\s");

		String revString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revString = revString + revWord + " ";
		}
		System.out.println("reverseEachCharacter:" + revString);

	}

	public static void reverseEachWord() {

		String revString = "";

		String[] words = str.split("\\s");

		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1)
				revString = words[i] + revString;
			else
				revString = " " + words[i] + revString;
		}
		System.out.println("reverseEachWord:" + revString);
	}

}
