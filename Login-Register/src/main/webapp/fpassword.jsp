<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forgot password</title>
<link rel="stylesheet" href="style1.css">
</head>
<body>
<div class = "container">
<h1>Forgot Password</h1>
	<form action = "ForgotPasswordServlet" method = "post">
		    <label>Email:</label>
		    <input type="email" name="email" required><br>
		     
		    <button type="submit">Reset Password</button>
	</form>
</div>
</body>
</html>