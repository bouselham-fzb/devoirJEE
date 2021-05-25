<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
if(request.getParameter("res")!=null)
{
	if(request.getParameter("res").equals("error"))	
	{
		%>
		<p>userName or Password is incorrect.....!</p>
		<%
	}
}
%>
</body>
</html>