<%@page import="business.AccessoApplicazione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
	<label>Email: </label>
	<input type="text" name="email">
	<label>Password: </label>
	<input type="password" name="password">
	
	<input type="submit" value="Cliccami!">
</form>
<% if(AccessoApplicazione.login(request.getParameter("email"), request.getParameter("password"))) { %>
<h1>Yuppi!!! Ce l'hai fatta!</h1>
<% } else { %>
<h1>Acci! Non ce l'hai fatta!</h1>
<% } %>
</body>
</html>