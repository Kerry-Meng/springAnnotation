package springAnnotation;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.customAutowireConfigurer.TUser;

public class CustomAutowriedTest {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("customAutowireConfigurer.xml");
//		String[] names = context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(names));
		TUser user = (TUser) context.getBean("TUser");
		System.out.println(user);
	}
	
}
