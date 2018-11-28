package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammaSocket {

	private static final int PORTA = 20000;
	
	private static List<Socket> clientConnessi;

	public static void main(String[] args) throws IOException {
		clientConnessi = new ArrayList<>();
		// ascolto
		ServerSocket ss = new ServerSocket(PORTA);
		System.out.println("Server in ascolto sulla porta " + PORTA);

		// dialogo
		while(true) {
			Socket s = ss.accept();
			clientConnessi.add(s);
			// avvio il dialogo in un nuovo thread
			new Thread(() -> {
				try {
					dialogo(s);
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}).start();
		}
		// System.out.println("il programma è terminato");
	}

	public static void dialogo(Socket s) throws IOException {
		String indirizzo = s.getRemoteSocketAddress().toString();
		System.out.println(indirizzo + " si è connesso");

		Scanner sc = new Scanner(s.getInputStream());
		PrintWriter risponditore = new PrintWriter(s.getOutputStream());
		risponditore.print("Inserisci il tuo nickname: ");
		risponditore.flush();
		String nick = sc.nextLine();
		risponditore.println("benvenuto " + nick);
		risponditore.flush();
		broadcastMessaggio(nick, "sono entrato nella chat");
		String messaggio = sc.nextLine();
		while (!messaggio.equals("esci")) {
			broadcastMessaggio(nick, messaggio);
			messaggio = sc.nextLine();
		}
		broadcastMessaggio(nick, "ho abbandonato la chat");
		s.close();
		clientConnessi.remove(s);
		System.out.println("il dialogo con " + indirizzo + " è terminato");
	}
	
	public static void broadcastMessaggio(String mittente, String messaggio) throws IOException {
		for(Socket s : clientConnessi) {
			PrintWriter risponditore = new PrintWriter(s.getOutputStream());
			risponditore.println(mittente + " ha scritto: " + messaggio);
			risponditore.flush();
		}
	}

}
