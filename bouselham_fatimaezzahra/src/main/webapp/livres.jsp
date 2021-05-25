<%@page import="com.dao.LivreDAO"%>
<%@page import="com.model.Etudiant"%>
<%@page import="com.model.Livre"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDate"%>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.table {margin-top:40px;}
.table thead{background-color:khaki;}
.border{ right:-70px; margin-top:30px;}
</style>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<%
LocalDate d=LocalDate.now();

Etudiant et=(Etudiant)session.getAttribute("etudiant");
if(et==null){
	response.sendRedirect("index.jsp");
}

LivreDAO lm=new LivreDAO();

%>
 <div class="row">
        <div class="col-12 col-md-6" >
<h1 style="text-align:center"> Liste des livres </h1>
<div class="container"> 
<table class="table table-hover">

	<thead><tr><th>ID</th><th>reference</th><th>Titre</th><th>auteur</th><th>categorie</th><th>réservé</th></tr></thead>
		<tbody>
	<%	List<Livre> ls = lm.allLivres();%>

		<% for(Livre liv : ls) { %>
			<tr>
			<td><%= liv.getId() %></td>
			<td> <%= liv.getRef()%></td>
			<td> <%= liv.getTitre()%></td>
			<td><%=liv.getAuteur()%></td>
			<td><%=liv.getCategorie()%></td>
			<% if (liv.getReservation()==1) { %>
					<td>oui</td>      
					<% } else { %>
						<td>non</td> 
			        <% } %>
			
			
			
			<% } %>
			</tr>
			
		</tbody>
																					
</table>
</div> 
	</div> 
	 
	 <div class="container border spacer col-12 col-md-4">
	 <h2 style="text-align:center"> Ajouter un livre </h1>
	 
	 <form action="livreadd" method="post" class="was-validated">
  <div class="form-group">
    <label for="uname">Reference:</label>
    <input type="text" class="form-control" id="ref" placeholder="entrer la référence..." name="ref" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
    <div class="form-group">
  
      <label for="uname">Titre:</label>
  <input type="text" class="form-control" id="titre" placeholder="entrer le titre..." name="titre" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
    <div class="form-group">  	
      <label for="uname">Auteur:</label>
  <input type="text" class="form-control" id="auteur" placeholder="entrer l'auteur..." name="auteur" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  <div class="form-group">
    <label for="pwd">Catégorie:</label>
    <input type="text" class="form-control" id="categorie" placeholder="Entrer la catégorie..." name="categorie" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
 <div class="form-group">
    <label for="pwd">Reservé:</label>
    <input type="number" class="form-control" id="res" value="0" name="reservation" readonly>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  <button type="submit" class="btn btn-success">ajouter</button>
</form>
</div>
</body>
</html>