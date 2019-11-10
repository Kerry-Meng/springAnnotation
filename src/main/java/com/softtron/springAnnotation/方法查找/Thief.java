package com.softtron.springAnnotation.方法查找;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thief")
@Scope("prototype")
public class Thief {
	
	private String name;
	
	public Thief() {
		this.name = UUID.randomUUID().toString();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
