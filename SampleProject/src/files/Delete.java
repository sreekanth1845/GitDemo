package files;

import java.io.File;

public class Delete {

	public static void main(String[] args) {

		String path = "C:\\Users\\sreek\\Downloads\\new1.txt";

		File file = new File(path);

		if (file.exists()) {
			if (file.delete()) {
				System.out.println("File deleted successfully");
			} else {
				System.out.println("Failed to delete");
			}
		} else {
			System.out.println("File path does not exists");
		}
	}

}
