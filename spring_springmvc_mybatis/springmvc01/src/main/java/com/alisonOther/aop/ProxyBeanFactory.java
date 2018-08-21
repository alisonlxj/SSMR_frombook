package com.alisonOther.aop;

public class ProxyBeanFactory {
	
	public static <T> T getBean(T obj, Intercepter intercepter) {
		return (T) ProxyBeanUtils.getBean(obj, intercepter);
	}
	
}
