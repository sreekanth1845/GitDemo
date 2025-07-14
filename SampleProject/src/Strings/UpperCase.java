package Strings;

public class UpperCase {

	public static void main(String[] args) {

		firstLetterOfWord();
		firstLetterOfEachWord();
	}

	public static void firstLetterOfWord() {
		String str = "srikanth";

		String fl = str.substring(0, 1);
		String rl = str.substring(1);

		fl = fl.toUpperCase();
		System.out.println("firstLetterOfWord:" + fl + rl);
	}

	public static void firstLetterOfEachWord() {

		String str = "My name is Srikanth";

		String[] word = str.split("\\s");

		for (int i = 0; i <= word.length - 1; i++) {
			String fl = word[i].substring(0, 1);
			String rl = word[i].substring(1);

			fl = fl.toUpperCase();
			word[i] = fl + rl;
		}
		System.out.println(String.join(" ", word));
	}

}
