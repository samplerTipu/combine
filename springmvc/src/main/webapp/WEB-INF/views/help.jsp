<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page isELIgnored="false" %>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is help</title>
</head>
<body>


	<%
	/* String name = (String) request.getAttribute("name");
	Integer rollno = (Integer) request.getAttribute("roll no");
	LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
	%>
	<h1>
		my name is
		<%-- <%=name%> --%>
		${name}
	</h1>
	<h1>This Is help page</h1>
	<h1>
		my roll no is
		<%-- <%=rollno%> --%>
		${rollno}
	</h1>
	<h1>local date and time is
	<%-- <%=time.toString() %> --%>
	${time}
	</h1>
	<hr>
	<c:forEach var="item" items="${marks}">
	<%-- <h1>${item}</h1> --%>
	<c:out value="${item}"></c:out>
	</c:forEach>
	
	<%-- ${marks} --%>
</body>
</html>