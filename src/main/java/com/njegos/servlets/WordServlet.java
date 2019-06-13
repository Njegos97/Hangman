package com.njegos.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.njegos.dao.WordDao;
import com.njegos.entites.Word;

/**
 * Servlet implementation class WordServlet
 */
public class WordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		WordDao wordDao = new WordDao();
		Word word = null;
		word = wordDao.getWord();
		
		
		
		if(word != null) {
			HttpSession session = request.getSession();
			session.setAttribute("word", word);
			response.sendRedirect("html/Game.jsp");
		}
		
		else {
			request.getRequestDispatcher("html/Profile.jsp").include(request, response);
		}
	}

}
