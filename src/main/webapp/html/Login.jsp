<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link href="../css/LoginCss.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<div class="LoginCss">
		<fieldset>
			<legend>Login</legend>
			<form action="../LoginServlet" method="post">
				<div class="name">
					Name: <input type="text" name="username" placeholder="username"
						size="15px">
				</div>
				<div class="pass">
					Password: <input type="password" name="password"
						placeholder="password" size="15px">
				</div>
				<input type="submit" value="Login">
			</form>
		</fieldset>
	</div>
</body>
</html>