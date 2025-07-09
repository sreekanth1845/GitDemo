package files;

import java.io.File;
import java.text.SimpleDateFormat;

public class ModifiedDate {

	public static void main(String[] args) {

		String path = "C:\\Users\\sreek\\Downloads\\new.txt";
		
		File file = new File(path);
		
		if(file.exists()) {
			long seconds = file.lastModified();	
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String formattedDate = dateFormat.format(seconds);
			
			System.out.println(formattedDate);
		}
	}

}
