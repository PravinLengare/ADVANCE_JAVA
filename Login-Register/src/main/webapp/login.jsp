<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" href="style1.css">
</head>
<body>
	<div class="container">
	     <h1>Login</h1>
		 <form action="LoginServlet" method="post">
		    <label>Username:</label>
		    <input type="text" name="username" required><br>
		    <label>Password:</label>
		    <input type="password" name="password" required><br><br>
		     
		    <button type="submit">Login</button>
		</form>
		<p><a href="fpassword.jsp"> Forgot password </a> </p>
        <p> <a href="index.html">Back to Home</a> </p>
        
      </div>
        
        
         <%-- Display error message if login fails --%>
        <% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
                <p style="color: red;">Invalid username or password. Please try again.</p>
        <% } %>
        
         <%-- Display error message if Register Successful --%>
        <% String rs = request.getParameter("registration");
            if (rs != null && rs.equals("success")) { %>
                <p style="color: black;"><h3>Your Registration is Successful ! Please Login.</h3></p>
        <% } %>
</body>
</html>