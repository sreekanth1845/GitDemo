package arrays;

import java.util.ArrayList;

public class Unique {

	public static void main(String[] args) {

		int[] a = { 4, 5, 5, 5, 5, 4, 6, 6, 9, 4 };
		findingUiqueNumbers(a);
	}

	private static void findingUiqueNumbers(int[] a) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {
			int count = 0;
			if (!arrayList.contains(a[i])) {
				arrayList.add(a[i]);
				count++;

				for (int j = i + 1; j <= a.length - 1; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
//				System.out.println(a[i]);
//				System.out.println(count);

				if (count == 1)
					System.out.println(a[i] + " is unique number");
			}
		}
	}

}