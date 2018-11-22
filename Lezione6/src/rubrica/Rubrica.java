package rubrica;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rubrica {

	public static void main(String[] args) {
		List<Contatto> contatti = leggiRubrica();
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il cognome > ");
		String ricerca = sc.nextLine();
		for(Contatto c : contatti) {
			if (c.getCognome().toLowerCase().indexOf(ricerca.toLowerCase()) >= 0) 
				System.out.println(c.getCognome() + " " + c.getNome() + ": " + c.getNumeroDiTelefono());
		}
		//Scanner sc = new Scanner(System.in);
		Contatto nuovo = new Contatto();
		System.out.print("Inserisci il nome > ");
		nuovo.setNome(sc.nextLine());
		System.out.print("Inserisci il cognome > ");
		nuovo.setCognome(sc.nextLine());
		System.out.print("Inserisci l'email > ");
		nuovo.setEmail(sc.nextLine());
		System.out.print("Inserisci il numero di telefono > ");
		nuovo.setNumeroDiTelefono(sc.nextLine());
		aggiungiContatto(nuovo);
	}
	
	public static void aggiungiContatto(Contatto contattoDaInserire) {
		// INSERT INTO `ifts`.`contatti` 
		// (`nome`, `cognome`, `email`, `numero_telefono`, `data_nascita`, `indirizzo`) 
		// VALUES ('NOME', 'COGNOME', 'EMAIL', 'NUMEROTEL', '2018-11-20', 'INDIRIZZO');
		
//		String query = "INSERT INTO `ifts`.`contatti` "
//				+ "(`nome`, `cognome`, `email`, `numero_telefono`, `data_nascita`, `indirizzo`) "
//				+ "VALUES (";
//		// per gestire i valori nulli uso l'operatore ternario
//		query += (contattoDaInserire.getNome() == null ? null : "'" + contattoDaInserire.getNome() + "'");
//		query += ", ";
//		query += (contattoDaInserire.getCognome() == null ? null : "'" + contattoDaInserire.getCognome() + "'");
//		query += ", ";
//		query += (contattoDaInserire.getEmail() == null ? null : "'" + contattoDaInserire.getEmail() + "'");
//		query += ", ";
//		query += (contattoDaInserire.getNumeroDiTelefono() == null ? null : "'" + contattoDaInserire.getNumeroDiTelefono() + "'");
//		query += ", ";
//		query += (contattoDaInserire.getDataNascita() == null ? null : "'" + contattoDaInserire.getDataNascita() + "'");
//		query += ", ";
//		query += (contattoDaInserire.getIndirizzo() == null ? null : "'" + contattoDaInserire.getIndirizzo() + "'");
//		query += ")";
		
		String query = "INSERT INTO `ifts`.`contatti` "
				+ "(`nome`, `cognome`, `email`, `numero_telefono`, `data_nascita`, `indirizzo`) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			// caricare il driver per il DB
			Class.forName("org.mariadb.jdbc.Driver");
			// costruisco la connessione fornendo queste tre informazioni:
			// 1: jdbc connection string (indirizzo, porta, database)
			// 2: username
			// 3: password
			Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/ifts", "root", "");
			// creo lo statement a partire dalla connessione appena creata
			// lo statement è un oggetto che trasporta i comandi SQL da questo
			// programma Java al DB connesso tramite la connessione conn
			PreparedStatement comandoSql = conn.prepareStatement(query);
			comandoSql.setString(1, contattoDaInserire.getNome());
			comandoSql.setString(2, contattoDaInserire.getCognome());
			comandoSql.setString(3, contattoDaInserire.getEmail());
			comandoSql.setString(4, contattoDaInserire.getNumeroDiTelefono());
			comandoSql.setDate(5, (Date)contattoDaInserire.getDataNascita());
			comandoSql.setString(6, contattoDaInserire.getIndirizzo());
			// invio la query SQL al DB usando statement
			// statement eseguira una scrittura sul DB
			comandoSql.executeUpdate();

			System.out.println("ho inserito un contatto");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<Contatto> leggiRubrica() {
		try {
			// caricare il driver per il DB
			Class.forName("org.mariadb.jdbc.Driver");
			// costruisco la connessione fornendo queste tre informazioni:
			// 1: jdbc connection string (indirizzo, porta, database)
			// 2: username
			// 3: password
			Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/ifts", "root", "");
			// creo lo statement a partire dalla connessione appena creata
			// lo statement è un oggetto che trasporta i comandi SQL da questo
			// programma Java al DB connesso tramite la connessione conn
			Statement comandoSql = conn.createStatement();
			// invio la query SQL al DB usando statement
			// statement restituirà un ResulSet che rappresenta i dati recuperati dal DB
			ResultSet dati = comandoSql.executeQuery("select * from contatti");
			List<Contatto> rubrica = new ArrayList<>();
			while(dati.next()) {
				// durante ogni iterazione, accedo ad un record alla volta 
				Contatto c = new Contatto();
				c.setNome(dati.getString("nome"));
				c.setCognome(dati.getString("cognome"));
				c.setNumeroDiTelefono(dati.getString("numero_telefono"));
				c.setEmail(dati.getString("email"));
				c.setIndirizzo(dati.getString("indirizzo"));
				c.setDataNascita(dati.getDate("data_nascita"));
				rubrica.add(c);
			}
			System.out.println("ho carricato " + rubrica.size() + " contatti");
			return rubrica;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
