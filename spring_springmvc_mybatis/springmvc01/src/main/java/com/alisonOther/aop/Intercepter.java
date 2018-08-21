package com.alisonOther.aop;

public interface Intercepter {
	
	public void  before(Object obj);
	
	public void  after(Object obj);
	
	public void  afterReturning(Object obj);
	
	public void  afterThrowing(Object obj);
	
}