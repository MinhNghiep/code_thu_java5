<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="login-form" action="create" method="post">
		<label for="username">Username:</label> <input type="text"
			id="username" name="username"><br> <label for="password">Password:</label>
		<input type="password" id="password" name="password" value="${user.password }"><br>
		<input type="checkbox" id="check" name="remember"><label
			for="check">REMEMBER ME?</label> <br>
		<button type="submit">Login</button>
	</form>
</body>
</html>