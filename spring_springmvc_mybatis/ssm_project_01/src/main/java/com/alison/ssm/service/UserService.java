package com.alison.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alison.ssm.dao.IUserDao;
import com.alison.ssm.pojo.User;

@Service("userService")
public class UserService implements IUserService{
	
	@Resource
	private IUserDao userMapper;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.getAllUser();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.queryByPrimaryKey(id);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insertUser(user);
	}

}
