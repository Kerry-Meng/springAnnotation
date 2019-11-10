package springAnnotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softtron.springAnnotation.监听事件.Init;
import com.softtron.springAnnotation.监听事件.UserService;

public class AppListenerTest {
	
	@Test
	public void test() {
		AnnotationConfigApplicationContext aContext = new AnnotationConfigApplicationContext();
		aContext.register(Init.class);
		aContext.refresh();
		UserService userService = (UserService) aContext.getBean("user");
		userService.Login("admin", "666");
		aContext.registerShutdownHook();
	}
	
}
