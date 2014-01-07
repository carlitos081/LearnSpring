package org.carlo.firstMaven;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	private static AbstractApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		context = new ClassPathXmlApplicationContext("spring.xml");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	//@Test
	public void testSingleton() {
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		Triangle triangle1 = (Triangle) context.getBean("triangle");
		
		
		assertTrue(triangle == triangle1);
		
		assertTrue(triangle.getPointA() == triangle1.getPointA());
		
	}
	
	@Test
	public void testInitAndDestroyMethod(){
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.drow();
	}

}
