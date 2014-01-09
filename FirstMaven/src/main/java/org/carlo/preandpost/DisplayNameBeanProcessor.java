package org.carlo.preandpost;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanProcessor implements BeanPostProcessor{

	
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("In BEFORE initializzation of bean: "+beanName); 

		return bean;
	}
	

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("In AFTER initializzation of bean: "+beanName); 

		return bean;
	}

}
