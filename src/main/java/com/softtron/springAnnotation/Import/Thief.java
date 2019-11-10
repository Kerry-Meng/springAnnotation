package com.softtron.springAnnotation.Import;

import java.util.UUID;

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
