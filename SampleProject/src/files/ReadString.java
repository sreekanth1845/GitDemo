package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ReadString {

	public static void main(String[] args) throws IOException {

		fileReaderToString();
	}

	private static void fileReaderToString() throws IOException {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		TreeSet<String> set = new TreeSet<String>();

		String filePath = "C:\\Users\\sreek\\Downloads\\new.txt";
		Path path = Paths.get(filePath);
		String fileContent = Files.readString(path);

		String[] words = fileContent.split(",");

		for (String ch : words)
			set.add(ch.trim());

		System.out.println(set); // printing all the strings present in ascending order

		for (String str : words)
			map.put(str, map.getOrDefault(str, 0) + 1);

		String repeat = null;
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				repeat = entry.getKey();
			}
		}

		System.out.println(repeat + ":" + maxCount);

	}

}
