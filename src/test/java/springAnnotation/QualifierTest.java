package springAnnotation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.自定义qualifier.Banji;

public class QualifierTest {
	
	@Test
	public void test() {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Banji.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("qualifier.xml");
		Banji banji = (Banji) context.getBean("yiban");
		System.out.println(banji);
	}
	
}
