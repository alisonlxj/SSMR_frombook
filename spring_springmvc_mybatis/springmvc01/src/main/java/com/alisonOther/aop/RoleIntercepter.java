package com.alisonOther.aop;

public class RoleIntercepter implements Intercepter {

	/* (non-Javadoc)
	 * @see com.alisonOther.aop.Intercepter#before(java.lang.Object)
	 */
	@Override
	public void before(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("before:->ready to print!");
	}

	/* (non-Javadoc)
	 * @see com.alisonOther.aop.Intercepter#after(java.lang.Object)
	 */
	@Override
	public void after(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("after:->already print over!");
	}

	/* (non-Javadoc)
	 * @see com.alisonOther.aop.Intercepter#afterReturning(java.lang.Object)
	 */
	@Override
	public void afterReturning(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("returning:->print over,all is right!");
	}

	/* (non-Javadoc)
	 * @see com.alisonOther.aop.Intercepter#afterThrowing(java.lang.Object)
	 */
	@Override
	public void afterThrowing(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("exception:->print encounting an error,please check if the role was null?");
	}
	
	
	
}
