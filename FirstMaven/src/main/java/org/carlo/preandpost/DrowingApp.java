package org.carlo.preandpost;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrowingApp {
	
    private static AbstractApplicationContext context;

	public static void main( String[] args ) {    	
    	
    	//BeanFactory factory = new  XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	
    	Triangle triangle = (Triangle) context.getBean("triangle");
    	
    	triangle.drow();
    	
    	triangle.setPointA(new Point(33, 33));
    	
    	triangle.drow();
    	
    	
    	
    }
}
