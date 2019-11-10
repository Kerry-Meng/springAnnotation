package com.softtron.springAnnotation.监听事件;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener implements ApplicationListener<TUser> {
	
	@Override
	public void onApplicationEvent(TUser event) {
		System.out.println("用户名" + event.getUsername() + "密码" + event.getPassword());
	}
	
}
