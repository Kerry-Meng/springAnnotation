package springAnnotation;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softtron.springAnnotation.domains.注解之configuration.Init;


public class AnnotationTest {
	
	@Test
	public void test() {
		// 用xml的方式进行获取bean
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("annotation.xml");
		// System.out.println(context.getBean("tUser"));
		
		// 用注解的方式从容器中获取bean
		AnnotationConfigApplicationContext aContext = new AnnotationConfigApplicationContext(Init.class);
		System.out.println(Arrays.toString(aContext.getBeanDefinitionNames()));
		System.out.println(aContext.getBean("banji"));
//		aContext.registerShutdownHook();
	}
	
}
