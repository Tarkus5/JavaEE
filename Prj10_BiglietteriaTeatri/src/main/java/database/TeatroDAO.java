package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Teatro;

public class TeatroDAO {

	MiaConnessione mc = new MiaConnessione();
	
	Statement stat;
	ResultSet rs;
	
	//CRUD: CREATE
	public void addTeatro(Teatro t) {
		try {
			
			this.stat = mc.getConn().createStatement();
			
			this.stat.execute("Insert into teatri (nome, posti) values ('"+t.getNome()+"',"+t.getnPosti()+")");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	//CRUD: READ - RETRIEVE
	public ArrayList<Teatro> getAll(){
		ArrayList<Teatro> temp = new ArrayList<>();
		return temp;
	}//Fine del metodo
	
	
	public static void main(String[] args) {
		TeatroDAO td = new TeatroDAO();
		Teatro t = new Teatro(100, "Teatro Nuovissimo", 1000);
		td.addTeatro(t);
	}
	
	
}//Fine della classe
