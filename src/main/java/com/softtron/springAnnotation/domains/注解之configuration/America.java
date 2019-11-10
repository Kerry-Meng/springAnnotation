package com.softtron.springAnnotation.domains.注解之configuration;

import org.springframework.stereotype.Component;

@Component
public class America extends Country<Integer> {
	
	public America() {
		super.code = 777;
	}
}
