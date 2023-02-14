package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/router")
public class GestionaleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Dipendente> dipendenti = new ArrayList<>();
	
	public GestionaleController() {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		dipendenti.add(new Fattorino("Mario", "Rossi"));
		dipendenti.add(new Impiegato("Luca", "Bianchi"));
		dipendenti.add(new Dirigente("Temistocle", "Arbarollo"));
		
		response.getWriter().append(dipendenti.toString());
	}

}
