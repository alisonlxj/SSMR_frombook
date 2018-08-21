package com.alisonOther.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanUtils implements InvocationHandler{
	
	private Object obj;
	private Intercepter intercepter = null;
	
	public static Object getBean(Object obj, Intercepter intercepter){
		ProxyBeanUtils _this = new ProxyBeanUtils();
		_this.obj = obj;
		_this.intercepter = intercepter;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), _this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		
		Object retObj = null;
		boolean exceptionFlag = false;
		intercepter.before(obj);
		try{
			retObj = method.invoke(obj, args);
		}catch(Exception ex){
			exceptionFlag = true;
		}finally{
			intercepter.after(obj);
		}
		
		if(exceptionFlag){
			intercepter.afterThrowing(obj);
		}else{
			intercepter.afterReturning(obj);
		}
		
		return retObj;
	}
	
	
	
}
