<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@include file="SignUp.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/SignUpCss.css" type="text/css" rel="stylesheet" />
</head>
<body>
<div class="faild">
<h1>
<c:out value="${sessionScope.name}"></c:out>
Username already taken</h1>
</div>

</body>
</html>