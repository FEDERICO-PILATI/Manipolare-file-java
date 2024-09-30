package trovareFile;

import java.io.File;

public class TrovareFile {

	public static void main(String[] args) {

		/* COME TROVARE UN FILE */

		File file = new File("filedacercare.txt"); // se è allo stesso livello
		File file2 = new File("C:\\Users\\Utente\\OneDrive\\Desktop\\COMANDI-DOCKER.txt"); // se è sul nostro
																							// dispositivo
		System.out.println(
				"in questo progetto è presente file2, che non ho mai usato. Ha path: " + file2.getAbsolutePath());

		if (file.exists()) {
			System.out.println("il file esiste");
			System.out.println(file.getAbsolutePath()); // mostra il percorso assoluto

			if (file.isFile())
				System.out.println("è un file");
			else
				System.out.println("NON è un file");
			// file.delete();

		} else {
			System.out.println("il file NON esiste");
		}

	}

}
