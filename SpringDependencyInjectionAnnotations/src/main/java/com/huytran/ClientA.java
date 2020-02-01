package com.huytran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client1")
public class ClientA implements Client {
	@Autowired
	private Service service;

//	@Autowired
//	public ClientA(Service service) {
//		super();
//		this.service = service;
//	}

	@Override
	public void doSomething() {
		String info = service.getInfo();
		System.out.println(info);
	}

}
