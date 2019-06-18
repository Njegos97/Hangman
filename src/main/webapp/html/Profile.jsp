<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
<meta http-equiv="refresh" content="5" />
<title>Insert title here</title>
</head>
<body>
	
	<a href="../LogoutServlet" id="logoutCss">Logout</a>



	<c:out value="${sessionScope.player.getName()}" />


	<div class="PlayerInfo">
		<table border="2">


			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Gender</th>
				<th>DateOfBirth</th>
				<th>HighScore</th>
			</tr>


			<tr>
				<td>${player.getId()}</td>
				<td>${player.getName()}</td>
				<td>${player.getGender() }</td>
				<td>${player.getDob() }</td>
				<td>${player.getHighScore()}</td>

			</tr>





		</table>

	</div>


	<form action="../WordServlet">
		<input type="image" src="../Images/play.png" width="100" height="20">
	</form>

</body>
</html>