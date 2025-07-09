package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\sreek\\Downloads\\data.csv";
		
		List<List<String>> records = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			
			while((line = br.readLine()) != null) {
				
				String[] values = line.split(",");
				//System.out.println(values[0]);
				records.add(Arrays.asList(values));
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		// Print the records to verify
        for (List<String> record : records) {
            for (String field : record) {
                System.out.print(field + "\t");
            }
            System.out.println();
        }
		
		
	}

}
