package com.softtron.spring.domains.resources;

import org.springframework.stereotype.Component;

@Component
public class TBanji {
	
	private String name;
	
	public TBanji() {
		setName("yiban");
	}
	
	public TBanji(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "TBanji [name=" + name + "]";
	}
	
}
