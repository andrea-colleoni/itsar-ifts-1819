package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EsempioIO {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\andre\\Desktop\\Temp\\Corsi\\ITSAR1819\\Modulo3\\FileDiEsempio\\primo.txt");
		// String percorso = "C:\\Users\\andre\\Desktop\\Temp\\Corsi\\ITSAR1819\\Modulo3\\FileDiEsempio\\primo.txt";
		if (f.exists()) {
			try {
//				FileReader fr = new FileReader(f);
//				BufferedReader br = new BufferedReader(fr);
				BufferedReader br = new BufferedReader(new FileReader(f));
//				char[] buffer = new char[(int)f.length()];
//				fr.read(buffer);
				String letta = br.readLine();
				//System.out.println(String.valueOf(buffer));
				System.out.println(letta);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("il file non esiste");
		}
	}

}
