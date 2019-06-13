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
	<a href="../LogoutServlet" id="logoutCss">Logout</a>
	


	<c:out value="${sessionScope.player.getName()}"/>

	<div>GifHangmana</div>

	<div class="TableCss">
		<table border="2">

			<tr>
				<th>ID</th>
				<th>HighScore</th>
			</tr>


		</table>
	</div>

	<div class="PlayerInfo">
		<table border="2">


			<tr>
				<th>Name</th>
				<th>Gender</th>
				<th>DateOfBirth</th>
			</tr>

			
				<tr>
					<td>${player.getName()}</td>
					<td>${player.getGender() }</td>
					<td>${player.getDob() }</td>

				</tr>

			



		</table>

	</div>

 
    <form action="../WordServlet">
	<input  type="image" src="../Images/play.png" width="100" height="20">
	</form>

</body>
</html>