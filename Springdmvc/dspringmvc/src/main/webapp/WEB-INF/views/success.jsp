<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${Header}</h1>
<p>${Desc}</p>
<hr>
<h1>welcome,${user.userName}</h1>
<h1>Your Email address is ${user.email}</h1>
<h1>Your Password is ${user.password} try to secure the password</h1>

</body>
</html>