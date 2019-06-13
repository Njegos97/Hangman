package com.njegos.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.njegos.entites.Word;
import com.njegos.model.GamePlay;

/**
 * Servlet implementation class GuessServlet
 */
public class GuessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String letter = request.getParameter("letter");
		
	    HttpSession session = request.getSession();
	    Word word = (Word) session.getAttribute("word");
		
		GamePlay.guess(word, letter);
		
		if(word.getMistakes() == 6) {
			response.sendRedirect("html/GameOverPage.jsp");
		}
		else {
			response.sendRedirect("html/Game.jsp");
		}
		
		
		
	}

}
