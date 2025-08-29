package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl;

/**
 * Servlet implementation class ResetPassword
 */
@WebServlet("/ResetPassword")
public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final UserDao userDao = new UserDaoImpl();
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(userDao.updatePassword(email,password)) {
			//response.getWriter().println("Password Updated Successfully !!");
			response.sendRedirect("login.jsp?msg=Password+Updated+Successfully");
			 
		}
		
		else {
			response.getWriter().println("Error resetting password.");
        }
		
		
		
	}

}
