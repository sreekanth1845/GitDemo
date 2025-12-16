package Strings;

public class Reverse {

	public static void main(String[] args) {
		//String str = "Hello World";
		String str = "Welcome to Wipro Technologies";

		reverseString(str);
		reverseEachCharacter(str);
		reverseEachWord(str);
		reverseWord(str);
		reverseUsingStringBuilder(str);
	}

	public static void reverseString(String str) {
		String revString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println("reverseString:" + revString);
	}

	public static void reverseEachCharacter(String str) {

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
	
	private static void reverseWord(String str) {
		String[] words = str.split(" ");
		
		for(int i=words.length-1; i>=0; i--)
			System.out.print(words[i] + " ");
		
	}

	private static void reverseUsingStringBuilder(String str) {
		String[] words = str.split(" ");

		StringBuilder revStr = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			revStr.append(words[i]);

			if (i > 0)
				revStr.append(" ");
		}

		//System.out.println(revStr.toString());

	}

	public static void reverseEachWord(String str) {

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
