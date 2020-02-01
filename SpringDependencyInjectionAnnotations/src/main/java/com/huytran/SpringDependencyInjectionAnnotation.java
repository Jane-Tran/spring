package com.huytran;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDependencyInjectionAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("com.huytran");
		appContext.refresh();
		
		Client client = (Client) appContext.getBean("client1");
		client.doSomething();
		
		Service service = (Service) appContext.getBean("service1");
		System.out.println(service.getInfo());
	}

}
