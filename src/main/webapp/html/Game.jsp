<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="../css/Game.css" type="text/css" rel="stylesheet" />
</head>
<body>

<header>

<h1>Hangman</h1>

</header>


<div class="inputLetter">

<form action="../GuessServlet">
<input type="text" name="letter" placeholder="enter letter" maxlength="1">
<input type="submit" >

</form>


</div>
<c:forEach items="word">
<c:out value="${word.getUsedLetters()}"></c:out>
</c:forEach>
<c:out value="${word.getStarName() }"></c:out>
<c:choose>
<c:when test="${word.getWordName().equals(word.getStarName())}"> Win</c:when>
<c:when test="${word.getMistakes() == 0}" > <img alt="" src="../Images/Hangman0.png"></c:when>
<c:when test="${word.getMistakes() == 1}" > <img alt="" src="../Images/Hangman1.png"></c:when>
<c:when test="${word.getMistakes() == 2}" > <img alt="" src="../Images/Hangman2.png"></c:when>
<c:when test="${word.getMistakes() == 3}" > <img alt="" src="../Images/Hangman3.png"></c:when>
<c:when test="${word.getMistakes() == 4}" > <img alt="" src="../Images/Hangman4.png"></c:when>
<c:when test="${word.getMistakes() == 5}" > <img alt="" src="../Images/Hangman5.png"></c:when>

</c:choose>







</body>
</html>