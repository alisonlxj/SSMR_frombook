package com.alisonOther.aop;

public class RoleServiceImpl implements RoleService{

	/* (non-Javadoc)
	 * @see com.alisonOther.aop.RoleService#printRole(com.alisonOther.aop.Role)
	 */
	@Override
	public void printRole(Role role) {
		// TODO Auto-generated method stub
		System.out.println("{Role.id="+role.getId()+", Role.rolename="+role.getRoleName()+", Role.note="+role.getNote()+"};");
	}
	
}
