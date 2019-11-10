package com.softtron.spring.domains.customAutowireConfigurer;

import org.springframework.stereotype.Component;

@Component//进行注入，放入容器中
public class Banji1 implements BanjiInterface {
	
	@Override
	public String name() {
		return "banji1";
	}
	
}
