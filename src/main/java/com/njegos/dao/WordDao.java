package com.njegos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.njegos.entites.Word;

public class WordDao {

	public Word getWord() {
		Connection connection = ConnectionManager.getInstance().getConnection();
		String sql = "SELECT * FROM hangman.words WHERE (id = ?)";
		
		int randomNumber = (int) (1 + Math.random() * 5);
		
		try(PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, randomNumber);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
			Word word = new Word();
			word.setId(rs.getInt("id"));
			word.setWordName(rs.getString("wordName"));
			word.setStarName(rs.getString("starName"));
			
			return word;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
}
