package Strings;

public class SubstringFinder {

	public static void main(String[] args) {

		String str = "sree";

		findAllSubStrings(str);
	}

	private static void findAllSubStrings(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				System.out.println(str.substring(i, j + 1));
			}
		}

	}

}
