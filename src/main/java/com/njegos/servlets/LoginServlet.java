package com.njegos.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.njegos.dao.PlayerDao;
import com.njegos.entites.Player;

/**
 * Servlet implementation class LoginServlet
 */


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		PlayerDao pDao = new PlayerDao();
		Player player = new Player();
		player.setName(name);
		player.setPassword(password);
		
		HttpSession session = request.getSession();
		session.setAttribute("player", player);
		
		if(pDao.getPlayer(player) != null) {
			
			response.sendRedirect("html/Profile.jsp");
		}
		else {
			response.sendRedirect("html/Login.jsp");
		}
	}

}
