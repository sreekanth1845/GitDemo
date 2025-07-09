package files;

import java.io.File;

public class Directory {

	public static void main(String[] args) {

		String path = "C:\\Users\\sreek\\Downloads\\MyNew";
		
		File directory = new File(path);
		
		if(directory.exists()) {
			System.out.println("Directory already exists");
		}
		else {
			boolean created = directory.mkdir();
			
			if(created) {
				System.out.println("Directory created");
			}
			else {
				System.out.println("Failed to create");
			}
		}
	}

}