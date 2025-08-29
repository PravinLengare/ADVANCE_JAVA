package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;

public class UserDaoImpl implements UserDao {
    
    @Override
    public boolean isValidUser(String username, String password) {
    	System.out.println("Trying login with: [" + username + "] / [" + password + "]");
    	
        String query = "SELECT * FROM user_details WHERE username = ? AND password = ?";
        
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Query executed successfully!");
            return resultSet.next(); // true if a row is found

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean addUser(User user) {
    	String query = "INSERT INTO user_details(username ,email,password) VALUES(?,?,?)";
    	
    	 try (Connection connection = DBUtil.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getEmail());
                preparedStatement.setString(3, user.getPassword());
                

                int affectedRow = preparedStatement.executeUpdate();

                System.out.println("Query executed successfully!");
                return affectedRow > 0; // true if a row is > 0

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    	
    }
    public boolean validEmail(String email) {
    	String query = "SELECT * FROM user_details WHERE email = ?";
    	try(Connection connection = DBUtil.getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(query)){
    		
    		preparedStatement.setString(1,email);
    		ResultSet resultSet = preparedStatement.executeQuery();
    		return resultSet.next();
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    		return false;
    	}
    }
    
    public boolean updatePassword(String email,String password) {
    	
    	String query = "UPDATE user_details SET password = ? WHERE email = ?";
    	try(Connection connection = DBUtil.getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(query)){
    		
    		
    		preparedStatement.setString(1, password);
    		preparedStatement.setString(2, email);
    		int rowAffected = preparedStatement.executeUpdate();
    	
    		return rowAffected > 0;
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    		return false;
    		
    	}
    }
}
