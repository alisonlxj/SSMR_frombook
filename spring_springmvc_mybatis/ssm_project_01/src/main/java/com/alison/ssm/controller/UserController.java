package com.alison.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alison.ssm.pojo.User;
import com.alison.ssm.service.IUserService;



@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;    
	
	@RequestMapping("/userList")
	public String userList(HttpServletRequest request,Model model){
		List<User> uList = userService.getAllUser();    
        model.addAttribute("uList", uList);    
        return "userList";  
	}
	
}









