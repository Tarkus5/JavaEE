<!DOCTYPE html>
<%@page import = "controller.TodoCtrl"%>
<html>
<head>
<meta charset="UTF-8">
<title>JS Prova</title>
</head>
<body>
<%-- 	<% 
	String saluto = "Ciao frat� come stai? Spero tutto a posto trmn";
	
	out.println("<h1>" + saluto + "</h1>"); //Prima possibilit� di stampa
	%>
	<h1><%= saluto %></h1> <!-- Seconda possibilit� di stampa --> --%>

<% 
	TodoCtrl ctrl = new TodoCtrl(10);
	String descrizione = request.getParameter("Todo");
	ctrl.add(descrizione);
	out.print(ctrl.getAll()[0]);
%>

<form action="">
	<input type="text" name="todo" placeholder="Scrivi qui la cosa da fare">
	<input type="submit" value="aggiungi">
</form>

</body>
</html>