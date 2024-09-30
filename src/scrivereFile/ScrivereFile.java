package scrivereFile;

import java.io.FileWriter;
import java.io.IOException;

public class ScrivereFile {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("tentativo.txt");
			writer.write(
					"Hello, my name is Carl\nI just got my Java Developer Certificate\nI'm looking forward to find a job");
			writer.append("\nI would like to add that I really like technology");
			writer.append("\ngreetings by Carl");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
