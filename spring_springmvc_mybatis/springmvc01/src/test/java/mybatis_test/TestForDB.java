package mybatis_test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alison.mapper.UserMapper;
import com.alison.pojo.User;

public class TestForDB {
	
	private static ApplicationContext ac;
	
	static{
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static void main(String[] args){
		UserMapper um = (UserMapper)ac.getBean(UserMapper.class);
		User user = um.getUser(1);
		System.out.println(user);
		List<User> users = um.listUsers();
		System.out.println(users);
	}
	
}
