package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


import com.company.dao.UserDaoImpl;
import com.company.dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private static final UserDao userDao = new UserDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		       String username = request.getParameter("username");
		       String password = request.getParameter("password");
		       	
		        if (userDao.isValidUser(username, password)) {
		            HttpSession session = request.getSession();
		            session.setAttribute("username", username);
		            session.setAttribute("password", password);
		        
		            response.sendRedirect("welcome.jsp");
		            //System.out.println("Hi - "+username);
		        } else {
		            response.sendRedirect("login.jsp?error=1");
		        	System.out.println("Error A gya");
		        }
		        
//		       if(username.equals("amol")) {
//		    	   response.sendRedirect("welcome.jsp");
//		       }
		        

	

}
}
