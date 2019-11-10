package com.softtron.spring.domains.resources;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class TUser {
	
	@Resource
	private TBanji banji;
	
	public TBanji getBanji() {
		return banji;
	}
	
	public void setBanji(TBanji banji) {
		this.banji = banji;
	}
	
}
