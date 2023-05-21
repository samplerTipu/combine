<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is help</title>
</head>
<body>
<%
	/*  String name = (String) request.getAttribute("name");
	Integer rollno = (Integer) request.getAttribute("roll no");
	LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
	%>
<h1>Hello we need Help....</h1>
<h1>Please open help page</h1>
<h1>
		My name is:
		<%-- <%=name%> --%>
		${name}
	</h1>
	
	<h1>
		My roll no is:
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
	<h1><c:out value="${item}"></c:out></h1>
	</c:forEach>
	
	<%-- ${marks} --%>

</body>
</html>