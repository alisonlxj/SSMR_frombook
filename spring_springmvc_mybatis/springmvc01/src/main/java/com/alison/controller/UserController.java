package com.alison.controller;


import java.util.List;

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
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	
	private IUserService userService;
	
	@RequestMapping("/userList")
	public String userList(HttpServletRequest request, Model model){
		List<User> users = userService.getAllUsers();
		model.addAttribute("userList", users);
		return "userList";
	}
	
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request, Model model){
		int id = Integer.parseInt(request.getParameter("id"));
		model.addAttribute("id", id);
		return "showUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request, Model model){
		User user = new User();
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setName(request.getParameter("age"));
		user.setPassword(request.getParameter("age"));
		userService.addUser(user);
		model.addAttribute("user", user);
		return "redirect:user/userList";
	}
	
}



