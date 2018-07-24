package com.alison.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * @author alison
 *
 * 3点：
 * 	1、对这个Class进行上锁lock，保持同步状态
 * 	2、构造函数私有，开发getinstance方法获得实例，，单例模式
 * 	3、直接在openSession()函数中 获得工厂类，并获得会话session
 */
public class SqlSessionFactoryUtils {
	
	private final static Class<SqlSessionFactoryUtils> clazz = SqlSessionFactoryUtils.class;
	private static SqlSessionFactory ssf = null;
	
	private SqlSessionFactoryUtils(){}
	
	private static SqlSessionFactory getSqlSessionFactory(){
		synchronized (clazz) {
			if(ssf != null){
				return ssf;
			}
			String resource = "mybatis-config.xml";
			InputStream is;
			try{
				is = Resources.getResourceAsStream(resource);
				ssf = new SqlSessionFactoryBuilder().build(is);
			}catch(IOException e){
				e.printStackTrace();
				return null;
			}
			return ssf;
		}
	}
	
	public static SqlSession openSqlSession(){
		if (ssf == null){
			ssf = getSqlSessionFactory();
		}
		return ssf.openSession();
	}
	
}









