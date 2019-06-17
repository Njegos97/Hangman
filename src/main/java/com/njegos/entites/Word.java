package com.njegos.entites;

import java.util.ArrayList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Word {

	private int id;
	private String wordName;
	private String starName = "";
	private String guessWord;
	private int Points = 60;
	ArrayList<String> usedLetters = new ArrayList<>();
	
	

//	public static Word withPattern() {
//		Word word = new Word();
//		
//		return word;
//	}
	
	
	
	
	
}
