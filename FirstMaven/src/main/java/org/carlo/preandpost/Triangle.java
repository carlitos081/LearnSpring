package org.carlo.preandpost;

import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
	
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	@SuppressWarnings("unused")
	private ApplicationContext applicationContext;
	
	
	public void drow(){
		System.out.println("I'm a "+toString());	 
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		
		this.applicationContext = applicationContext;
		
	}
	

	public void setBeanName(String name) {
		System.out.println("Bean name as: "+name); 
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method");
		 
	}

	public void destroy() throws Exception {
		System.out.println("Destroy method");
		
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}
	
	
}
