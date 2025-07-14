package Strings;

public class Vowels {

	public static void main(String[] args) {

		String str = "My name is Srikanth";
		int vCount = 0;
		int cCount = 0;

		str = str.toLowerCase();

		for (int i = 0; i <= str.length()-1; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				vCount++;
			else
				cCount++;
		}
		System.out.println("Vowels:" + vCount);
		System.out.println("Consonants:" + cCount);

	}

}
