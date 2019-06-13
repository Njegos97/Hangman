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
	private int mistakes = 0;
	ArrayList<String> usedLetters = new ArrayList<>();
	
	

	
	
	
	
	
}
