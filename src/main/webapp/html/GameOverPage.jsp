<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<img alt="" src="../Images/Hangman6.png">
	<h1>GameOver, word was</h1>
	<h1>
		"
		<c:out value="${word.getWordName() }"></c:out>
		"
	</h1>
	
	<form action="../WordServlet">
	<input type="submit" value="NEW GAME">
	</form>
</body>
</html>