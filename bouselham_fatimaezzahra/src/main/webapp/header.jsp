<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@page import="com.model.Etudiant"%>
     <%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<style>
.form-inline{
margin: 5px;
margin-right:20px;
right:20px;
}
span{color:khaki; margin-right:20px; margin-left:20px;font-weight:bold;  right: -100px;}
a{color:khaki; text-decoration:none;}
a:hover {
 color: white;
}

.navbar-brand{font-weight:bold;}
</style>
<title>menu</title>
</head>
<body>
        

 
        
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#">Mybiblio</a>

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="livres.jsp">Home</a>
    </li>
   
    <li class="nav-item">
      <a class="nav-link" href="#">Contact</a>
    </li>
    </ul>
    
    
    
    
   <%   if(session.getAttribute("etudiant")==null){
        	response.sendRedirect("index.jsp");}
        	else
        	{
        		Etudiant e=(Etudiant)session.getAttribute("etudiant");%>
   
     <span>	<%=e.getNom() %>|<a href="logout">logout</a></span>
        <% } %>
         

 
   <form class="form-inline my-2 my-md-0" action="servecat" method="get">
    <input class="form-control mr-sm-2 " type="text" placeholder="Catégorie..." name="cat">
    <button class="btn btn-success" type="submit">Search</button>
  	</form>
    <form class="form-inline my-2 my-md-0" action="serveaut" method="get">
    <input class="form-control mr-sm-2" type="text" placeholder="Auteur..."  name="aut">
    <button class="btn btn-success" type="submit">Search</button>
  </form>
    
</nav>




</body>
</html>