package com.softtron.spring.domains.自定义qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Banji {
	
	@Autowired
	@Genre("yiban")
	private String banji;
	
	public Banji() {
		super();
	}
	
	public Banji(String banji) {
		super();
		this.banji = banji;
	}
	
	@Override
	public String toString() {
		return "Banji [banji=" + banji + "]";
	}
	
}
