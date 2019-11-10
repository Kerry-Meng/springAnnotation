package com.softtron.springAnnotation.方法查找;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("police")
public class Police {
	
	@Autowired
	@Qualifier("thief")
	private Thief thief;
	
	@Lookup("thief")
	public Thief getThief() {
		return thief;
	}
	
	public void setThief(Thief thief) {
		this.thief = thief;
	}
	
}
