package com.njegos.model;

import java.util.ArrayList;

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
	
	

}
