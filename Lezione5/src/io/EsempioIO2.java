package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EsempioIO2 {

	public static void main(String[] args) {
		File f = new File("prova.txt");
		if (f.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(f));
				// crea un nuovo write che scriverà nel file
				FileWriter fw = new FileWriter("risultato.txt", true);
				PrintWriter pw = new PrintWriter(fw, true);
				String riga = br.readLine();
				while(riga != null) {
					System.out.println(riga);
					pw.println(riga);
					riga = br.readLine();
					// System.in (è un InputStream)
					// System.out (è un OutputStream)
				}
				//fw.flush();
				fw.close(); // implica flush()
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("il file " + f.getAbsolutePath() + " non esiste");
		}

	}

}
