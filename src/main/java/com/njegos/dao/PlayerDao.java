package com.njegos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.njegos.entites.Player;

public class PlayerDao {

	public  void SignUpPlayer(String name, String password,  
			String gender) {
		Connection connection = ConnectionManager.getInstance().getConnection();
		String sql = "INSERT INTO hangman.players(name, password, gender) VALUES(?, ?, ?)";
		
		try(PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, gender);
			
			
			
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
				player.setName(rs.getString("name"));
				player.setPassword(rs.getString("password"));
				player.setGender(rs.getString("gender"));
				
				return player;
			}
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Wrong username or password");
		}
		
		return null;
	}
	
	
//	public Player getPlayerInfo(Player player) {
//		
//	}
}
