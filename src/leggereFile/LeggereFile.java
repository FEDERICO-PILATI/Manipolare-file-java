package leggereFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggereFile {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("tentativo.txt");
			int primoCarattere = reader.read();
			// finchè trova caratteri li legge e li stampa (nota: usare print e non println)
			while (primoCarattere != -1) {
				System.out.print((char) primoCarattere);
				primoCarattere = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
