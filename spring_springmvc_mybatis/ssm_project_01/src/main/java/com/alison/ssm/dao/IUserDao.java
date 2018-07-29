package com.alison.ssm.dao;

import java.util.List;
import java.util.Map;

import com.alison.ssm.pojo.User;

public interface IUserDao {
	
	public User queryByPrimaryKey(Integer id);
	
	public List<User> queryUserByBatch(Map<String, Object> params);
	
	public void insertUser(User user);
	
	public void insertUserByBatch(List<User> users);
	
	public void deleteByPrimaryKey(Integer id);
	
	public void deleteUserByBatch(Map<String,Object> params);
	
	public void updateByPrimaryKey(Integer id);
	
	public List<User> getAllUser();
	
}
