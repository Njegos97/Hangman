package com.njegos.entites;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor


public class Player {

	private int id;
	private String name;
	private String password;
	private String dob;
	private String gender;
	ArrayList<Integer> Scores;
	
	
	public String getUsername() {
		return name;
	}
}
