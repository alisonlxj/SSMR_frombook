package com.alison.ssm.service;

import java.util.List;

import com.alison.ssm.pojo.User;

public interface IUserService {

	public List<User> getAllUsers();
	
	public User getUserById(int id);

	public void addUser(User user);

}
