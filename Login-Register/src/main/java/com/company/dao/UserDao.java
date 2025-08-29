package com.company.dao;

public interface UserDao {

	public boolean isValidUser(String username, String password);

	public boolean addUser(User user);

	public boolean validEmail(String email);

	public boolean updatePassword(String email,String password);


}
