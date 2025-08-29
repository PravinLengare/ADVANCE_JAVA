<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos Page</title>
</head>
<body>

	<iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM?si=iNXzLz7b_-jvuWNQ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		/* response.setHeader("Pragma", "no-cache"); // For HTTP/1.0
		response.setHeader("Expires", "0");       // Proxies */
		
	
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	
	%>
</body>
</html>