package com.softtron.springAnnotation.domains.注解之configuration;

import org.springframework.stereotype.Component;

@Component
public class China extends Country<String>{
	
	public China() {
		super.code = "666";
	}

}
