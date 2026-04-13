package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	 String query = "SELECT * FROM user_details WHERE username = ? AND password = ?";
	 String url = "jdbc:postgresql://localhost:5432/users";
	 String username = "postgres";
	 String password = "Pravin@123";
	public boolean isValidUser(String username,String password) {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(url,username,password);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Query executed successfully!");
            return resultSet.next();
			
		}
		catch(Exception e) {
			e.printStackTrace();
            return false;
		}
		
	}
}
