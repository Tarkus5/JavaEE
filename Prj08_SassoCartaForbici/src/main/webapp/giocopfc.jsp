<%@page import="gioco.CartaForbiciSasso"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Carta, Forbice, Sasso JSP</title>

<style type="text/css">
img {
	width: 150px;
}

div {
	border: 3px solid #ffcc55;
	margin-top: 20px;
	padding: 10px;
}

h1, h2, h3 {
	margin-left: 5px;
}


</style>

</head>
<body>
<h1>Sasso Forbici Carta</h1>
<div>

<a href="?scelta=carta"><img class="center" src="https://previews.123rf.com/images/gladkov/gladkov1108/gladkov110800268/10332310-pezzo-di-carta-strappato-il-vecchio-fondo-di-carta-schiacciato-annata-carta-retr%C3%B2.jpg"></a>
<a href="?scelta=sasso"><img class="center" src="https://www.certigem.com/images/news/2021/Pietre_Preziose_Nere_Elenco_Nomi_e_Prezzi/Basalto.jpg"></a>
<a href="?scelta=forbici"><img class="center" src="https://tecmatied.files.wordpress.com/2012/06/forbici-kuchenprofi1.jpg"></a>

</div>

<div>

<h2>Scelta umano</h2>

<% String sceltaUmano= request.getParameter("scelta"); %>
<h3><%= sceltaUmano %></h3>
</div>

<div>

<h2>Scelta Pc</h2>

<% String sceltaPc= CartaForbiciSasso.chiediPc(); %>
<h3><%= sceltaPc %></h3>
</div>

<div>

<h2>Risultato</h2>

<% String risultato = null;
if(sceltaUmano != null && sceltaPc != null){
risultato = CartaForbiciSasso.valuta(sceltaUmano, sceltaPc);
}%>
<h3><%= risultato %></h3>
</div>
</body>
</html>