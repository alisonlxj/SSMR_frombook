package com.alison.ssm.pojo;

public class User {
	
	private int id;
	private String name;
	private String password;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim() ;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		return "User_"+id+": 姓名是"+name+", 年纪是"+age+"--><";
	}
	
}
