package springAnnotation;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softtron.springAnnotation.方法查找.Init;
import com.softtron.springAnnotation.方法查找.Police;

public class LookUpMethodTest {
	
	@Test
	public void test() {
		AnnotationConfigApplicationContext aContext = new AnnotationConfigApplicationContext(Init.class);
		Police police = (Police) aContext.getBean("police");
		System.out.println(police.getThief().getName());
		System.out.println(police.getThief().getName());
		System.out.println(police.getThief().getName());
	}
	
}
