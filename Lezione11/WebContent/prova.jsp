<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%= new java.util.Date().toString() %></title>
</head>
<body>
<% for(int i = 0; i < 100; i++) { %>
<h1><strong><%= i %></strong>. Provo la JSP</h1>
<% } %>
</body>
</html>