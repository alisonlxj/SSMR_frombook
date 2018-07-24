package com.alison.mybatis.pojo;

public class Role {
	
	private int id;
	private String roleName;
	private String note;
	
	//pojo类必须至少有默认的空构造函数！！否则mapper容易无法匹配，类型无法转换 
	public Role(){}	
	
	public Role(int id, String roleName, String note){
		this.id = id;
		this.roleName = roleName;
		this.note = note;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public String toString(){
		return "id:"+ id +",roleName:"+ roleName +",note:"+ note;
	}
	
}
