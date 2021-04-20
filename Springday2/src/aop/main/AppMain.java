package aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		ShapeServices shapeService = context.getBean("shapeService",ShapeServices.class);
		System.out.println(shapeService.getCircle().getName());
	}

}
