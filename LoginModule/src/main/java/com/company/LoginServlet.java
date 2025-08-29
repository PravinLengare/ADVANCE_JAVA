package com.company;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.company.dao.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 
//		 if(username.equals("pravin") && password.equals("123")) {
//			 HttpSession session = request.getSession();
//			 session.setAttribute("username", username);
//			 response.sendRedirect("welcome.jsp");
//			 
//		 }
		 LoginDao dao = new LoginDao();
		 if(dao.isValidUser(username, password)) {
			 HttpSession session = request.getSession();
			 session.setAttribute("username", username);
			 response.sendRedirect("welcome.jsp");
			 
		 }
		 else {
			 response.sendRedirect("login.jsp");
		 }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}
