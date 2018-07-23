package com.alison.mybatis.mapper;

import java.util.List;

import com.alison.mybatis.pojo.Role;

public interface RoleMapper {
	
	public int insertRole(Role role);
	
	public int deleteRole(Long id);
	
	public int updateRole(Role role);
	
	public Role getRole(long id);
	
	public List<Role> findRoles(String Rolename);
}
