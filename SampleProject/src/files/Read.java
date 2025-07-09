package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Read {

	public static void main(String[] args) {

		readFile();
		writeFile();
		appendFile();

	}

	public static void readFile() {

		String path = "C:\\Users\\sreek\\Downloads\\new.txt";
		int count = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));

			while (reader.readLine() != null) {
				count++;
			}

			System.out.println("line count:" + count);
		} catch (IOException e) {
			System.out.println("Error reading the file:" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void writeFile() {

		String text = "Writing into new File";
		String fileName = "C:\\Users\\sreek\\Downloads\\new.txt";

		try {
			FileWriter fileWriter = new FileWriter(fileName, false);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			printWriter.print(text);
			printWriter.close();

			System.out.println("Written succesfully");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void appendFile() {

		String fileName = "C:\\Users\\sreek\\Downloads\\new.txt";
		String text = "This text will be added to the end of the file";

		try {

			FileWriter writer = new FileWriter(fileName, true);
			writer.write(text);
			System.out.println("Text successfully appended");

		} catch (IOException e) {
			System.err.println("An error occurred while appending to the file:" + e.getMessage());
			e.printStackTrace();
		}
	}

}