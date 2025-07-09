package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\sreek\\Downloads\\new.txt";
		String word = "java";
				
		try {
			
			File file = new File(path);
			Scanner sc = new Scanner(file);
			boolean found = false;
			int lineNumber = 0;
			
			while(sc.hasNext()) {
				lineNumber++;
				 String line = sc.nextLine();
				
				
				if(line.contains(word)) {
					System.out.println("Word found:"+word+"\t"+"Line number:"+ lineNumber);
					found = true;
				}
			}
			
			if(!found) {
				System.out.println(word+" is not found");
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
