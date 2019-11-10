package com.softtron.springAnnotation.domains.注解之configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class TUser {
	
	private String username;
	private String password;
	private String banji;
	@Autowired
	private Country<Integer> country;
	
	public TUser() {
		super();
	}
	
	@Autowired
	public TUser(String banji) {
		this.banji = banji;
		System.out.println("构造器" + banji);
	}
	
	public TUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getBanji() {
		return banji;
	}
	
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	@Override
	public String toString() {
		return "TUser [username=" + username + ", password=" + password + ", banji=" + banji + ", country=" + country
				+ "]";
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
	
	// @Autowired
	// @Qualifier(value = "banji")
	// public void test(String banji) {
	// this.banji = banji;
	// System.out.println("test" + banji);
	// }
}
