package com.alison.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld_spring {
	@RequestMapping("/hello")
	public String printHello(){
		System.out.println("成功进入了这个CONTROLLER");
		return "hello";
	}
	
}
