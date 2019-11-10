package com.softtron.springAnnotation.domains.注解之configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("banji") // 将banji这个类交给容器去进行初始化
public class Banji {
	
	@Autowired // 自动装配，根据类型进行
	private TUser[] users;
	@Autowired
	private List<TUser> userList;
	@Autowired
	private Set<TUser> userSet;
	@Autowired
	private Map<String, TUser> userMap;
	
	
	@Override
	public String toString() {
		return "Banji [userMap=" + userMap + "]";
	}
	
	// @Override
	// public String toString() {
	// return "Banji [users=" + Arrays.toString(users) + "]";
	// }
	
}
