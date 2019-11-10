package com.softtron.spring.domains.customAutowireConfigurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TUser {
	
	@Autowired
	@Qualifier
	BanjiInterface banji;
	
	@Override
	public String toString() {
		return "TUser [banji=" + banji.name() + "]";
	}
	
	public BanjiInterface getBanji() {
		return banji;
	}
	
	public void setBanji(BanjiInterface banji) {
		this.banji = banji;
	}
	
}
