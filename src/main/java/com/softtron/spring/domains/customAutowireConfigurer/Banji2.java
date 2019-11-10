package com.softtron.spring.domains.customAutowireConfigurer;

import org.springframework.stereotype.Component;

@Component
@Me
public class Banji2 implements BanjiInterface {
	
	@Override
	public String name() {
		return "banji2";
	}
	
}
