package com.alison.mybatis.main;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.alison.mybatis.mapper.RoleMapper;
import com.alison.mybatis.pojo.Role;
import com.alison.mybatis.utils.SqlSessionFactoryUtils;

public class Test_main {
	
	static SqlSession session = null;
	static Logger log = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		log = Logger.getLogger(Test_main.class);
		
		try{
			session = SqlSessionFactoryUtils.openSqlSession();
			
			RoleMapper roleMapper = session.getMapper(RoleMapper.class);
			int insert1 = roleMapper.insertRole(new Role(3,"actor333","第san次插入"));
			log.info("开始休眠线程");
			Thread.sleep(1000);
			int insert2 = roleMapper.insertRole(new Role(2,"actress","第二次插入"));
			log.info("成功插入");
			Role role = roleMapper.getRole(1);
			
			log.info("成功找到了"+ role);
			
			int del = roleMapper.deleteRole(1);
			log.info("成功删除了id=1的数据");
			List<Role> roles = roleMapper.findRoles("ac");
			log.info("成功找到了"+ roles);
		}finally{
			if(session != null){
				session.close();
			}
		}
		
		
	}

}
