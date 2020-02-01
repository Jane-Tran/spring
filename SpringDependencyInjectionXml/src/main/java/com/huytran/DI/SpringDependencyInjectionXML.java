package com.huytran.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyInjectionXML {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Client client = (Client) appContext.getBean("client");
		client.doSomething();
	}

}	
