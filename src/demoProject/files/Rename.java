package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Rename {

	public static void main(String[] args) {

		Path cPath = Paths.get("C:\\Users\\sreek\\Downloads\\new1.txt");
		Path nPath = Paths.get("C:\\Users\\sreek\\Downloads\\new.txt");
		
		try {
			Files.move(cPath, nPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Files renamed succesfully");
			
		} catch (IOException e) {
			System.err.println("Failed to rename file");
			e.printStackTrace();
		}
	}

}
