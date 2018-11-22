package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrimoJdbc {

	public static void main(String[] args) {
		
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
			ResultSet dati = comandoSql.executeQuery("select * from dati where numero = 10");
			while(dati.next()) {
				// durante ogni iterazione, accedo ad un record alla volta 
				System.out.print(dati.getInt("numero") + " | ");
				System.out.print(dati.getString("testo") + " | ");
				System.out.println(dati.getDate("data"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
