package com.njegos.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.njegos.dao.PlayerDao;

/**
 * Servlet implementation class SignUpServlet
 */


public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		String gender = request.getParameter("gender");
		
		PlayerDao signUp = new PlayerDao();
		
		signUp.SignUpPlayer(name, password, gender);
		
	
		
		response.sendRedirect("html/Login.jsp");
		
		
	}
	
	

}
