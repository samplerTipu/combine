<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h1>This Is Home page</h1>
	<h1>Called By Home Controller</h1>
	<h1>URL /home</h1>
	<h1>what is my name:</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> freinds = (List<String>) request.getAttribute("f");
	%>
	<h1>
		MY Name is
		<%=name%></h1>
	<h1>
		Id is
		<%=id%></h1>

	<%
	for (String s : freinds) {
		
	%>
	<h1><%=s %></h1>
	<%
	}
	%>


</body>
</html>