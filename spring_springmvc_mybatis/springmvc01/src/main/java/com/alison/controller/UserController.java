package com.alison.controller;


import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alison.pojo.User;
import com.alison.service.IUserService;


/**
 * 
 * @author lixj-l
 * 
 * springmvc中User资源的控制器
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

	@RequestMapping("/userList")
	public String userList(HttpServletRequest request, Model model){
		List<User> users = userService.getAllUsers();
		model.addAttribute("userList", users);
		return "userList";
	}
	
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request, Model model){
		int id = Integer.parseInt(request.getParameter("id"));
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request, Model model){
		System.out.println("***************");
		System.out.println("进入addUser函数");
		
		Enumeration<String> em = request.getParameterNames();
		System.out.println(em.hasMoreElements());
		while(em.hasMoreElements()){
			System.out.println(111);
			String s = em.nextElement();
			System.out.println(s);
		}
		
		Map<String, String[]> maps = request.getParameterMap();
		
		for(Map.Entry<String, String[]> entry : maps.entrySet()){
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
		
		System.out.println(request.getParameterMap());
		User user = new User();
		System.out.println("User--->"+ user);
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));
		userService.addUser(user);
		model.addAttribute("user", user);
		return "redirect:userList";
	}
	
}



