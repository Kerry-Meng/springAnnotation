package com.softtron.springAnnotation.监听事件;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service("user")
public class UserService implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void Login(String username, String password) {
		applicationEventPublisher.publishEvent(new TUser(this, username, password));
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
}
