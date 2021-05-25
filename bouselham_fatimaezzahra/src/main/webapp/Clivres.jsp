<%@page import="com.dao.LivreDAO"%>
<%@page import="com.model.Etudiant"%>
<%@page import="com.model.Livre"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.ArrayList"%>;



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
<h1 style="text-align:center"> Liste des livres de catégorie <%=request.getParameter("cat") %></h1>
<div class="container"> 
<table class="table table-hover">

	<thead><tr><th>ID</th><th>reference</th><th>Titre</th><th>auteur</th><th>réservé</th></tr></thead>
		<tbody>

	
	<% 
	
	
	List<Livre> ls=new ArrayList<Livre>();
if( request.getAttribute("ctg")!= null){
	ls=(List<Livre>)request.getAttribute("ctg");
	//ls = lm.livreByCategorie("cat");
}
	
	
	%>
	
	
	<% if(ls != null){
			 for(Livre liv : ls) {%>
			<tr>
			<td><%= liv.getId() %></td>
			<td> <%= liv.getRef()%></td>
			<td> <%= liv.getTitre()%></td>
			<td><%=liv.getAuteur()%></td>
			<% if (liv.getReservation()==0) { %>
					<td>oui</td>      
					<% } else { %>
						<td>non</td> 
			        <% } %>
		
				 					<% }}%>	 		
			


		
			</tr>
			
		</tbody>

</table>
</div> 
	
</body>
</html>