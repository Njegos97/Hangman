package com.njegos.model;

import com.njegos.entites.Player;
import com.njegos.entites.Word;

public class GamePlay {

	public static Word guess(Word word, String letter) {
		int countMistakes = word.getPoints();
		String guessWord = word.getStarName();
		char[] wordCharacters = guessWord.toCharArray();
		


		for (int i = 0; i < word.getWordName().length(); i++) {
			char lett = word.getWordName().charAt(i);
			

		 if (letter.equals(Character.toString(lett))) {
				
			  wordCharacters[i] = lett;
			  }
			

		}
		
		if (!word.getWordName().contains(letter)) {
			countMistakes -= 10;

			word.setPoints(countMistakes);
		}
		
		word.getUsedLetters().add(letter);
 
		guessWord = String.valueOf(wordCharacters);
		word.setStarName(guessWord);

		return word;
	}
	
	public static boolean updateHighScore(Player player, int possibleHighScore) {
		
		if(possibleHighScore > player.getHighScore()) {
			player.setHighScore(possibleHighScore);
			return true;
		}
		
		return false;
	}
	
	public static boolean checkLogin(Player player, String username, String password) {
		if(player.getName().equals(username) && player.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
	
	

}
