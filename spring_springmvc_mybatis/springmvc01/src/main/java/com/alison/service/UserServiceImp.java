package com.alison.service;

import java.util.List;

import javax.annotation.Resource;

import com.alison.mapper.UserMapper;
import com.alison.pojo.User;


public class UserServiceImp implements IUserService{
	
	@Resource
	private UserMapper userMapper;
	
	
	/* (non-Javadoc)
	 * @see com.alison.service.IUserService#getUserById(int)
	 */
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.getUser(id);
	}

	/* (non-Javadoc)
	 * @see com.alison.service.IUserService#addUser(com.alison.pojo.User)
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.addUser(user);
	}

	/* (non-Javadoc)
	 * @see com.alison.service.IUserService#getAllUsers()
	 */
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.listUsers();
	}

}
