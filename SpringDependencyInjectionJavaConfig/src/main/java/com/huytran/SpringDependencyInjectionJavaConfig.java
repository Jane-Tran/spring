package com.huytran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDependencyInjectionJavaConfig {

	public static void main(String[] args) {
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(JavaConfig.class,JavaConfig2.class);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(JavaConfig.class);
		appContext.register(JavaConfig2.class);
		
		appContext.refresh();
		
		Client client = (Client) appContext.getBean("client1");
		client.doSomething();
		
		Service service = (Service) appContext.getBean("serviceZ");
		System.out.println(service.getInfo());
		
		Client clienta = (Client) appContext.getBean("clienta");
		clienta.doSomething();
		
		Service serviceX = (Service) appContext.getBean("hihi");
		System.out.println(serviceX.getInfo());
	}

}
