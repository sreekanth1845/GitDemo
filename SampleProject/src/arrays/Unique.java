package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Unique {

	public static void main(String[] args) {

		int[] a = { 4, 5, 5, 5, 5, 4, 6, 6, 9, 4 };
		findingUiqueNumbers(a);
		uniqueNumberArray(a);
	}

	private static void uniqueNumberArray(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : a)
			map.put(num, map.getOrDefault(num, 0) + 1);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

	private static void findingUiqueNumbers(int[] a) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {
			int count = 0;
			if (!arrayList.contains(a[i])) {
				arrayList.add(a[i]);
				count++;

				for (int j = i + 1; j <= a.length - 1; j++) {
					if (a[i] == a[j])
						count++;
				}
//				System.out.println(a[i]);
//				System.out.println(count);

				if (count == 1)
					System.out.println(a[i] + " is unique number");
			}
		}
	}

}