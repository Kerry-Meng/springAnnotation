package com.softtron.springAnnotation.domains.注解之configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = {"com.softtron"})
public class Init {
	
	@Bean(name = "user", initMethod = "init", destroyMethod = "destroy")
	@Order(2)
	public TUser getUser() {
		return new TUser("xiaoming", "123456");
	}
	
	@Bean(name = "user2", initMethod = "init", destroyMethod = "destroy")
	@Order(1)
	public TUser getUser2() {
		return new TUser("xiaozhang", "2220");
	}
	
//	@Bean(name = "banji")
//	public String getBanji() {
//		return "六班";
//	}
	
	@Bean(name = "banji2")
	@Primary
	public String getBanji2() {
		return "三班";
	}
	
}
