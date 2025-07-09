package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {

	public static void main(String[] args) {

		Path cPath = Paths.get("C:\\Users\\sreek\\Downloads\\new.txt");
		Path dPath = Paths.get("C:\\Users\\sreek\\OneDrive\\Desktop\\new.txt");

		try {

			Files.createDirectories(dPath.getParent());

			Files.copy(cPath, dPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File copied succesfully");

		} catch (Exception e) {
			System.err.println("Error copying file: " + e.getMessage());
		}
	}

}
