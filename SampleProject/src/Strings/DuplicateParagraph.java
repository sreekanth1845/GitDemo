package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateParagraph {

	public static void main(String[] args) {

		String text = "Java is easy and Java is powerful";
		String[] words = text.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String w : words)
			map.put(w, map.getOrDefault(w, 0) + 1);
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey());
		}
	}
}
