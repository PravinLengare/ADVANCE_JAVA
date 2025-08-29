<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reset password</title>
<link rel="stylesheet" href="style1.css">
</head>
<body>
<div class="container">
    <form action="ResetPassword" method="post">
        <h1>Reset Password</h1>

        <!-- hidden field to carry email from query parameter -->
        <input type="hidden" name="email" value="<%= request.getParameter("email") != null ? request.getParameter("email") : "" %>" />

        New Password: <input type="password" name="password" required />
        <button type="submit">Reset Password</button>
    </form>
</div>
</body>
</html>