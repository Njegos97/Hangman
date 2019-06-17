package com.njegos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.njegos.entites.Word;

public class WordDao {

	public Word getWord() {
		Connection connection = ConnectionManager.getInstance().getConnection();
		String sql = "SELECT * FROM hangman.words ORDER BY RAND() LIMIT 1";
		
		
		
		// select * from words odrer by rand() limit 1
		try(PreparedStatement ps = connection.prepareStatement(sql)) {
			
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
