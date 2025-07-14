package Strings;

public class WhiteSpaces {

	public static void main(String[] args) {

		String str = "My name is Srikanth";

		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
