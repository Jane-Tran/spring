package com.huytran;

public class ClientA implements Client {
	private Service service;

	public ClientA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void doSomething() {
		String info = service.getInfo();
		System.out.println(info);
	}

}
