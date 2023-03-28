package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MiaConnessione {
	
	private final String URL = "jdbc:mysql://localhost:3306/ifts"; //Stringhe di connessione
	private final String USER = "root";
	private final String PASS = "root";
	
	private Connection conn;
	
	public Connection getConn() {
		
		if (this.conn == null) {
			
			connetti();
		}
		
		return conn;
	}
	
	public void connetti() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		try {
			
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Sei connesso, tutto ok!");
			
		} catch (SQLException e) {
			System.err.println("OPS!! La connessione non è andata a buon fine!");
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public void disconnetti() {
		
		if (this.conn != null) {
			
			try {
				
				this.conn.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MiaConnessione mc = new MiaConnessione();
		mc.connetti();
		mc.disconnetti();
	}
}
