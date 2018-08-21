package com.alisonOther.aop;

public class GameMain {
	
	public static void main(String[] args){
		RoleService roleService = new RoleServiceImpl();
		Intercepter intercepter = new RoleIntercepter();
		
		RoleService roleProxy = (RoleService)ProxyBeanFactory.getBean(roleService, intercepter);
		
		Role role = new Role(1, "alison", "just_for_trying");
		roleProxy.printRole(role);
		
		System.out.println("************");
		role = null;
		roleProxy.printRole(role);
		
	}
	
}
