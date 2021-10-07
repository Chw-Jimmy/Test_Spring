package com.jimmy.bean;


public class User {
	
//这里是value值注入
	private int u_id;
	private String u_username;
	private String u_password;

	private Pet u_pet;



	public User(String u_username, Pet u_pet) {
		System.out.println("方法1 String pet");
		this.u_username = u_username;
		this.u_pet = u_pet;
	}

	public User(Integer u_username, Pet u_pet) {
		System.out.println("方法2 integer pet");
		this.u_username = u_username.toString(); //不能从integer类型转换为String类型
		this.u_pet = u_pet;
	}

	public User(Pet u_pet,Integer u_username) {
		System.out.println("方法3 pet integer ");
		this.u_username = u_username.toString(); //不能从integer类型转换为String类型
		this.u_pet = u_pet;
	}
	public User() {
		System.out.println("User对象空参构造方法");
	}

	public Pet getU_pet() {
		return u_pet;
	}


	public void setU_pet(Pet u_pet) {
		this.u_pet = u_pet;
	}

	public int getU_id() {
		return u_id;
	}


	public void setU_id(int u_id) {
		this.u_id = u_id;
	}


	public String getU_username() {
		return u_username;
	}


	public void setU_username(String u_username) {
		this.u_username = u_username;
	}


	public String getU_password() {
		return u_password;
	}


	public void setU_password(String u_password) {
		this.u_password = u_password;
	}


	public String toString() {
		String msg = "u_id"+":"+this.u_id+":"+"u_username"+":"+this.u_username+":"+"u_password"+":"+this.u_password+":"+"u_pet"+":"+this.u_pet;
		return msg;
	}


	public void userInit(){		
		System.out.println("这是init初始化方法");
	}

	public void userDestroy(){		
		System.out.println("这是销毁方法");
	}

}
