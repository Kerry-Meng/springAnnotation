package springAnnotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softtron.spring.domains.resources.Init;
import com.softtron.spring.domains.resources.TUser;

public class ResourcesTest {
	
	@Test
	public void test() {
		AnnotationConfigApplicationContext aContext = new AnnotationConfigApplicationContext(Init.class);
		TUser user = (TUser) aContext.getBean("TUser");
		System.out.println(user.getBanji().getName());
	}
	
}
