package com.softtron.spring.domains.customAutowireConfigurer;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RUNTIME)
@Target(TYPE)
@Qualifier
public @interface Me {
	
}
