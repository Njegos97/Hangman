package com.njegos.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.njegos.dao.PlayerDao;
import com.njegos.entites.Player;
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
	    Player player = (Player) session.getAttribute("player");
		
		GamePlay.guess(word, letter);
		
		if(word.getPoints() == 0) {
			response.sendRedirect("html/GameOverPage.jsp");
		}
		
		else if (word.getStarName().equals(word.getWordName())) {
			PlayerDao updateHighScore = new PlayerDao();
			updateHighScore.enterHighScore(word.getPoints(), player.getId(), player);
		    
			
			response.sendRedirect("html/Game.jsp");
		}
		else {
			response.sendRedirect("html/Game.jsp");
		}
		
		
		
	}

}
