package com.alison.mapper;

import java.util.List;

import com.alison.pojo.User;

public interface UserMapper {
	
	public User getUser(int id);
	
	public List<User> listUsers();
	
}
