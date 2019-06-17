package com.njegos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Formatter;

import com.njegos.entites.Player;
import com.njegos.model.GamePlay;

public class PlayerDao {

	public  void SignUpPlayer(String name, String password,  
			String gender, String dob) {
		Connection connection = ConnectionManager.getInstance().getConnection();
		String sql = "INSERT INTO hangman.players(name, password, gender, birthday) VALUES(?, ?, ?, ?)";
		java.sql.Date  date = PlayerDao.formatDate(dob);
		
		
		
		try(PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, gender);
			ps.setDate(4,  date);
			
			
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Player getPlayer(Player player) {
		Connection connection = ConnectionManager.getInstance().getConnection();
		String sql = "Select * FROM hangman.players WHERE (name = ? AND password = ?)";
		
		try(PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, player.getName());
			ps.setString(2, player.getPassword());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next() == true) {
				player.setId(rs.getInt("id"));
				player.setName(rs.getString("name"));
				player.setPassword(rs.getString("password"));
				player.setGender(rs.getString("gender"));
				player.setHighScore(rs.getInt("highscore"));
				
				return player;
			}
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Wrong username or password");
		}
		
		return null;
	}
	
	public void enterHighScore(int highScore, int id, Player player) {
		Connection connection = ConnectionManager.getInstance().getConnection();
		String sql = "UPDATE hangman.players  SET highscore = ? WHERE id = ?";
	
		try(PreparedStatement ps = connection.prepareStatement(sql)) {
		
			if(GamePlay.updateHighScore(player, highScore)) {
			ps.setInt(1, highScore);
			ps.setInt(2, id);
			ps.executeUpdate();
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public Boolean signUpCheck(String name) {
		Connection connection = ConnectionManager.getInstance().getConnection();
		String sql = "SELECT name FROM hangman.players";
		ResultSet rs = null;
		
		try(PreparedStatement ps = connection.prepareStatement(sql)) {
			rs = ps.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("name").equals(name)) {
					return false;
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return true;
	}
	
	public static java.sql.Date  formatDate(String dob) {
		String pattern = "dd/MM/yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
	    try {
	      java.util.Date utilDate = format.parse(dob);
	      java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	      
	      return sqlDate;
	    } catch (ParseException e) {
	      e.printStackTrace();
	    }
	    
	    return null;
	}
	
	
		
	
	
}
