package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tutti")
public class DipendentiCtrl extends HttpServlet{

	String[] nanetti = {"Pisolo", "Brontolo", "Dotto", "Eolo", "Gongolo", "Mammolo", "Cucciolo"};
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Mi hai chiamato tramite il GET");
		System.out.println("Sono la servlet Dipendenti");
		
		resp.setContentType("text/html");
		resp.getWriter().append("<h1>Sei nella servlet di tutti i dipendenti</h1>");	
		resp.getWriter().append("<ul>");	
		
		for (String nano : nanetti) {
		resp.getWriter().append("<li>" + nano + "</li>");
		}
		resp.getWriter().append("</ul>");
	}
	
}
