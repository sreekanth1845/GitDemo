package arrays;

import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {

		compareArray();
	}

	private static void compareArray() {

		int[] a = { 1, 4, 5, 7 };
		int[] b = { 6, 4, 3, 7 };

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i])
				arrayList.add(a[i]);
		}

		System.out.println(arrayList);
		
		//Object[] array = arrayList.toArray();

		for (Object obj : arrayList.toArray()) {
			System.out.println(obj);
		}
	}

}
