<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	
	
	<%
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	
	%>
	Welcome ${username}
	
	<a href = "videos.jsp" >Videos here</a>
	
	<form action = "Logout" ><br>
		<input type = "submit" value = "Logout"><br>
	</form>
</body>
</html>